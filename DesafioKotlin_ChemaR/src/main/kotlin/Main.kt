import mapa.FactoriaMapa
import mapa.Mapa

fun main() {

    val numFilas = 5
    val numColumnas = 5


    var mapa : Mapa? = incicializacionMapa()

    if (mapa != null) {
        println("entrnado")
        pintarMapa(mapa)
    }
    println("fin")
}