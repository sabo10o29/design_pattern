package section18.game

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import kotlin.random.Random

class Gamer(private val saveFilePath: String) {

    private var money = 100
    private var fruits = mutableListOf<Fruits>()
    private val random = Random(money)

    init {
        try{
            val st = File(saveFilePath).readText()
            var memento = Json.decodeFromString<Memento>(st)
            restoreMemento(memento)
        }catch (e: Exception){
            println("Failed to load save data.")
        }
    }



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

    public fun saveData(){
        val st = Json.encodeToString<Memento>(createMemento())
        File(saveFilePath).writeText(st)
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