package section10

fun main(){
    val seed1 = 12342
    val seed2 = 32242

    val p1 = Player("Taro", WinningStrategy(seed1))
    val p2 = Player("Ziro", ProbStrategy(seed2))

    repeat(10000){
        val p1_nextHand = p1.nextHand();
        val p2_nextHand = p2.nextHand();
        if(p1_nextHand.isStrongerThan(p2_nextHand)){
            println("Game $it: Winner $p1")
            p1.win()
            p2.lose()
        }else if(p2_nextHand.isStrongerThan(p1_nextHand)){
            println("Game $it: Winner $p2")
            p1.lose()
            p2.win()
        }else{
            println("Game $it: Even")
            p1.even()
            p2.even()
        }
    }
    println("Total result:")
    println(p1)
    println(p2)

}