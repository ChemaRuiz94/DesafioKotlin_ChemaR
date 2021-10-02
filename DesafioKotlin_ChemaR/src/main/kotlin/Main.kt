import capitolio.Capitolio
import capitolio.FactoriaCapitolio
import mapa.FactoriaMapa
import mapa.Mapa

fun main() {

    val numFilas = 5
    val numColumnas = 5
    var capitolio: Capitolio = FactoriaCapitolio.factoriaCapitolio()

    //var mapa : Mapa? = incicializacionMapa()
    var mapa : Mapa? = inicializacionCompleta(capitolio)

    if (mapa != null) {
        println("entrnado")
        pintarMapa(mapa)
    }
    println("fin")
}