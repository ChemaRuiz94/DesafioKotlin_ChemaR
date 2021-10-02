package tributos

import generaAleatorio

object FactoriaTributos {
    val maxDistritos = 5
    val Parejas = 2

    fun factoriTributo(dist:Int):Tributo{

        var tributo : Tributo = Tributo(dist,generaAleatorio(50,100),generaAleatorio(50,100))
        return tributo
    }

    /*
    Devuelve un arrayList de tributos
    dos tributos por cada distrito
     */
    fun factoriaTributos():ArrayList<Tributo>{
        var tributos = ArrayList<Tributo>()
        var max = 0
        var distrito = 1

        do {
            var newTributoH = factoriTributo(distrito)
            tributos.add(newTributoH)
            var newTributoM = factoriTributo(distrito)
            tributos.add(newTributoM)

            distrito++
            max ++
        }while (max < maxDistritos)

        return tributos
    }
}