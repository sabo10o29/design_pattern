package section17

class ConcreteObserver(private val target: Int): Observer {

    override fun update(generator: NumberGenerator) {
        if(target == generator.getNumber()) println("$target is generated.")
    }
}