package us.bojie.ch3

const val USERNAME = "kotlin"
private const val PASSWORD = "jetbrains"

private const val ADMIN_USER = "admin"
private const val ADMIN_PASSWD = "admin"

private const val DEBUG = 1
private const val USER = 0

fun main(args: Array<String>) {
    // *****
    val mode = if (args.isNotEmpty() && args[0] == "1") {
        DEBUG
    } else {
        USER
    }

    println("Enter your username：")
    val username = readLine()
    println("Enter your password：")
    val passwd = readLine()

    if (mode == DEBUG && username == ADMIN_USER && passwd == ADMIN_PASSWD) {
        println("Admin login")
    } else if (username == USERNAME && passwd == PASSWORD) {
        println("logged in")
    } else {
        println("login failed")
    }
}