import mapa.FactoriaMapa
import mapa.Mapa
import mapa.Sector

fun simulacion() {



}

fun incicializacionMapa(): Mapa? {
    var filas = pedirEnteroUsuario("Introduce el numero de filas del mapa")
    var columnas = pedirEnteroUsuario("Introduce el numero de columnas del mapa")
    var mapa: Mapa? = FactoriaMapa.factoriaMapa(filas,columnas)
    return mapa
}

fun inicializacionTributos(mapa: Mapa){

}

fun inicializacionItems(mapa:Mapa){


}

fun pintarMapa(mapa:Mapa){

    println("entrando")
    //primer for recorre filas
    for (i in mapa.sectores!!){
        var fil : Int = mapa.sectores!!.indexOf(i)

        //segundo for recorre columnas
        for (j in mapa.sectores!![fil]){
            if(j is Sector){
                var col : Int = mapa.sectores!![fil].indexOf(j)
                print("[ $fil / $col ]")
            }
        }
        println("")
    }
}

