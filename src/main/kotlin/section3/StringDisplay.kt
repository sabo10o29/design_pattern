package section3

class StringDisplay(val st: String): AbstractDisplay() {

    private val width: Int = st.toByteArray().size

    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$st|")
    }

    override fun close() {
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