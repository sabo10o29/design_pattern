package section11

import section13.Acceptor

abstract class Entry : Acceptor{

    private var parent: Entry? = null

    abstract fun getName(): String
    abstract fun getSize(): Int
    abstract fun printList(prefix: String)

    final fun add(entry: Entry): Entry{
        entry.setParent(this)
        return addImplement(entry)
    }

    public open fun addImplement(entry: Entry): Entry{
        throw FileTreatmentException()
    }

    private fun setParent(entry: Entry){
        parent = entry
    }

    public fun printList(){
        printList("")
    }

    private fun getParentPath(): String{
        if(parent == null){
            return "/${getName()}"
        }else{
            return "${parent!!.getParentPath()}/${getName()}"
        }
    }

    public fun printFullPath(){
        println(getParentPath())
    }

    override fun toString(): String {
        return "${getName()} (${getSize()})"
    }

}