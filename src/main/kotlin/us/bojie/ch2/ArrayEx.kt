package us.bojie.ch2

val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString: Array<String> = arrayOf("I", "am", "coder")

fun main() {
    println(arrayOfInt.size)
    for (int in arrayOfInt) {
        println(int)
    }

    println(arrayOfChar.joinToString())
    println(arrayOfInt.slice(1..2))
}