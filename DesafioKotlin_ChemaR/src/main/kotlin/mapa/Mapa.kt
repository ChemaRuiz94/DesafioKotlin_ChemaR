package mapa

import item.Item
import tributos.Tributo
import generaAleatorio

class Mapa(var sectores: ArrayList<ArrayList<Sector>>?) {

    fun add(any: Any) {
        var correcto = false
        do {
            val sector = obtenerSector()

            if (!sector.getOcupado()) {
                if (any is Tributo)
                    sector.addTributo(any)
                else
                    sector.addItem(any as Item)

                correcto = true
            }
        } while (!correcto)
    }

    private fun obtenerSector(): Sector{
        val filaRandom = generaAleatorio(0, Constantes.FILAS - 1)
        val columnaRandom = generaAleatorio(0, Constantes.COLUMNAS - 1)
        return sectores!![filaRandom][columnaRandom]
    }
}