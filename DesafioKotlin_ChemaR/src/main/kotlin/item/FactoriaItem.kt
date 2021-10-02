package item

import generaAleatorio

object FactoriaItem {

    fun generarItems():ArrayList<Item>{
        var items : ArrayList<Item> = ArrayList<Item>()

        repeat(Constantes.ITEMS){
            when(generaAleatorio(1,3)){
                1 -> {items.add(factoriaArma())}

                2 -> {items.add(factoriaMedicina())}

                3 -> {items.add(factoriaTrampa())}
            }
        }
        return items
    }


    fun factoriaArma():Arma{
        return Arma("Arma")
    }

    fun factoriaMedicina():Medicina{
        return Medicina("Medicina")
    }

    fun factoriaTrampa():Trampa{
        return Trampa("Trampa")
    }
}