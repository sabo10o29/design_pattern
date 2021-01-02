package section19

object NightState: State {

    override fun doClock(context: Context, hour: Int) {
        if(hour in 9 until 17) context.changeState(NightState)
    }

    override fun doUse(context: Context) {
        context.recordLog("Use a safe (nighttime)")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("Emergency bell (nighttime)")
    }

    override fun doPhone(context: Context) {
        context.recordLog("Record call log (nighttime)")
    }

    override fun toString(): String {
        return "[Night time]"
    }

}