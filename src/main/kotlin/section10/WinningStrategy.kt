package section10

import kotlin.random.Random

class WinningStrategy(private val seed: Int): Strategy {

    private var random: Random = Random(seed)
    private var prevHand: Hand = randomHand()
    private var won: Boolean = false

    override fun nextHand(): Hand {
        return if (won) prevHand else randomHand()
    }

    override fun study(win: Boolean) {
        won = win
    }

    private fun randomHand(): Hand{
        return Hand.getHand(random.nextInt(0, 2))
    }
}