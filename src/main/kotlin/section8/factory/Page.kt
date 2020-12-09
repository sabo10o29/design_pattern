package section8.factory

import java.io.FileWriter
import java.io.IOException
import java.util.*

abstract class Page(val title: String, val author: String) {

    protected val content = Vector<Item>()

    fun add(item: Item){
        content.add(item)
    }

    fun output(){
        try{
            val filename = "$title.html"
            val writer = FileWriter(filename)
            writer.write(this.makeHTML())
            writer.close()
            println("Success to create $filename.")
        }catch (e: IOException){
            e.printStackTrace()
        }
    }

    abstract fun makeHTML(): String


}