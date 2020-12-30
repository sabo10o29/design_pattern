package section17

interface Observer {
    abstract fun update(generator: NumberGenerator)
}