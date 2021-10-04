import capitolio.Capitolio
import capitolio.FactoriaCapitolio
import mapa.FactoriaMapa
import mapa.Mapa
import simulacion.simulacion

fun main() {

    var capitolio: Capitolio = FactoriaCapitolio.factoriaCapitolio()

    var mapa: Mapa = inicializacionCompleta(capitolio)

    pintarMapa(mapa)
    simulacion(mapa)

    println("fin")
}