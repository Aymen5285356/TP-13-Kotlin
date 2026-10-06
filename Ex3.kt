package TP13

inline fun measureTime(taskName: String, block: () -> Unit) {
    println("Running task: $taskName")
    val start = System.currentTimeMillis()
    block()
    val end = System.currentTimeMillis()
    println("Task '$taskName' took ${end - start} ms")
}

fun main() {
    measureTime("Sum of 1 to 1000000") {
        var sum = 0L
        for (i in 1..1_000_000) {
            sum += i
        }
        println("Sum = $sum")
    }

    measureTime("Print numbers") {
        for (i in 1..5) {
            println(i)
        }
    }
}