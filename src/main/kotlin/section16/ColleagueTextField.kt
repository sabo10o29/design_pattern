package section16

import java.awt.Color
import java.awt.TextField
import java.awt.event.TextEvent
import java.awt.event.TextListener

class ColleagueTextField(private val text_val: String,
                         private val columns_val: Int)
    : TextField(text_val, columns_val), TextListener, Colleague {

    private var mediator: Mediator? = null

    override fun textValueChanged(e: TextEvent?) {
        mediator!!.colleagueChanged(this)
    }

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
        background = if(enabled) Color.WHITE else Color.LIGHT_GRAY
    }
}