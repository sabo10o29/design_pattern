package section13

import section11.Directory
import section11.File

class ListVisitor: Visitor() {

    private var currentDir: String? = null

    override fun visit(file: File) {
        println("$currentDir/$file")
    }

    override fun visit(directory: Directory) {
        println("$currentDir/$directory")
        val saveDir = currentDir
        currentDir = "$currentDir/${directory.getName()}"
        directory.iterator().forEach {
            it.accept(this)
        }
        currentDir = saveDir
    }


}