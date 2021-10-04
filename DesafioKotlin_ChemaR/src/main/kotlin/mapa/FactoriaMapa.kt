package mapa

import capitolio.Capitolio

object FactoriaMapa {

    fun factoriaMapa(capitolio: Capitolio): Mapa {

        var sectores: ArrayList<ArrayList<Sector>>? = ArrayList()

        repeat(Constantes.FILAS){
            sectores?.add(factoriaColumna())
        }

        return Mapa(sectores, capitolio)
    }

    fun factoriaColumna() : ArrayList<Sector>{
        val col = ArrayList<Sector>()

        repeat(Constantes.COLUMNAS){
            col.add(Sector())
        }
        return col
    }
}