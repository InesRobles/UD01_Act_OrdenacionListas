// MergeSort: divide la lista por la mitad, ordena cada mitad y las une (fusiona).

fun <T : Comparable<T>> mergeSort(lista: List<T>): List<T> {
    if (lista.size <= 1) {
        return lista
    }
    val medio = lista.size / 2
    val izquierda =mergeSort(lista.subList(0, medio))
    val derecha =mergeSort(lista.subList(medio, lista.size))
    return fusionar(izquierda, derecha)
}

fun <T : Comparable<T>> fusionar(izquierda: List<T>, derecha: List<T>): List<T> {
    val resultado =mutableListOf<T>()
    var i =0
    var j =0
    // Coger siempre el menor de los dos primeros elementos
    while (i < izquierda.size && j < derecha.size) {
        if (izquierda[i] <= derecha[j]) {
            resultado.add(izquierda[i])
            i=i+1
        } else {
            resultado.add(derecha[j])
            j=j+1
        }
    }
    // Añadir lo que sobre
    while (i < izquierda.size) {
        resultado.add(izquierda[i])
        i=i+1
    }
    while (j < derecha.size) {
        resultado.add(derecha[j])
        j=j+1
    }
    return resultado
}

fun <T : Comparable<T>> probarMergeSort(nombre: String, original: MutableList<T>) {
    println("=== $nombre ===")
    println("Lista original: $original")
    val copia =original.toMutableList()
    val inicio =System.nanoTime()
    val ordenada =mergeSort(copia)
    val fin =System.nanoTime()
    println("Lista ordenada: $ordenada")
    println("Tiempo: ${fin -inicio} ns\n")
}

fun main() {
    probarMergeSort("MergeSort - vehículos", listaVehiculos)
    probarMergeSort("MergeSort - números", listaNumeros)
}
