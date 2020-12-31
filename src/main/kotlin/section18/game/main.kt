package section18.game

fun main(){

    val gamer = Gamer(100)
    var memento = gamer.createMemento()

    repeat(100){
        println("====$it")
        println("Now:$gamer")

        gamer.bet()

        println("Now, my money is ${gamer.getMoney()} yen.")

        if(gamer.getMoney() > memento.getMoney()){
            println("Save my money")
            memento = gamer.createMemento()
        }else if (gamer.getMoney() < memento.getMoney() / 2){
            println("Revert to prior save point.")
            gamer.restoreMemento(memento)
        }
        Thread.sleep(1000)
        println("")

    }


}