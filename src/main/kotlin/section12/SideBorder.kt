package section12

class SideBorder(private val display: Display, private val borderChar: Char): Border(display) {

    override fun getColumns(): Int = display.getColumns() + 2

    override fun getRows(): Int = display.getRows()

    override fun getRowText(row: Int): String? = "$borderChar${display.getRowText(row)}${borderChar}"


}