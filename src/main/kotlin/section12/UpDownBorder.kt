package section12

class UpDownBorder(private val display: Display, private val borderChar: Char): Border(display) {

    override fun getColumns(): Int = display.getColumns()

    override fun getRows(): Int = display.getRows() + 2

    override fun getRowText(row: Int): String? = when(row){
        0 -> "${makeLine(borderChar, display.getColumns())}"
        display.getRows() + 1 -> "${makeLine(borderChar, display.getColumns())}"
        else -> "${display.getRowText(row - 1)}"
    }

    private fun makeLine(char: Char, count: Int): String{
        val builder = StringBuilder()
        repeat(count){
            builder.append(char)
        }
        return builder.toString()
    }
}