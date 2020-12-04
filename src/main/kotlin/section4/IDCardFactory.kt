package section4

import java.lang.IllegalArgumentException
import kotlin.collections.HashMap

class IDCardFactory: Factory() {

    private var numCards = 0
    private val owners = HashMap<Int, String>()

    override fun createProduct(owner: String): Product {
        synchronized(numCards){
            val card = IDCard(owner, numCards)
            numCards++
            return card
        }
    }

    override fun registerProduct(product: Product) {
        if(product is IDCard){
            synchronized(owners){
                owners[product.serial] = product.owner
            }
        }else{
            throw IllegalArgumentException()
        }
    }


}