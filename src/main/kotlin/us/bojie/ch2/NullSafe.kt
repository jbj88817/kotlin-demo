package net.println.kotlin.chapter2

//public class NullUnSafe {
//    public static void main(String... args) {
//        String name = getName();
//        if (name == null) {
//            System.out.println("name is invalid!!");
//        } else {
//            System.out.println(name.length());
//        }
//    }
//
//    public static String getName() {
//        return null;
//    }
//}

fun getName(): String? {
    return null
}

fun main() {
    // Situation 1
    println(getName()?.length)

    //Situation 2
//    val name: String = getName() ?: return
//    println(name.length)

    // Situation 3
//    val value: String? = "HelloWorld"
//    println(value!!.length)
}