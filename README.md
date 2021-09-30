DesafioKotlin_ChemaR
2º DAM - PROGRAMACION DE DISPOSITIVOS MOVILES
AUTOR: CHEMA RUIZ
ENUNCIADO:

Tenemos cinco distritos con dos jugadores cada uno. La forma de participar es mandar a los jugadores a un campo de batalla donde recogerán ítems que se encuentren y a que se partan la cara con otros. Cuando sólo quede uno, ese distrito gana la partida. A estos tíos se les llama tributos.

Se debe representar un mapa en el que en cada casilla puede haber un tributo (jugador), un ítem o nada.

Los jugadores:

- Pertenecen a un distrito.

- Tienen un nivel de vida y un nivel de fuerza.

Los ítems tendrán, todos, una descripción y pueden ser de tres tipos:

- Armas: con un nivel de fuerza que se le sumará al que la encuentre.

- Medicina: con un nivel de vida que se le sumará al que la encuentre.

- Trampa: pertenecen al capitolio que las coloca al azar. Si un tributo se encuentra con una trampa el tributo (jugador) muere. Y será recogido por el capitolio y sacado del mapa.

El mapa:

- En el mapa estarán colocados ítems al azar.

- En el mapa se irán moviendo los jugadores.

- Tendrá unas filas F por unas columnas C. Por ejemplo de 5x5.

El capitolio:

- Tendrá una reserva de ítems que irá enviando al mapa.

- Irá recogiendo a los tributos muertos y los irá almacenando.

Inicialización:

- Se inicia el repositorio de ítems del capitolio con 100 ítems generados al azar. Los ítems serán de los tres tipos posibles y los niveles pueden oscilar entre 50 y 100.

- Se colocan en el mapa, distribuidos al azar, 10 ítems. Estos ítems se deben sacar del capitolio.

- Se colocan a los tributos en el mapa al azar. Si al colocar a uno la posición está ocupada por un ítem o por otro jugador se elige otra posición.

Simulación:

- Cada 2 segundos los jugadores se desplazan a una casilla adyacente y puede ocurrir:

o Si en la nueva casilla hay un ítem lo aprovecha (sin necesidad de guardarlo). Pilla sus niveles y se los suma a lo que él tiene. Caso de ser trampa el jugador muere y es recogido por el capitolio desapareciendo del mapa.

o Si hay otro jugador lucha con él. Gana el que más fuerza tenga; en caso de empate el que más vida; y en caso de empate a cara o cruz. El que gane se queda con la posición y el que muera es recogido por el capitolio.

o Si no hay nada el jugador deja la posición antigua para colocarse en la nueva. 
- Cada 5 segundos:

o El capitolio envía 4 ítems al mapa. Los coloca al azar en las posiciones que no tengan nada (ni jugador, ni ítem).

o Se muestra el estado del juego.

- El juego finalizará cuando sólo quede un jugador/tributo en el mapa. Cuando finalice el juego se debe indicar quién ha ganado y mostrar el estado del mapa y del capitolio. La forma de saber cuántos jugadores quedan vivos por el mapa se puede hacer de un par de formas: la más obvia es recorriendo y contando cuantos hay pero hay otra que valoraré bastante…

Se valora:

- Elección y uso de las estructuras de datos. Que se almacene y gestione correctamente la información.

- Uso de patrones de diseño para las factorías.

- Que lo programado se ajuste a lo pedido.

- Claridad y eficiencia.

- Buenas prácticas de programación.

- La copia de código entre alumnos implicará la descalificación de la prueba para los participantes.

Luke: “Mover piedras es una cosa, esto es totalmente diferente.”

Yoda: “No, no es diferente, solo es diferente en tu mente.”