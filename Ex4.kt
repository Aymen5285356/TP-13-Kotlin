package TP13

inline fun filterList(numbers: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (n in numbers) {
        if (predicate(n)) {
            result.add(n)
        }
    }
    return result
}

fun main() {
    val list = listOf(3, 8, 12, 15, 20, 7, 10)
    val evens = filterList(list) { it % 2 == 0 }
    val greaterThan10 = filterList(list) { it > 10 }
    println("Even numbers: $evens")
    println("Numbers greater than 10: $greaterThan10")
}