package section12

abstract class Display {

    abstract fun getColumns(): Int
    abstract fun getRows(): Int
    abstract fun getRowText(row: Int): String?
    final fun show(){
        repeat(getRows()){
            println(getRowText(it))
        }
    }

}