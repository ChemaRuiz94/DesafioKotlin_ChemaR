package item

import generaAleatorio

class Arma(private val desc: String) : Item(descripcion = desc) {
    private var fuerza: Int = 0

    init {
        fuerza = generaAleatorio(50, 100)
    }

    fun getFuerza(): Int {
        return fuerza
    }
}