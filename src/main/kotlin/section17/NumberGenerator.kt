package section17

abstract class NumberGenerator {

    private val observers = mutableListOf<Observer>()
    fun addObserver(observer: Observer){
        observers.add(observer)
    }
    fun deleteObserver(observer: Observer){
        observers.remove(observer)
    }
    fun notifyObServer(){
        observers.forEach{
            it.update(this)
        }
    }
    abstract fun getNumber(): Int
    abstract fun execute()


}
