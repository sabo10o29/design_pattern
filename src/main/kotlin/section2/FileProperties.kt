package section2

import java.io.FileInputStream
import java.io.FileOutputStream
import java.util.Properties

const val COMMENTS = "written by FileProperties"

class FileProperties(): FileIO {

    private val properties = Properties()

    override fun readFromFile(filename: String) {
        val i = FileInputStream(filename)
        properties.load(i)
    }

    override fun writeToFile(filename: String) {
        val o = FileOutputStream(filename)
        properties.store(o, COMMENTS)
    }

    override fun setValue(key: String, value: String) {
        properties.setProperty(key, value)
    }

    override fun getValue(key: String): String {
        return properties.getProperty(key)
    }

}
