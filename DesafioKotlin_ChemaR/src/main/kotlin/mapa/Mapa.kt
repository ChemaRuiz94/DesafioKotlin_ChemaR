package mapa

import capitolio.Capitolio
import item.Item
import tributos.Tributo
import generaAleatorio
import generarNuevaPosi

class Mapa(var sectores: ArrayList<ArrayList<Sector>>?, var capitolio: Capitolio) {

    private var tributosVivos = ArrayList<Tributo>()


    fun add(any: Any) {
        var correcto = false
        do {
            var filaRandom = generaAleatorio(0, Constantes.FILAS - 1)
            var columnaRandom = generaAleatorio(0, Constantes.COLUMNAS - 1)
            var sector = sectores!![filaRandom][columnaRandom] //sector random donde posicionamos al tributo

            //Estas tres lineas cambiar a indexOf

            if (!sector.getOcupado() && !sector.getOcupadoItems()) {
                if (any is Tributo) {
                    any.setColumna(columnaRandom)
                    any.setFila(filaRandom)
                    sector.addTributo(any)
                } else {
                    sector.addItem(any as Item)
                }
                correcto = true
            }
        } while (!correcto)
    }

    private fun obtenerSector(): Sector {
        val filaRandom = (0 until Constantes.FILAS).random()
        val columnaRandom = (0 until Constantes.COLUMNAS).random()
        return sectores!![filaRandom][columnaRandom]
    }

    fun rellenarItems() {
        var correcto = false

        if (capitolio.items.size > 0) {
            if (comprobarSectorVacioItems()) {
                val item = capitolio.enviarItems()
                do {
                    val sector = obtenerSector()

                    if (!sector.getOcupado() && !sector.getOcupadoItems()) {
                        sector.addItem(item)
                        correcto = true
                    }
                } while (!correcto)
            } else {
                println("CAPITOLIO -> No quedan sectores vacios para soltar items")
            }
        } else {
            println("CAPITOLIO -> No quedan items en el capitolio")
        }


    }


    fun comprobarTributosVivos() {

        this.tributosVivos = ArrayList<Tributo>()

        sectores!!.forEach { i ->

            i.forEach { j ->
                if (j.getOcupado() && j.getTributos()?.vida!! > 0)
                    this.tributosVivos.add(j.getTributos()!!)
                Thread.sleep(50)
            }
        }
    }

    fun getTributosVivos(): ArrayList<Tributo> {
        return this.tributosVivos
    }


    fun comprobarSector(tributo: Tributo) {

        val filaOld = tributo.getFila()
        val columnaOld = tributo.getColumna()

        generarNuevaPosi(tributo)
        //println("EL TRIBUTO ${tributo.numeroTributo} SE HA DESPLAZADO A UNA CASILLA ADYACENTE")

        val filaNew = tributo.getFila()
        val columnaNew = tributo.getColumna()
        val newSector = this.sectores!![filaNew][columnaNew]
        val tributoIn = newSector.getTributos()

        if (tributoIn != null) {

            tributo.pelear(tributoIn)
            //el tributo que entra gana
            if (tributo.vida > 0) {
                println("EL TRIBUTO -> ${tributo.numeroTributo} HA MATADO AL TRIBUTO -> ${tributoIn.numeroTributo}")
                accederSector(filaOld, columnaOld, tributo, newSector)
                capitolio.addMuerto(tributoIn)

                //el tributo que entra muere
            } else {
                println("EL TRIBUTO NUMERO-> ${tributoIn.numeroTributo} HA MATADO AL TRIBUTO NUMERO-> ${tributo.numeroTributo}")
                capitolio.addMuerto(tributo)
                sectores!![filaOld][columnaOld].delTributo()
            }
        } else if (newSector.getItem() != null) {

            val item = newSector.getItem()
            tributo.actuarItems(item!!)

            if(tributo.vida==0){
                println("TRAMPA PARA EL TRIBUTO NUMERO ${tributo.numeroTributo}")
                capitolio.addMuerto(tributo)
                sectores!![filaOld][columnaOld].delTributo()
            }else{
                newSector.delItem()
                accederSector(filaOld, columnaOld, tributo, newSector)
            }
        } else {
            accederSector(filaOld, columnaOld, tributo, newSector)
        }
        Thread.sleep(100)
    }

    private fun accederSector(filaOld: Int, columnaOld: Int, tributo: Tributo, newSector: Sector) {
        sectores!![filaOld][columnaOld].delTributo()
        newSector.addTributo(tributo)
    }



    fun comprobarSectorVacioItems(): Boolean {
        var correcto: Boolean
        sectores?.forEach { f ->
            f.forEach { sector ->
                if (!sector.getOcupadoItems() && !sector.getOcupado()) return true
            }
        }
        return false
    }


}