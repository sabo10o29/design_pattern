package section10

import kotlin.random.Random

class RandomStrategy(private val seed: Int): Strategy {

    private var random: Random = Random(seed)

    override fun nextHand() = Hand.getHand(random.nextInt(0, 2))

    override fun study(win: Boolean) {}


}