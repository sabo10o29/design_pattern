package section18.game

import kotlinx.serialization.json.Json
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.JsonElement
import java.io.File

const val BASE = "./src/main/kotlin/section18/"

fun main(){

    val saveDataPath = "${BASE}game.json"
    val gamer = Gamer(saveDataPath)
    var memento = gamer.createMemento()
    var tmpMoneyForSave = memento.getMoney()

    repeat(100){
        println("====$it")
        println("Now:$gamer")

        gamer.bet()

        println("Now, my money is ${gamer.getMoney()} yen.")

        if(gamer.getMoney() > memento.getMoney()){
            println("Save my money")
            memento = gamer.createMemento()

            if(gamer.getMoney() - tmpMoneyForSave > 500){
                tmpMoneyForSave = gamer.getMoney()
                gamer.saveData()
                println("@@@Save data because my money is more increased")
            }

        }else if (gamer.getMoney() < memento.getMoney() / 2){
            println("Revert to prior save point.")
            gamer.restoreMemento(memento)
        }

        Thread.sleep(1000)
        println("")

    }

}
