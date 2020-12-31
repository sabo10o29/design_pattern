package section18.game

class Memento(private val money: Int) {

    private val fruits = mutableListOf<Fruits>()

    public fun getMoney(): Int{
        return money
    }

    fun addFruit(fruit: Fruits){
        fruits.add(fruit)
    }

    fun getFruits(): MutableList<Fruits>{
        return fruits
    }

}