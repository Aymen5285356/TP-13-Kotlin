package TP13

inline fun processList(
    numbers: List<Int>,
    predicate: (Int) -> Boolean,
    noinline operation: (Int) -> Unit
) {
    for (n in numbers) {
        if (predicate(n)) {
            operation(n)
        }
    }
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    processList(list, { it % 2 == 0 }, { println("Even number: $it, squared = ${it * it}") })
}
