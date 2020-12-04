package section4

class IDCard: Product {

    final val owner: String
    final val serial: Int

    constructor(owner: String, serial: Int){
        this.owner = owner
        this.serial = serial
        println("Create a card for $owner($serial)")
    }

    override fun use() {
        println("Use $owner($serial) card")
    }

}