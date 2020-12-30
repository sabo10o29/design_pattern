package section17

class IncrementalNumberGenerator(
        private val st: Int,
        private val en: Int,
        private val interval: Int): NumberGenerator() {

    private var number = st

    override fun getNumber(): Int = number

    override fun execute() {
        for(i in st until en step interval){
            number = i
            notifyObServer()
        }
    }
}