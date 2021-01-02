package section19

object DayState : State {

    override fun doClock(context: Context, hour: Int) {
        if(hour > 9 || 17 <= hour) context.changeState(NightState)
    }

    override fun doUse(context: Context) {
        context.recordLog("Use a safe (daytime)")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("Emergency bell (daytime)")
    }

    override fun doPhone(context: Context) {
        context.recordLog("Record call log (daytime)")
    }

    override fun toString(): String {
        return "[Day time]"
    }
}