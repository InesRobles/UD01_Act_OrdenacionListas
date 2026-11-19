// Pancake Sort: solo se puede "voltear" el principio de la lista.
// Se busca el mayor, se lleva al principio y luego al final de la parte sin ordenar.

fun <T : Comparable<T>> voltear(lista: MutableList<T>, hasta: Int) {
    var i =0
    var j =hasta
    while (i < j) {
        val temp =lista[i]
        lista[i] =lista[j]
        lista[j] =temp
        i=i+1
        j=j-1
    }
}

fun <T : Comparable<T>> pancakeSort(lista: MutableList<T>) {
    for (tamano in lista.size downTo 2) {
        // Buscar la posición del mayor en la parte sin ordenar
        var posicionMayor =0
        for (i in 1 until tamano) {
            if (lista[i] > lista[posicionMayor]) {
                posicionMayor = i
            }
        }
        // Llevarlo al final de la parte sin ordenar
        if (posicionMayor != tamano - 1) {
            voltear(lista, posicionMayor)
            voltear(lista, tamano - 1)
        }
    }
}

fun <T : Comparable<T>> probarPancakeSort(nombre: String, original: MutableList<T>) {
    println("=== $nombre ===")
    println("Lista original: $original")
    val copia = original.toMutableList()
    val inicio = System.nanoTime()
    pancakeSort(copia)
    val fin = System.nanoTime()
    println("Lista ordenada: $copia")
    println("Tiempo: ${fin - inicio} ns\n")
}

fun main() {
    probarPancakeSort("Pancake Sort - vehículos", listaVehiculos)
    probarPancakeSort("Pancake Sort - números", listaNumeros)
}
