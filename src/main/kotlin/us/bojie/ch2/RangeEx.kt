package us.bojie.ch2

val range: IntRange = 0..1024 // [0, 1024]
val range_exclusive: IntRange = 0 until 1024 // [0, 1024) = [0, 1023]

val emptyRange: IntRange = 0..-1

fun main() {
    println(emptyRange.isEmpty())
    println(range.contains(50))
    println(50 in range)

    for (i in range_exclusive) {
        print("$i, ")
    }
}