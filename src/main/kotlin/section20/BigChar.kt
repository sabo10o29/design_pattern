package section20

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class BigChar(private val base: String, private val charName: Char) {

    private var fontData: String? = null

    init {
        fontData = File("${base}big$charName.txt").readText()
    }

    public fun print(){
        println(fontData)
    }

}