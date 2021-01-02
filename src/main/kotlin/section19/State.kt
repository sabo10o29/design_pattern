package section19

interface State {

    abstract fun doClock(context: Context, hour: Int)
    abstract fun doUse(context: Context)
    abstract fun doAlarm(context: Context)
    abstract fun doPhone(context: Context)

}