fun run1() {
    val words = arrayOf("pen", "cup", "dog", "person",
        "cement", "coal", "spectacles", "cup", "bread")

    // set does not support duplicate elements
//    val words = [ "pen", "cup", "dog", "person",
//        "cement", "coal", "spectacles", "cup", "bread"]

    val w1 = words.elementAt(0)
    println(w1)

    val i1 = words.indexOf("cup")
    println("The first index of cup is $i1")

    val i2 = words.lastIndexOf("cup")
    println("The last index of cup is $i2")
}