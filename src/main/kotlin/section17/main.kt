package section17

fun main(){

    val generator = RandomNumberGenerator()
    val o1 = DigitObServer()
    val o2 = GraphObserver()
    val o3 = ConcreteObserver(20)
    generator.addObserver(o1)
    generator.addObserver(o2)
    generator.addObserver(o3)
    generator.execute()

    println("=============================================")

    val generator2 = IncrementalNumberGenerator(10, 50, 5)
    generator2.addObserver(o1)
    generator2.addObserver(o2)
    generator2.addObserver(o3)
    generator2.execute()

}