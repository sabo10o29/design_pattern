package section12

class StringDisplay(private val string: String): Display() {

    override fun getColumns(): Int {
        return string.toByteArray().size
    }

    override fun getRows(): Int = 1

    override fun getRowText(row: Int): String? = if (row == 0) string else null


}