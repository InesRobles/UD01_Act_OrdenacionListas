/* QuickSort: elige un pivote (el último), coloca a su izquierda los menores
y a su derecha los mayores, y repite con cada parte.*/

fun <T : Comparable<T>> quickSort(lista: MutableList<T>, bajo: Int, alto: Int) {
    if (bajo < alto) {
        val posPivote = particionar(lista, bajo, alto)
        quickSort(lista, bajo, posPivote - 1)
        quickSort(lista, posPivote + 1, alto)
    }
}

fun <T : Comparable<T>> particionar(lista: MutableList<T>, bajo: Int, alto: Int): Int {
    val pivote = lista[alto]
    var i = bajo - 1
    for (j in bajo until alto) {
        if (lista[j] <= pivote) {
            i++
            val temp = lista[i]
            lista[i] = lista[j]
            lista[j] = temp
        }
    }
    val temp = lista[i + 1]
    lista[i + 1] = lista[alto]
    lista[alto] = temp
    return i + 1
}

// <T : Comparable<T>> significa "cualquier tipo que se pueda comparar" (Int o String)
fun <T : Comparable<T>> probarQuickSort(nombre: String, original: MutableList<T>) {
    println("=== $nombre ===")
    println("Lista original: $original")
    val copia = original.toMutableList()   // copia para no tocar la original
    val inicio = System.nanoTime()
    quickSort(copia, 0, copia.size - 1)
    val fin = System.nanoTime()
    println("Lista ordenada: $copia")
    println("Tiempo: ${fin - inicio} ns\n")
}

fun main() {
    probarQuickSort("QuickSort - vehículos", listaVehiculos)
    probarQuickSort("QuickSort - números", listaNumeros)
}
