package section15

import java.io.FileWriter
import java.io.IOException

class PageMaker private constructor(){

    companion object{
        fun makeWelcomePage(mailaddr: String, filename: String){
            try{
                val mailprop = Database.getProperties("./src/main/kotlin/section15/maildata")
                val username = mailprop.getProperty(mailaddr)
                val writer = HtmlWriter(FileWriter(filename))
                writer.title("Welcome to $username's page!")
                writer.paragraph("${username}のページへようこそ。")
                writer.paragraph("")
                writer.mailto(mailaddr, username)
                writer.close()
                println("$filename is created for $mailaddr ($username)")
            }catch (e: IOException){
                e.printStackTrace()
            }
        }

    }


}