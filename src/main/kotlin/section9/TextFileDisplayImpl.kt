package section9

import java.io.File

class TextFileDisplayImpl(private val filaname: String): DisplayImpl() {

    override fun rawOpen() {
        println("Open $filaname")
    }

    override fun rawPrint() {
        val f = File(filaname)
        f.readLines().forEach { line ->
            println(line)
        }
    }

    override fun rawClose() {
        println("End file")
    }


}