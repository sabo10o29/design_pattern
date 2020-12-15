package section9

open class Display(private val impl: DisplayImpl) {

    fun open(){
        impl.rawOpen()
    }

    fun print(){
        impl.rawPrint()
    }

    fun close(){
        impl.rawClose()
    }

    final fun display(){
        open()
        print()
        close()
    }


}