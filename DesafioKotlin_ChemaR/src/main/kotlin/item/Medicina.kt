package item

import generaAleatorio

class Medicina(private val desc: String) : Item(descripcion = desc){
    private var vida: Int = 0

    init {
        vida = generaAleatorio(50, 100)
    }

    fun getVida(): Int {
        return vida
    }
}