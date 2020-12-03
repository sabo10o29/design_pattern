package section3

abstract class AbstractDisplay{

    protected abstract fun open()
    protected abstract fun print()
    protected abstract fun close()
    final fun display(){
        open()
        repeat(5) {
            print()
        }
        close()
    }

}