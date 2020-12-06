package section6

abstract class Product: Cloneable {

    abstract fun use(s: String)

    fun createClone(): Product{
        val p = clone()
        if(p is Product){
            return p
        }else{
            throw IllegalStateException()
        }
    }

}