package section19

interface Context {

    abstract fun setClock(hour: Int)
    abstract fun changeState(state: State)
    abstract fun callSecurityCenter(msg: String)
    abstract fun recordLog(msg: String)

}
