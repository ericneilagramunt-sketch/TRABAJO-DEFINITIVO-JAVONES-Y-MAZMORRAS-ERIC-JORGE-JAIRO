Mazmorras y Javones
Detalles del proyecto
Este programa es una pequeña simulación de un juego.
Aquí puedes crear héroes, equiparlos con objetos mágicos y usar sus habilidades especiales para sobrevivir a la aventura.
¿En que consiste este juego?
El código simula la lógica básica de un juego de fantasía. Tenemos una clase base llamada Personaje de la cual nacen tres tipos de héroes, cada uno con un poder distinto.
LOS PERSONAJES
Mago: Utiliza maná para lanzar hechizos. Si se queda sin energía, ¡tenemos que recargarle mana!
Guerrero: Es el protector del grupo. Tiene la habilidad especial de proteger a un compañero, reducira el daño que este recibe a la mitad.
Ladrón: Maestro del sigilo. Puede hacerse invisible para robar sin ser detectado.
¿Como funciona el juego?
1. Gestión de Inventario
Cada personaje viene con su propio bolso o inventario.
Puedes añadir equipamiento como el "Bastón Mágico" o la "Espada de Acero".
El sistema divide los objetos por tipo (arma, armadura, entre otras cosas.).
2. Combate y Salud
Bajar Vida: Cuando un personaje recibe daño, el sistema resta puntos de vida. Ojo: Si un Guerrero lo está protegiendo, el daño se divide entre 2 automáticamente.
Curar: Los personajes pueden recuperar salud para seguir en la batalla.
3. Habilidades Especiales (Código en funcionamiento)
lanzarHechizo(): Comprueba si el Mago tiene maná suficiente antes de atacar(cada ataque consume cierta cantidad de mana,que si no tuviera lo suficiente no podra atacar).
hacerseInvisible(): Cambia el estado del Ladrón. Si es invisible, su mensaje de "robar" cambia a uno de éxito garantizado.
proteger(): El Guerrero selecciona a un amigo y le pone un "escudo" legal en el código(solo la persona protegida su daño se dividira a la mitad).
Estructura de Los codigos en java
Personaje.java: El molde principal (nombre, vida, nivel).
Mago/Guerrero/Ladron.java: Las especializaciones de cada clase.
equipo.java / inventario.java: Los encargados de que no te falte equipo en tu mochila.
ejecucion.java: El motor del juego. Aquí es donde Gandalf, Conan y Robin cobran vida y realizan sus acciones.
La Misión Principal:
Superviviencia en la mazmorra y Cooperación entre jugadores.
