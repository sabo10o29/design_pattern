package section6

class UnderlinePen(private val ulChar: Char): Product() {

    override fun use(s: String) {
        val length = s.toByteArray().size
        println("\"$s\"")
        print(" ")
        repeat(length){
            print(ulChar)
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