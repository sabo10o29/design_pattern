package section15

import java.io.FileInputStream
import java.io.IOException
import java.util.*

class Database(){

    companion object{

        fun getProperties(dbname: String): Properties{

            val filename = "$dbname.txt"
            val prop = Properties()

            try{
                prop.load(FileInputStream(filename))
            }catch (e: IOException){
                println(e)
            }
            return prop

        }


    }

}
