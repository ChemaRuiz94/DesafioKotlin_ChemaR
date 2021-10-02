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
        var arma : Arma = Arma(generaAleatorio(50,100))
        return arma
    }

    fun factoriaMedicina():Medicina{
        var medicina : Medicina = Medicina(generaAleatorio(50,100))
        return medicina
    }

    fun factoriaTrampa():Trampa{
        var trampa : Trampa = Trampa(generaAleatorio(50,100))
        return trampa
    }
}