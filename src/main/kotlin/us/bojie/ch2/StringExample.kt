package us.bojie.ch2


val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

fun main() {
    println(string == fromChars) // true, since equals
    println(string === fromChars) // false, since different object

    println("Output:" + string)

    val arg1: Int = 0
    val arg2: Int = 1
    println("" + arg1 + " + " + arg2 + " = " + (arg1 + arg2))
    println("$arg1 + $arg2 = ${arg1 + arg2}")

    //Hello "World"
    val sayHello: String = "Hello \"World\""
    println(sayHello)
    //salary
    val salary: Int = 1000
    //$salary
    println("\$salary")

    val rawString: String = """
        \t
        \n
\\\\\\$$$ salary
    """
    println(rawString)
    println(rawString.length)
}