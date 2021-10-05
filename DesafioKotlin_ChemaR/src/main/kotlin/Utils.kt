import mapa.Mapa
import mapa.Sector
import tributos.Tributo


fun generaAleatorio(minimo: Int, maximo: Int): Int {
    return Math.floor(Math.random() * (maximo - minimo + 1) + minimo).toInt()
}


/*
Pequeña funcion para pintar el mapa
 */
fun pintarMapaVacio(mapa: Mapa) {
    //primer for recorre filas
    for (i in mapa.sectores!!) {
        var fil: Int = mapa.sectores!!.indexOf(i)

        //segundo for recorre columnas
        for (j in mapa.sectores!![fil]) {
            if (j is Sector) {
                var col: Int = mapa.sectores!![fil].indexOf(j)

                val item = mapa.sectores!![fil][col].getItem()
                val tributo = mapa.sectores!![fil][col].getTributos()

                print("[ $fil / $col ]")
            }
        }
        println("")
    }
}

fun pintarMapaInicializacion(mapa: Mapa) {
    //primer for recorre filas
    for (i in mapa.sectores!!) {
        var fil: Int = mapa.sectores!!.indexOf(i)

        //segundo for recorre columnas
        for (j in mapa.sectores!![fil]) {
            if (j is Sector) {
                var col: Int = mapa.sectores!![fil].indexOf(j)
                var item = mapa.sectores!![fil][col].getItem()
                var tributo = mapa.sectores!![fil][col].getTributos()

                if (mapa.sectores!![fil][col].getItem() != null && mapa.sectores!![fil][col].getTributos() != null) {
                    print("[ $fil / $col -> item: SI / tributo: SI ]")
                } else if (mapa.sectores!![fil][col].getItem() == null && mapa.sectores!![fil][col].getTributos() != null) {
                    print("[ $fil / $col -> item: NO / tributo:  SI ]")
                } else if (mapa.sectores!![fil][col].getItem() != null && mapa.sectores!![fil][col].getTributos() == null) {
                    print("[ $fil / $col -> item: SI / tributo: NO ]")
                } else {
                    print("[ $fil / $col -> item: NO / tributo: NO ]")
                }


            }
        }
        println("")
    }
}

fun pintarMapaDetalle(mapa: Mapa) {
    //primer for recorre filas
    for (i in mapa.sectores!!) {
        var fil: Int = mapa.sectores!!.indexOf(i)

        //segundo for recorre columnas
        for (j in mapa.sectores!![fil]) {
            if (j is Sector) {
                var col: Int = mapa.sectores!![fil].indexOf(j)

                val item = mapa.sectores!![fil][col].getItem()
                val tributo = mapa.sectores!![fil][col].getTributos()

                print("[ $fil / $col -> item: $item / tributo: $tributo]")
            }
        }
        println("")
    }
}


fun generarNuevaPosi(tributo: Tributo) {
    do {
        var correcto = false

        when ((1 until 8).random()) {
            1 -> { //-> +1/0
                if (tributo.getFila() != 4) {
                    tributo.setFila(tributo.getFila() + 1) // cambiamos el atributo privado del objeto tributo
                    correcto = true //si le encuentra una posicion valida cambia a correcto
                }
            }
            2 -> { //-> -1/0
                if (tributo.getFila() != 0) {
                    tributo.setFila(tributo.getFila() - 1)
                    correcto = true
                }


            }
            3 -> { //-> 0/+1
                if (tributo.getColumna() != 4) {
                    tributo.setColumna(tributo.getColumna() + 1)
                    correcto = true
                }


            }
            4 -> { //-> 0/-1
                if (tributo.getColumna() != 0) {
                    tributo.setColumna(tributo.getColumna() - 1)
                    correcto = true
                }
            }
            5 -> { //-> +1/+1
                if (tributo.getColumna() != 4 && tributo.getFila() != 4) {
                    tributo.setFila(tributo.getFila() + 1)
                    tributo.setColumna(tributo.getColumna() + 1)
                    correcto = true
                }
            }
            6 -> { //-> -1/-1
                if (tributo.getColumna() != 0 && tributo.getFila() != 0) {
                    tributo.setFila(tributo.getFila() - 1)
                    tributo.setColumna(tributo.getColumna() - 1)
                    correcto = true
                }
            }

            7 -> { //-> +1/-1
                if (tributo.getFila() != 4 && tributo.getColumna() != 0) {
                    tributo.setFila(tributo.getFila() + 1)
                    tributo.setColumna(tributo.getColumna() - 1)
                    correcto = true
                }
            }
            8 -> { //-> -1/+1
                if (tributo.getFila() != 0 && tributo.getColumna() != 4) {
                    tributo.setFila(tributo.getFila() - 1)
                    tributo.setColumna(tributo.getColumna() + 1)
                    correcto = true
                }
            }
        }
        //sale del bucle si le ha encontrado una posicion valida
    } while (!correcto)
}

