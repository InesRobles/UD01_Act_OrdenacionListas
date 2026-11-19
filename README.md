# UD01 – Ordenación de listas en Kotlin
 
## Descripción
 
Todos los algoritmos trabajan con las mismas dos listas, definidas en `GenerarDatos.kt`:
 
- `listaVehiculos`: `MutableList<String>` con 45 nombres de vehículos distintos y desordenados (se ordena de la A a la Z).
- `listaNumeros`: `MutableList<Int>` con 100 enteros aleatorios entre 1 y 10000, sin repetir (se ordena de menor a mayor). Se genera con `Random` y una semilla fija, así que son siempre los mismos números.
Cada programa muestra la lista original, ordena una **copia** (la original no se modifica), muestra la lista ordenada y mide el tiempo con `System.nanoTime()`.
 
## Algoritmos implementados
 
| Fichero | Algoritmo | Complejidad media |
|---|---|---|
| `01_QuickSort.kt` | QuickSort | O(n log n) |
| `02_PancakeSort.kt` | Pancake Sort | O(n²) |
| `03_MergeSort.kt` | MergeSort | O(n log n) |
| `04_AlgoritmoLibre.kt` | Ordenación por burbuja | O(n²) |
| `05_AlgoritmoLibre.kt` | Ordenación por inserción | O(n²) |
 
## Estructura del repositorio
 
```
.
├── src/
│   ├── GenerarDatos.kt
│   ├── 01_QuickSort.kt
│   ├── 02_PancakeSort.kt
│   ├── 03_MergeSort.kt
│   ├── 04_AlgoritmoLibre.kt
│   └── 05_AlgoritmoLibre.kt
├── UD01_OrdenacionListas_NombreApellido.pdf
└── README.md
```
 
## Cómo ejecutarlo
 
### Con IntelliJ IDEA (recomendado)
 
1. Crea un proyecto Kotlin (JVM) y copia los seis ficheros `.kt` en `src/main/kotlin` (o en `src`).
2. Abre el fichero del algoritmo que quieras probar.
3. Pulsa el icono verde de ▶ junto a `fun main()` y elige **Run**.
Cada fichero tiene su propio `main()`, por lo que se ejecutan por separado. `GenerarDatos.kt` también tiene uno que solo imprime las dos listas.
