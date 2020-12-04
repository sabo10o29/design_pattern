package section4

fun main() {
    val factory = IDCardFactory()
    val card1 = factory.create("Bob")
    val card2 = factory.create("Alice")
    val card3 = factory.create("Jon")
    card1.use()
    card2.use()
    card3.use()
}