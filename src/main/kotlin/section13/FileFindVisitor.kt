package section13

import section11.Directory
import section11.File

class FileFindVisitor(private val ext: String): Visitor() {

    private val targetFileList = mutableListOf<File>()

    fun getFoundFiles(): MutableList<File>{
        return targetFileList
    }

    override fun visit(file: File) {
        if (file.getName().endsWith(ext)) targetFileList.add(file)
    }

    override fun visit(directory: Directory) {
        directory.iterator().forEach {
            it.accept(this)
        }
    }


}