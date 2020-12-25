package section13

import section11.Directory
import section11.File

class SizeVisitor: Visitor() {

    private var sumSize = 0

    override fun visit(file: File) {
        sumSize += file.getSize()
    }

    override fun visit(directory: Directory) {
        directory.iterator().forEach {
            it.accept(this)
        }
    }

    fun printSize(){
        println(sumSize)
    }


}