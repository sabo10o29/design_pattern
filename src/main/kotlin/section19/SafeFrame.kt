package section19

import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class SafeFrame(title: String): Frame(title), ActionListener, Context {

    private val textClock = TextField(60)
    private val textScreen = TextArea(10,60)
    private val buttonUse = Button("Use a safe")
    private val buttonAlarm = Button("Emergency bell")
    private val buttonPhone = Button("Call")
    private val buttonExit = Button("Quit")
    private var state: State = DayState

    init {
        background = Color.lightGray
        layout = BorderLayout()
        add(textClock, BorderLayout.NORTH)
        textClock.isEditable = false
        add(textScreen, BorderLayout.CENTER)
        textScreen.isEditable = false
        val panel = Panel()
        panel.add(buttonUse)
        panel.add(buttonAlarm)
        panel.add(buttonPhone)
        panel.add(buttonExit)
        add(panel, BorderLayout.SOUTH)
        pack()
        show()

        buttonUse.addActionListener(this)
        buttonAlarm.addActionListener(this)
        buttonPhone.addActionListener(this)
        buttonExit.addActionListener(this)
    }


    override fun actionPerformed(e: ActionEvent?) {
        println(e)
        when(e!!.source){
            buttonUse -> state.doUse(this)
            buttonAlarm -> state.doAlarm(this)
            buttonAlarm -> state.doAlarm(this)
            buttonPhone -> state.doPhone(this)
            buttonExit -> System.exit(0)
            else -> println("?")
        }
    }

    override fun setClock(hour: Int) {
        val text = "Current time: ${if(hour>10) "0$hour:00" else "$hour:00"}"
        println(text)
        textClock.text = text
        state.doClock(this, hour)
    }

    override fun changeState(state: State) {
        println("Change state from ${this.state} to $state")
        this.state = state
    }

    override fun callSecurityCenter(msg: String) {
        textScreen.append("call! $msg \n")
    }

    override fun recordLog(msg: String) {
        textScreen.append("record... $msg \n")
    }


}