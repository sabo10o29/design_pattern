package section7

class TextBuilder: Builder() {

    private val buffer = StringBuilder()

    override fun buildTitle(title: String) {
        buffer.append("================================\n")
        buffer.append(" [$title] \n")
        buffer.append("\n")
    }

    override fun buildString(str: String) {
        buffer.append("+$str\n")
        buffer.append("\n")
    }

    override fun buildItems(items: Array<String>) {
        items.iterator().forEach{ it ->
            buffer.append("-$it\n")
        }
        buffer.append("\n")
    }

    override fun buildDone() {
        buffer.append("================================\n")
    }

    fun getResult(): String{
        return buffer.toString()
    }


}