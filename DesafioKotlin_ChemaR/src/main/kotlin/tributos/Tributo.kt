package tributos

import generaAleatorio
import item.Arma
import item.Item
import item.Medicina
import item.Trampa

class Tributo(var numeroTributo: Int, var distrito: Int) {

    var vida: Int = 0
    var fuerza: Int = 0
    private var fila: Int = 0
    private var columna: Int = 0


    init {
        this.vida = generaAleatorio(50, 100)
        this.fuerza = generaAleatorio(50, 100)
    }


    private fun aumentarVida(aumento: Int) {
        this.vida = this.vida + aumento
    }

    fun restarVida(disminuacion: Int) {
        this.vida = this.vida - disminuacion
    }

    private fun aumentarFuerza(aumento: Int) {
        this.fuerza = this.fuerza + aumento
    }

    fun getFila(): Int {
        return this.fila
    }

    fun setFila(f: Int) {
        this.fila = f
    }

    fun getColumna(): Int {
        return this.columna
    }

    fun setColumna(c: Int) {
        this.columna = c
    }


    private fun compararValores(a: Int, b: Int): Int {
        return when {
            a > b -> {
                0
            }
            b > a -> {
                1
            }
            else -> {
                -1
            }
        }

    }

    fun pelear(tributo: Tributo) {
        when (compararValores(fuerza, tributo.fuerza)) {
            0 ->
                tributo.vida = 0
            1 ->
                vida = 0
            -1 ->
                compararVida(tributo)

        }
    }

    private fun compararVida(tributo: Tributo) {
        when (compararValores(vida, tributo.vida)) {
            0 ->
                tributo.vida = 0
            1 ->
                vida = 0
            -1 ->
                alAzar(tributo)
        }
    }

    private fun alAzar(tributo: Tributo) {
        val rand = (1 until 3).random()

        if (rand == 1) {
            tributo.vida = 0
        } else {
            vida = 0
        }
    }

    fun actuarItems(item: Item) {
        when (item) {
            is Arma ->
                aumentarFuerza(item.getFuerza())
            is Medicina ->
                aumentarVida(item.getVida())
            is Trampa ->
                this.vida = 0
        }
    }

    override fun toString(): String {
        return ("Num Tributo: $numeroTributo, Distrito: $distrito, Vida: $vida, Fuerza: $fuerza")
    }
}