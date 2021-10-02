package mapa

object FactoriaMapa {

    fun factoriaMapa(): Mapa {

        var sectores: ArrayList<ArrayList<Sector>>? = ArrayList()

        repeat(Constantes.FILAS){
            sectores?.add(factoriaColumna())
        }
        var mapa : Mapa = Mapa(sectores)
        return mapa
    }

    fun factoriaColumna() : ArrayList<Sector>{
        val col = ArrayList<Sector>()

        repeat(Constantes.COLUMNAS){
            col.add(Sector())
        }
        return col
    }
}