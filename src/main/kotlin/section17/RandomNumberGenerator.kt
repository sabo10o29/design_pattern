package section17

import kotlin.random.Random

class RandomNumberGenerator: NumberGenerator() {

    private val random = Random(1234)
    private var number = 0

    override fun getNumber(): Int = number

    override fun execute() {
        repeat(20){
            number = random.nextInt(50)
            notifyObServer()
        }
    }
}