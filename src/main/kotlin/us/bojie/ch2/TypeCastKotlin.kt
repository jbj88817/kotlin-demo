package us.bojie.ch2


fun main() {
    // Eg1 smart cast
//    Parent parent = new Parent();
//    if (parent instanceof Child) {
//    System.out.println(((Child)parent).getName());
//    }
    val parent: Parent = Child()
    if(parent is Child) {
        println(parent.name)
    }

    // Eg2 safe cast
//    val parent: Parent = Parent()
//    val child: Child? = parent as? Child
//    println(child)
    
}