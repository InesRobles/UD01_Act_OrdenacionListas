import kotlin.random.Random

// Lista de 45 vehículos distintos, desordenados
val listaVehiculos: MutableList<String> = mutableListOf(
    "Tren", "Bicicleta", "Moto", "Avión", "Coche", "Patinete", "Barco", "Autobús",
    "Helicóptero", "Camión", "Tranvía", "Submarino", "Furgoneta", "Globo aerostático",
    "Metro", "Velero", "Ambulancia", "Taxi", "Tractor", "Monopatín", "Cohete",
    "Yate", "Caravana", "Planeador", "Quad", "Ferry", "Trineo", "Kayak", "Canoa",
    "Excavadora", "Grúa", "Dron", "Segway", "Funicular", "Teleférico", "Lancha",
    "Carroza", "Hidroavión", "Limusina", "Bulldozer", "Triciclo", "Autocaravana",
    "Moto de agua", "Camioneta", "Zeppelin"
)

// Lista de 100 números aleatorios entre 1 y 10000, sin repetir
val listaNumeros: MutableList<Int> = crearNumeros()

fun crearNumeros(): MutableList<Int> {
    val aleatorio = Random(2026) //Siempre salen los mismos números
    val numeros = mutableListOf<Int>()
    while (numeros.size < 100) {
        val n = aleatorio.nextInt(1, 10001)
        if (n !in numeros) {  // solo se añade si no estaba ya, evita que se repitan los números
            numeros.add(n)
        }
    }
    return numeros
}

fun main() {
    println("Vehículos: $listaVehiculos")
    println("Números: $listaNumeros")
}
