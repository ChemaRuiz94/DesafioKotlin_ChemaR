package simulacion

import mapa.Mapa
import mapa.Sector
import tributos.Tributo
import generaAleatorio
import pintarMapaDetalle
import pintarMapaInicializacion
import pintarMapaVacio


fun simulacion(mapa: Mapa) {
    var cont = 0

    println("BIENVENIDOS A LOS JUEGOS DEL HAMBRE")
    println("ESTE SERA EL MAPA DONDE JUGARAN NUESTROS TRIBUTOS")
    pintarMapaVacio(mapa)
    println("Y ESTE ES EL MAPA UNA VEZ INICIALIZADOS LOS ITEMS Y LOS TRIBUTOS")
    pintarMapaInicializacion(mapa)
    //pintarMapaDetalle(mapa)

    mapa.comprobarTributosVivos()
    do {
        println("\n\n")
        Thread.sleep(1000)
        cont++
        println("TIEMPO SIMULACION: $cont SEGUNDOS")

        if(cont % 2 == 0){
            simularMovimiento(mapa)
            //pintarMapaDetalle(mapa)
        }

        if(cont % 5 == 0){
            repeat(4) {
                mapa.rellenarItems()
            }
            pintarResultado(mapa)
        }

        mapa.comprobarTributosVivos()
    } while (mapa.getTributosVivos().size > 1)

    pintarResultadoFinal(mapa)
}


fun simularMovimiento(mapa: Mapa) {
    val a = mapa.getTributosVivos()

    a.forEach { tributo ->
        if (tributo.vida > 0)
            mapa.comprobarSector(tributo)
    }
}

fun pintarResultado(mapa: Mapa){
    println("")
    println("RESULTADO DE LOS JUEGOS -> ")
    println("VIVOS :" + mapa.getTributosVivos().size)
    println("MUERTOS :" + mapa.capitolio.getSizeMuertos())
    if(mapa.getTributosVivos().size > -1){
        mapa.getTributosVivos().forEach { tributo ->
            println("SUPERVIVIENTE -> $tributo")
        }
    }else{
        println("TODOS HAN MUERTO POR TRAMPAS")
    }


}

fun pintarResultadoFinal(mapa: Mapa){
    println("------FIN DE LOS JUEGOS------")
    pintarResultado(mapa)
    println("ESTADO DEL MAPA")
    pintarMapaDetalle(mapa)

    println("MUERTOS RECOGIDOS POR EL CAPITOLIO ->")
    mapa.capitolio.getMuertos().forEach { tributo ->
        println("\t$tributo")
    }

}


