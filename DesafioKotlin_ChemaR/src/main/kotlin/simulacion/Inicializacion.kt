import capitolio.Capitolio
import capitolio.FactoriaCapitolio
import item.Item
import mapa.FactoriaMapa
import mapa.Mapa
import mapa.Sector
import generaAleatorio
import tributos.FactoriaTributos
import tributos.Tributo

fun inicializacionCompleta(capitolio: Capitolio): Mapa {

    val mapa: Mapa = incicializacionMapa(capitolio)

    inicializarItems(mapa, capitolio)
    inicializacionTributos(mapa)

    return mapa
}


fun incicializacionMapa(capitolio: Capitolio): Mapa {
    return FactoriaMapa.factoriaMapa(capitolio)
}

fun inicializacionTributos(mapa: Mapa) {

    var tributos: ArrayList<Tributo> = FactoriaTributos.factoriaTributos()

    tributos.forEach { tributo ->
        mapa.add(tributo)
    }
}

/*
Crea un ArrayList de 10 items que trae del capitlo
y despues los elimina de esa lista
 */
fun generarItemsIniciales(capitolio: Capitolio): ArrayList<Item> {

    val itemsIniciales: ArrayList<Item> = ArrayList<Item>()

    repeat(10) {

        val item = capitolio.items[0]
        itemsIniciales.add(item)
        capitolio.delItems(item)
    }
    return itemsIniciales
}


fun inicializarItems(mapa: Mapa, capitolio: Capitolio) {

    val itemsIniciales = generarItemsIniciales(capitolio)

    itemsIniciales.forEach { item ->
        mapa.add(item)
    }
}



