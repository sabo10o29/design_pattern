package section7

fun main() {
    val textBuilder = TextBuilder()
    val director1 = Director(textBuilder)
    director1.construct()
    val result1 = textBuilder.getResult()
    println(result1)

    val htmlBuilder = HTMLBuilder("./src/main/kotlin/section7/")
    val director2 = Director(htmlBuilder)
    director2.construct()
    val result2 = htmlBuilder.getResult()
    println("Create $result2 file")

    val httpsURLBuilder = HttpsURLBuilder()
    val director3 = Director2(httpsURLBuilder)
    director3.construct()
    val result3 = httpsURLBuilder.getResult()
    println("URL: $result3")


}