package section11

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

    override fun add(entry: Entry): Entry{
        list.add(entry)
        return this
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        list.forEach { entry -> entry.printList("$prefix/$name") }
    }




}