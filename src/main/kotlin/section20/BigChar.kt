package section20

import java.io.BufferedReader
import java.io.FileReader

class BigChar(private val charName: Char) {

    init {

        val reader = BufferedReader(FileReader("big$charName.txt"))


    }

}