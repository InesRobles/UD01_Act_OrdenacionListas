// Va cogiendo cada elemento y lo coloca en su sitio dentro de la parte ya ordenada.

fun <T : Comparable<T>> insercion(lista: MutableList<T>) {
    for (i in 1 until lista.size) {
        val actual = lista[i]
        var j =i -1
        while (j >= 0 && lista[j] >actual) {
            lista[j + 1] = lista[j]   // desplazar a la derecha
            j=j-1
        }
        lista[j + 1] =actual
    }
}

fun <T : Comparable<T>> probarInsercion(nombre: String, original: MutableList<T>) {
    println("=== $nombre ===")
    println("Lista original: $original")
    val copia =original.toMutableList()
    val inicio =System.nanoTime()
    insercion(copia)
    val fin =System.nanoTime()
    println("Lista ordenada: $copia")
    println("Tiempo: ${fin - inicio} ns\n")
}

fun main() {
    probarInsercion("Inserción - vehículos", listaVehiculos)
    probarInsercion("Inserción - números", listaNumeros)
}
