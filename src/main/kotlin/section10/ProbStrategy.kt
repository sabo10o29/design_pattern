package section10

import kotlin.random.Random

class ProbStrategy(private val seed: Int): Strategy {

    private var random: Random = Random(seed)
    private var prevHand: Hand = randomHand()
    private var currentHand: Hand = randomHand()
    private var won: Boolean = false
    private var history: MutableList<MutableList<Int>> = MutableList(3){MutableList(3){1}}

    override fun nextHand(): Hand {
        val bet = random.nextInt(getSum(currentHand.hand_val))
        val handValue = when{
            bet < history[currentHand.hand_val][0] -> {0}
            bet < history[currentHand.hand_val][0] + history[currentHand.hand_val][1] -> {1}
            else -> {2}
        }
        prevHand = currentHand
        currentHand = Hand.getHand(handValue)
        return currentHand
    }

    private fun getSum(hv: Int): Int{
        var sum = 0
        repeat(3){
            sum += history[hv][it]
        }
        return sum
    }

    override fun study(win: Boolean) {
        if (win){
            history[prevHand.hand_val][currentHand.hand_val]++
        }else{
            history[prevHand.hand_val][(currentHand.hand_val+1)%3]++
            history[prevHand.hand_val][(currentHand.hand_val+2)%3]++
        }
    }

    private fun randomHand(): Hand{
        return Hand.getHand(random.nextInt(0, 2))
    }

}