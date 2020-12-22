package section12

class MultiStringDisplay: Display() {

    private val texts = mutableListOf<String>()

    fun add(str: String){
        texts.add(str)
    }

    override fun getColumns(): Int {
        val str = texts.maxBy { it -> it.length }
        return str!!.length
    }

    override fun getRows(): Int {
        return texts.size
    }

    override fun getRowText(row: Int): String? {
        return if(texts.size <= row || row < 0) throw IllegalArgumentException() else adjustStr(texts[row])
    }

    private fun adjustStr(str: String): String{
        val max = getColumns()
        return if (str.length < max){
            val num = max - str.length
            val builder = StringBuilder(str)
            repeat(num){
                builder.append(" ")
            }
            builder.toString()
        }else{
            str
        }
    }

}