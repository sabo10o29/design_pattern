package section16

import java.awt.Checkbox
import java.awt.CheckboxGroup
import java.awt.event.ItemEvent
import java.awt.event.ItemListener

class ColleagueCheckbox(
        private val caption: String,
        private val group: CheckboxGroup,
        private val state_val: Boolean)
    : Checkbox(caption, group, state_val), ItemListener, Colleague {

    private var mediator: Mediator? = null

    override fun itemStateChanged(e: ItemEvent?) {
        mediator!!.colleagueChanged(this)
    }

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
    }


}