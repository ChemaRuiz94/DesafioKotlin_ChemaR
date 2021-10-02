import capitolio.Capitolio
import capitolio.FactoriaCapitolio
import item.Item
import mapa.FactoriaMapa
import mapa.Mapa
import mapa.Sector
import generaAleatorio
import tributos.FactoriaTributos
import tributos.Tributo

fun inicializacionCompleta(capitolio: Capitolio): Mapa{

    var mapa : Mapa? = incicializacionMapa()

    inicializarItems(mapa!!,capitolio)
    inicializacionTributos(mapa)

    return mapa
}


fun incicializacionMapa(): Mapa? {
    var filas = pedirEnteroUsuario("Introduce el numero de filas del mapa")
    var columnas = pedirEnteroUsuario("Introduce el numero de columnas del mapa")
    var mapa: Mapa? = FactoriaMapa.factoriaMapa(filas,columnas)
    return mapa
}

fun inicializacionTributos(mapa: Mapa){

    var tributos: ArrayList<Tributo> = FactoriaTributos.factoriaTributos()

    for (i in tributos){
        var correcto = false
        var filaRandom : Int = generaAleatorio(0,mapa.filas-1)
        var columnaRandom : Int = generaAleatorio(0,mapa.columnas-1)

            //en el sector aleatorio añadimos el item
            mapa.sectores!![filaRandom][columnaRandom].addTributo(i)
    }
}

/*
Crea un ArrayList de 10 items que trae del capitlo
y despues los elimina de esa lista
 */
fun generarItemsIniciales(mapa:Mapa, capitolio: Capitolio): ArrayList<Item>{

    var itemsIniciales: ArrayList<Item> = ArrayList(10)

    //almacenamos los 10 primeros item del capitolio
    for (i in 0..9){
        itemsIniciales.add(capitolio.items[i])
    }
    //para retirar los item de la reserva del capitolio
    for (i in 0..9){
       capitolio.delItems(i)
    }
    return itemsIniciales
}


fun inicializarItems(mapa:Mapa,capitolio: Capitolio){

    var itemsIniciales: ArrayList<Item> = generarItemsIniciales(mapa,capitolio)

    for (i in itemsIniciales){
        do {
            var correcto = false
            var filaRandom : Int = generaAleatorio(0,mapa.filas-1)
            var columnaRandom : Int = generaAleatorio(0,mapa.columnas-1)

            //comprobamos que no haya un item antes
            if(mapa.sectores!![filaRandom][columnaRandom] != null){
                //en el sector aleatorio añadimos el item
                mapa.sectores!![filaRandom][columnaRandom].addItem(i)
                correcto = true
            }else{
                correcto = false
            }
            //repetimos este bucle para asegurarnos que se añadan los 10
        }while (!correcto)

    }
}



