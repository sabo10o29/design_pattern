package section5

class Triple {

    companion object{
        private val instances = listOf(Triple(),Triple(),Triple())

        fun getInstance(id: Int): Triple{
            if(id > 2) throw IllegalArgumentException()
            return instances[id]
        }
    }


}