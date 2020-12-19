package section11

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int
    public open fun add(entry: Entry): Entry{
        throw FileTreatmentException()
    }
    public fun printList(){
        println("")
    }
    abstract fun printList(prefix: String)
    override fun toString(): String {
        return "${getName()} (${getSize()})"
    }



}