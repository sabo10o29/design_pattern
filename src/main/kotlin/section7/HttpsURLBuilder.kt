package section7

class HttpsURLBuilder: Builder() {

    private val buffer = StringBuilder()

    override fun buildTitle(title: String) {
        buffer.append("https://$title")
    }

    override fun buildString(str: String) {
        buffer.append("$str/")
    }

    override fun buildItems(items: Array<String>) {
        items.iterator().forEach{ it ->
            buffer.append("$it/")
        }
    }

    override fun buildDone() {

    }

    fun getResult(): String{
        return buffer.toString()
    }


}