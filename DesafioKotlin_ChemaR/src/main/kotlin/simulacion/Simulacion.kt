package simulacion

import mapa.Mapa
import mapa.Sector
import tributos.Tributo
import generaAleatorio
import pintarMapa

fun simulacion(mapa: Mapa) {
    mapa.comprobarTributosVivos()
    do {
        //cada 2 segundos se mueven los tributos a otra sector
        //Thread.sleep(2000)
        simulacionMover(mapa)

        //Thread.sleep(5000)

        //if (mapa.capitolio.items.size > 0) {
        repeat(4) {
            mapa.rellenarItems()
        }
        //}
        println("\n\n")
        pintarMapa(mapa)
        println("MUERTOS " + mapa.capitolio.getSizeMuertos())
        mapa.comprobarTributosVivos()
    } while (mapa.getTributosVivos().size > 1)

    println("VIVOS " + mapa.getTributosVivos().size)
    mapa.getTributosVivos().forEach { tributo ->
        println(tributo)
    }
    println("FIN SIMULACION")
}

fun simulacionMover(mapa: Mapa) {

    simularMovimiento(mapa)
    pintarMapa(mapa)

}

fun simularMovimiento(mapa: Mapa) {


    val a = mapa.getTributosVivos()

    a.forEach { tributo ->
        if (tributo.vida > 0)
            mapa.comprobarSector(tributo)
    }
}

/*
fun simularMovimiento2(mapa: Mapa) {

    mapa.sectores!!.filter { f ->
        if (f.getTributos() != null && f.getTributos().getVida() > 0) {
            mapa.comprobarSector(tributo)
        } }


 */


