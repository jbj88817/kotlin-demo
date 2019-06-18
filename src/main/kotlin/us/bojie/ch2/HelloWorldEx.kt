package us.bojie.ch2

import us.bojie.ch2.helloworld.HelloWorld2

const val FINAL_HELLO_WORLD: String = "Hello World"
var helloWorld: String = FINAL_HELLO_WORLD
var nullableHelloWorld: String? = helloWorld
val helloWorldArray: Array<Char> = arrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val helloWorldCharArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val helloWorldLength: Int = helloWorld.length
val helloWorldLengthLong: Long = helloWorldLength.toLong()

fun main() {
    println("final hello world: " + FINAL_HELLO_WORLD)
    println("assignable hello world: " + helloWorld)
    println("hello world from nullable type: " + nullableHelloWorld)
    println("hello world from Array: " + helloWorldArray.joinToString(""))
    println("hello world from CharArray: " + String(helloWorldCharArray))
    println("class name hello world: " + HelloWorld2::class.java.simpleName)
    println("class name hello world: " + HelloWorld2::class.java.name)
    println(
        "part of the class name of HelloWorld: "
                + HelloWorld2::class.java.simpleName.slice(0 until helloWorldLength)
    ) // [0, 11)
    println("the length of hello world is : " + helloWorldLength)
    println("the length of hello world is (long): " + helloWorldLengthLong)
}