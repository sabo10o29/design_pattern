package section13

import section11.Directory
import section11.File

abstract class Visitor {

    abstract fun visit(file: File)
    abstract fun visit(directory: Directory)

}