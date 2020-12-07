package section7

class Director2(private val builder: Builder) {

    fun construct(){
        builder.makeTitle("kotlinlang.org")
        builder.makeString("docs")
        builder.makeItems(arrayOf("reference", "server-overview"))
        builder.close()
    }

}