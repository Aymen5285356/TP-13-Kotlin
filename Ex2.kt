package TP13

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val x = 12
    val y = 4
    println("Addition: ${applyOperation(x, y) { a, b -> a + b }}")
    println("Subtraction: ${applyOperation(x, y) { a, b -> a - b }}")
    println("Multiplication: ${applyOperation(x, y) { a, b -> a * b }}")
    println("Division: ${applyOperation(x, y) { a, b -> a / b }}")
}