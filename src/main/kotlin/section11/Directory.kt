package section11

import section13.Visitor

class Directory(private val name: String): Entry() {

    private val list = mutableListOf<Entry>()

    override fun getName(): String {
        return name
    }

    override fun getSize(): Int {
        var size = 0
        list.forEach { entry -> size += entry.getSize() }
        return size
    }

    override fun addImplement(entry: Entry): Entry{
        list.add(entry)
        return this
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        list.forEach { entry -> entry.printList("$prefix/$name") }
    }

    fun iterator(): MutableIterator<Entry>{
        return list.iterator()
    }




}