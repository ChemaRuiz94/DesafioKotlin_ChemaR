fun pedirEnteroUsuario(mensaje: String): Int {
    var num: Int = 0
    var correcto = false

    while (!correcto) {
        try {
            println(mensaje)
            num = readLine().toString().toInt()
            correcto = true
            if (num < 1) {
                correcto = false
            }
        } catch (e: Exception) {
            println("ERROR -> Introduce un numero entero")
        }
    }
    return num
}

fun generaAleatorio(minimo: Int, maximo: Int): Int {
    return Math.floor(Math.random() * (maximo - minimo + 1) + minimo).toInt()
}