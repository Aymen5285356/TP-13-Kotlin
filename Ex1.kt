package TP13

fun transformList(numbers: List<Int>, transform: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (n in numbers) {
        result.add(transform(n))
    }
    return result
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubled = transformList(list) { it * 2 }
    val squared = transformList(list) { it * it }
    println("Doubled: $doubled")
    println("Squared: $squared")
}