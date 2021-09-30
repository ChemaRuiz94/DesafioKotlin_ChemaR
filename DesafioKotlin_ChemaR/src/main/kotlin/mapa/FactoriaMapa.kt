package mapa

object FactoriaMapa {

    fun factoriaMapa(fila:Int, columna:Int): Mapa {
        var sector: ArrayList<Array<Sector?>> = ArrayList<Array<Sector?>>()
        for (i in 1..fila){
            sector.add(Array<Sector?>(columna) { null })
        }
        return Mapa(sector)
    }
}