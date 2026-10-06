package TP13

fun findNumber(numbers: List<Int>, target: Int): Boolean {
    numbers.forEach {
        if (it == target) {
            return true
        }
    }
    return false
}

fun main() {
    val list = listOf(4, 9, 15, 23, 42)
    println("Is 15 in the list? ${findNumber(list, 15)}")
    println("Is 7 in the list? ${findNumber(list, 7)}")
}