fun run4() {

    var programmer: Human = object: Human { // creating an instance of the interface
        override fun think() { // overriding the think method
            println("I am an example of Anonymous Inner Class ")
        }
    }

    programmer.think()
}


interface Human {
    fun think()
}



