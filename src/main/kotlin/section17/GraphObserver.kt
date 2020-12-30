package section17

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        print("GraphObServer")
        repeat(generator.getNumber()){
            print("*")
        }
        println("")
        Thread.sleep(100)
    }
}