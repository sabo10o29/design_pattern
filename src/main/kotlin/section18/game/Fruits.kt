package section18.game

enum class Fruits(private val fruit_name: String, private val special: Boolean) {

    APPLE("Apple", false),
    GRAPE("Grape", false),
    BANANA("Banana", false),
    ORANGE("Orange", false),
    SPECIAL_APPLE("Delicious Apple", true),
    SPECIAL_GRAPE("Delicious  Grape", true),
    SPECIAL_BANANA("Delicious Banana", true),
    SPECIAL_ORANGE("Delicious Orange", true);

    public fun isSpecial(): Boolean{
        return this.special
    }

    companion object {
        public fun getFruitFromIndex(index: Int): Fruits {
            return Fruits.values()[index]
        }
    }

    override fun toString(): String {
        return fruit_name
    }

}