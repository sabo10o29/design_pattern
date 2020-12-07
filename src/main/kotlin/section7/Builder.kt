package section7

abstract class Builder {

    private var initialize = false

    fun makeTitle(title: String){
        synchronized(initialize){
            if(initialize){
                throw IllegalStateException()
            }else{
                initialize = true
                buildTitle(title)
            }
        }
    }

    fun makeString(str: String){
        synchronized(initialize){
            if (initialize){
                buildString(str)
            }else{
                throw IllegalStateException()
            }
        }
    }
    fun makeItems(items: Array<String>){
        synchronized(initialize){
            if(initialize){
                buildItems(items)
            }else{
                throw IllegalStateException()
            }
        }
    }
    fun close(){
        synchronized(initialize){
            if (initialize){
                buildDone()
            }else{
                throw IllegalStateException()
            }
        }
    }

    abstract fun buildTitle(title: String)
    abstract fun buildString(str: String)
    abstract fun buildItems(items: Array<String>)
    abstract fun buildDone()




}