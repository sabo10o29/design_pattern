package section18.game

import kotlin.random.Random

class Gamer(private var money: Int) {

    private var fruits = mutableListOf<Fruits>()
    private val random = Random(money)

    public fun getMoney(): Int{
        return money
    }

    public fun bet(){
        when(random.nextInt(6) + 1){
            1 -> {
                money += 100
                println("Get 100 yen!!")
            }
            2 -> {
                money /= 2
                println("Lost half of my money.")
            }
            6 -> {
                val fruit = getFruit()
                println("Get a $fruit !!")
                fruits.add(fruit)
            }
            else -> {
                println("Nothing to do")
            }
        }
    }

    public fun createMemento(): Memento{
        val m = Memento(money)
        fruits.forEach{
            if(it.isSpecial()) m.addFruit(it)
        }
        return m
    }

    public fun restoreMemento(memento: Memento){
        this.money = memento.getMoney()
        this.fruits = memento.getFruits()
    }

    private fun getFruit(): Fruits {
        return Fruits.getFruitFromIndex(random.nextInt(Fruits.values().size))

    }

    override fun toString(): String {
        return "[money= $money, fruits = $fruits]"
    }


}