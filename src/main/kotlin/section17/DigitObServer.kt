package section17

class DigitObServer: Observer {

    override fun update(generator: NumberGenerator) {
        println("DigitObserver: ${generator.getNumber()}")
        Thread.sleep(100)

    }

}