package section3

class CharDisplay(val ch: Char): AbstractDisplay() {

    override fun open() {
        print("<<")
    }

    override fun print() {
        print(ch)
    }

    override fun close() {
        println(">>")
    }
}