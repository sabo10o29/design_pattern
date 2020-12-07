package section7

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

const val HTML_EXT = ".html"

class HTMLBuilder(private val basePath: String): Builder() {

    private lateinit var filename: String
    private lateinit var writer: PrintWriter

    override fun buildTitle(title: String) {
        filename = title + HTML_EXT
        try {
            writer = PrintWriter(FileWriter(basePath+filename))
        }catch (e: IOException){

        }
        writer.println("<html><head><title>$title</title></head><body>")
        writer.println("<h1>$title</h1>")
    }

    override fun buildString(str: String) {
        writer.println("<p>$str</p>")
    }

    override fun buildItems(items: Array<String>) {
        writer.println("<ul>")
        items.iterator().forEach{ it ->
            writer.println("<li>$it</li>")
        }
        writer.println("</ul>")
    }

    override fun buildDone() {
        writer.println("</body></html>")
        writer.close()
    }

    fun getResult(): String{
        return filename
    }


}