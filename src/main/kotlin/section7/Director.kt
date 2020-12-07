package section7

class Director(private val builder: Builder) {

    fun construct(){
        builder.makeTitle("Greeting")
        builder.makeString("Morning to Lunch")
        builder.makeItems(arrayOf("Good morning.", "Good afternoon."))
        builder.makeString("Night")
        builder.makeItems(arrayOf("Good morning.", "Good afternoon.", "See you."))
        builder.close()
    }

}