package section2

import java.io.File
import java.io.IOException

const val BASE = "./src/main/kotlin/section2/"

fun main() {
    val ff = File("./")
    println(ff.absolutePath)

    val f = FileProperties()
    try {
        f.readFromFile("${BASE}file.txt")
        f.setValue("year","2000")
        f.setValue("month","11")
        f.setValue("day","20")
        f.writeToFile("${BASE}newfile.txt")
    }catch(e: IOException){
        e.printStackTrace()
    }
}