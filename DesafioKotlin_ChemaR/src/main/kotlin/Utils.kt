import mapa.Mapa
import mapa.Sector

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


/*
Pequeña funcion para pintar el mapa
 */
fun pintarMapa(mapa: Mapa){
    //primer for recorre filas
    for (i in mapa.sectores!!){
        var fil : Int = mapa.sectores!!.indexOf(i)

        //segundo for recorre columnas
        for (j in mapa.sectores!![fil]){
            if(j is Sector){
                var col : Int = mapa.sectores!![fil].indexOf(j)
                print("[ $fil / $col ]")
            }
        }
        println("")
    }
}