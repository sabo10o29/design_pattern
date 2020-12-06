package section6

const val BOX_WIDTH = 4

class MessageBox(private val decoChar: Char): Product() {

    override fun use(s: String) {
        val length = s.toByteArray().size
        repeat(length + BOX_WIDTH){
            print(decoChar)
        }
        println("")
        println("$decoChar $s $decoChar")
        repeat(length + BOX_WIDTH){
            print(decoChar)
        }
        println()
    }
//    override fun createClone(): Product {
//        val p = clone()
//        if(p is Product){
//            return p
//        }else{
//            throw IllegalStateException()
//        }
//    }

}