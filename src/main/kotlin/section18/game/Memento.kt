package section18.game

import kotlinx.serialization.Serializable

@Serializable
data class Memento(private val money: Int) {

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

    override fun toString(): String {
        return "money: $money, fruits: $fruits"
    }

}