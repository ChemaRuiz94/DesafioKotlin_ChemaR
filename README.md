DesafioKotlin_ChemaR
2� DAM - PROGRAMACION DE DISPOSITIVOS MOVILES
AUTOR: CHEMA RUIZ
ENUNCIADO:

Tenemos cinco distritos con dos jugadores cada uno. La forma de participar es mandar a los jugadores a un campo de batalla donde recoger�n �tems que se encuentren y a que se partan la cara con otros. Cuando s�lo quede uno, ese distrito gana la partida. A estos t�os se les llama tributos.

Se debe representar un mapa en el que en cada casilla puede haber un tributo (jugador), un �tem o nada.

Los jugadores:

- Pertenecen a un distrito.

- Tienen un nivel de vida y un nivel de fuerza.

Los �tems tendr�n, todos, una descripci�n y pueden ser de tres tipos:

- Armas: con un nivel de fuerza que se le sumar� al que la encuentre.

- Medicina: con un nivel de vida que se le sumar� al que la encuentre.

- Trampa: pertenecen al capitolio que las coloca al azar. Si un tributo se encuentra con una trampa el tributo (jugador) muere. Y ser� recogido por el capitolio y sacado del mapa.

El mapa:

- En el mapa estar�n colocados �tems al azar.

- En el mapa se ir�n moviendo los jugadores.

- Tendr� unas filas F por unas columnas C. Por ejemplo de 5x5.

El capitolio:

- Tendr� una reserva de �tems que ir� enviando al mapa.

- Ir� recogiendo a los tributos muertos y los ir� almacenando.

Inicializaci�n:

- Se inicia el repositorio de �tems del capitolio con 100 �tems generados al azar. Los �tems ser�n de los tres tipos posibles y los niveles pueden oscilar entre 50 y 100.

- Se colocan en el mapa, distribuidos al azar, 10 �tems. Estos �tems se deben sacar del capitolio.

- Se colocan a los tributos en el mapa al azar. Si al colocar a uno la posici�n est� ocupada por un �tem o por otro jugador se elige otra posici�n.

Simulaci�n:

- Cada 2 segundos los jugadores se desplazan a una casilla adyacente y puede ocurrir:

o Si en la nueva casilla hay un �tem lo aprovecha (sin necesidad de guardarlo). Pilla sus niveles y se los suma a lo que �l tiene. Caso de ser trampa el jugador muere y es recogido por el capitolio desapareciendo del mapa.

o Si hay otro jugador lucha con �l. Gana el que m�s fuerza tenga; en caso de empate el que m�s vida; y en caso de empate a cara o cruz. El que gane se queda con la posici�n y el que muera es recogido por el capitolio.

o Si no hay nada el jugador deja la posici�n antigua para colocarse en la nueva. 
- Cada 5 segundos:

o El capitolio env�a 4 �tems al mapa. Los coloca al azar en las posiciones que no tengan nada (ni jugador, ni �tem).

o Se muestra el estado del juego.

- El juego finalizar� cuando s�lo quede un jugador/tributo en el mapa. Cuando finalice el juego se debe indicar qui�n ha ganado y mostrar el estado del mapa y del capitolio. La forma de saber cu�ntos jugadores quedan vivos por el mapa se puede hacer de un par de formas: la m�s obvia es recorriendo y contando cuantos hay pero hay otra que valorar� bastante�

Se valora:

- Elecci�n y uso de las estructuras de datos. Que se almacene y gestione correctamente la informaci�n.

- Uso de patrones de dise�o para las factor�as.

- Que lo programado se ajuste a lo pedido.

- Claridad y eficiencia.

- Buenas pr�cticas de programaci�n.

- La copia de c�digo entre alumnos implicar� la descalificaci�n de la prueba para los participantes.

Luke: �Mover piedras es una cosa, esto es totalmente diferente.�

Yoda: �No, no es diferente, solo es diferente en tu mente.�