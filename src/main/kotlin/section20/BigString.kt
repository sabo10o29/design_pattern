package section20

class BigString(private val string: String) {

    private var bigchars = mutableListOf<BigChar>()

    init {
        val factory = BigCharFactory.getInstance()
        for(i in 0 until string.length){
            bigchars.add(factory.getBigChar(string.toCharArray()[i]))
        }
    }

    public fun print(){
        bigchars.forEach { i -> i.print() }
    }

}