package section8.factory

import java.lang.Exception
import java.lang.IllegalStateException

abstract class Factory {

    companion object{
        fun getFactory(className: String): Factory {
            try{
                val factory = Class.forName(className).newInstance()
                if (factory is Factory){
                    return factory
                }
            }catch (e: ClassNotFoundException){
                println("$className was not found.")
            }catch (e: Exception){
                e.printStackTrace()
            }
            return throw Exception()
        }
    }

    abstract fun createLink(caption : String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page


}