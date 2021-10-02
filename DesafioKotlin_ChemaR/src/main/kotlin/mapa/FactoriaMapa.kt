package mapa

object FactoriaMapa {

    fun factoriaMapa(fila:Int, columna:Int): Mapa {

        var sectores: ArrayList<ArrayList<Sector>>? = ArrayList()

        for (i in 1..fila){
            sectores?.add(factoriaColumna(columna))
        }
        var mapa : Mapa = Mapa(sectores, fila, columna)
        return mapa
    }

    fun factoriaColumna(columna: Int) : ArrayList<Sector>{
        var col : ArrayList<Sector> = ArrayList(columna)

        for (i in 1..columna){
            var s: Sector = Sector()
            col.add(s)
        }
        return col
    }
}