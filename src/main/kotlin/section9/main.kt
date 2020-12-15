package section9

const val BASE = "./src/main/kotlin/section9/"

fun main() {
    val d1 = Display(StringDisplayImpl("Hello, Japan."))
    val d2 = CountDisplay(StringDisplayImpl("Hello, World."))
    val d3 = CountDisplay(StringDisplayImpl("Hello, Universe."))
    val d4 = RandomDisplay(StringDisplayImpl("Helloooooo."))
    val d5 = Display(TextFileDisplayImpl("${BASE}test.txt"))

    d1.display()
    d2.display()
    d3.display()
    d3.multiDisplay(5)
    d4.randomDisplay()
    d5.display()
}