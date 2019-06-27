package us.bojie.ch3

class A {
    var b = 0
        get() {
            println("Getting b")
            return field
        }
        protected set(value) {
            println("Setting b")
            field = value
        }
}

class X

class B {
    var b = 0
    lateinit var c: String
    lateinit var d: X
    val e: X by lazy {
        println("init X")
        X()
    }
}

fun main() {
    println("start")
    val b = B()
    println("init B")
    println(b.b)
    println(b.e)
}