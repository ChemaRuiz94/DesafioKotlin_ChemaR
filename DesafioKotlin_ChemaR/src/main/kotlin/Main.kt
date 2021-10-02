import capitolio.Capitolio
import capitolio.FactoriaCapitolio
import mapa.FactoriaMapa
import mapa.Mapa

fun main() {

    var capitolio: Capitolio = FactoriaCapitolio.factoriaCapitolio()

    //var mapa : Mapa? = incicializacionMapa()
    var mapa: Mapa = inicializacionCompleta(capitolio)

    pintarMapa(mapa)

    println("fin")
}