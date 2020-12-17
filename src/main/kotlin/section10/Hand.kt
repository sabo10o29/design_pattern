package section10

enum class Hand(private val hand_val: Int, private val disp: String) {

    ROCK(0, "GUU"),
    SCISSORS(1, "CHO"),
    PAPER(2, "PAA");

    companion object{
        fun getHand(id: Int): Hand{
            return Hand.values()[id]
        }
    }

    fun isStrongerThan(hand: Hand): Boolean{
        return fight(hand) == 1
    }

    fun isWeakerThan(hand: Hand): Boolean{
        return fight(hand) == -1
    }

    private fun fight(hand: Hand): Int{
        return when(hand.hand_val){
            this.hand_val               -> { 0 }
            ((this.hand_val + 1) % 3)   -> { 1 }
            else                        -> { -1 }
        }
    }

    override fun toString(): String{
        return this.disp
    }

}