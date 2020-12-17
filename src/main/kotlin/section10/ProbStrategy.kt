package section10

import kotlin.random.Random

class ProbStrategy(private val seed: Int): Strategy {

    private var random: Random = Random(seed)
    private var prevHand: Hand = randomHand()
    private var won: Boolean = false

    override fun nextHand(): Hand {
        TODO("Not yet implemented")
    }

    override fun study(win: Boolean) {
        TODO("Not yet implemented")
    }

    private fun randomHand(): Hand{
        return Hand.getHand(random.nextInt(0, 2))
    }
}