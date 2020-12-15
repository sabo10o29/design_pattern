package section9

class StringDisplayImpl(private val str: String): DisplayImpl() {

    private var width: Int

    init {
        width = str.toByteArray().size
    }

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|$str|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine(){
        print("+")
        repeat(width){
            print("-")
        }
        println("+")
    }

}