// Algoritmo libre 1: Ordenación por burbuja.
// Compara elementos vecinos y los intercambia si están al revés.

fun <T : Comparable<T>> burbuja(lista: MutableList<T>) {
    for (i in 0 until lista.size - 1) {
        for (j in 0 until lista.size - 1 - i) {
            if (lista[j] > lista[j +1]) {
                val temp =lista[j]
                lista[j] =lista[j +1]
                lista[j +1] =temp
            }
        }
    }
}

fun <T : Comparable<T>> probarBurbuja(nombre: String, original: MutableList<T>) {
    println("=== $nombre ===")
    println("Lista original: $original")
    val copia = original.toMutableList()
    val inicio = System.nanoTime()
    burbuja(copia)
    val fin =System.nanoTime()
    println("Lista ordenada: $copia")
    println("Tiempo: ${fin -inicio} ns\n")
}

fun main() {
    probarBurbuja("Burbuja - vehículos", listaVehiculos)
    probarBurbuja("Burbuja - números", listaNumeros)
}
