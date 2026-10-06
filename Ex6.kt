package TP13

inline fun processStrings(
    strings: List<String>,
    predicate: (String) -> Boolean,
    noinline operation: (String) -> Unit
) {
    for (s in strings) {
        if (predicate(s)) {
            operation(s)
        }
    }
}

fun main() {
    val words = listOf("kotlin", "java", "android", "c", "swift", "dart")
    processStrings(words, { it.length > 4 }, { println(it.uppercase()) })
}