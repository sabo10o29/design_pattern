package section12

class FullBorder(private val display: Display): Border(display) {

    override fun getColumns(): Int = display.getColumns() + 2

    override fun getRows(): Int = display.getRows() + 2

    override fun getRowText(row: Int): String? = when(row){
        0 -> "+${makeLine('-', display.getColumns())}+"
        display.getRows() + 1 -> "+${makeLine('-', display.getColumns())}+"
        else -> "|${display.getRowText(row - 1)}|"
    }

    private fun makeLine(char: Char, count: Int): String{
        val builder = StringBuilder()
        repeat(count){
            builder.append(char)
        }
        return builder.toString()
    }


}