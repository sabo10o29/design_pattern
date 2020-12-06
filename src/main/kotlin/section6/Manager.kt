package section6

import java.util.*

class Manager {

    private val showcase = Hashtable<String, Product>()

    fun register(name: String, proto: Product){
        showcase.put(name, proto)
    }

    fun create(protoName: String): Product{
        val p = showcase[protoName]
        if (p != null) {
            return p.createClone()
        }else{
            throw IllegalStateException()
        }
    }

}