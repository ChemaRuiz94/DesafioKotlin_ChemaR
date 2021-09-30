package tributos

class Tributo(var distrito: Int, var vida: Int, var fuerza: Int) {

    fun aumentarVida(aumento: Int) {
        this.vida = this.vida + aumento
    }

    fun restarVida(disminuacion: Int) {
        this.vida = this.vida - disminuacion
    }

    fun aumentarFuerza(aumento: Int) {
        this.fuerza = this.fuerza + aumento
    }

}