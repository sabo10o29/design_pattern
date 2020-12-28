package section15

const val BASE = "./src/main/kotlin/section15/"

fun main(){
    PageMaker.makeWelcomePage("tanaka@sabo10.com", "${BASE}welcome.html")
    PageMaker.makeLinkPage("${BASE}linkpage.html")
}