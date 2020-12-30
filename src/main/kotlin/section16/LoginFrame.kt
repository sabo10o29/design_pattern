package section16

import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class LoginFrame(private val title_val: String)
    : Frame(title_val), ActionListener, Mediator {

    private var checkGuest: ColleagueCheckbox? = null
    private var checkLogin: ColleagueCheckbox? = null
    private var textUser: ColleagueTextField? = null
    private var textPass: ColleagueTextField? = null
    private var buttonOK: ColleagueButton? = null
    private var buttonCancel: ColleagueButton? = null

    init {
        background = Color.LIGHT_GRAY
        layout = GridLayout(4, 2)

        createColleagues()

        add(checkGuest)
        add(checkLogin)
        add(Label("Username: "))
        add(textUser)
        add(Label("Password: "))
        add(textPass)
        add(buttonOK)
        add(buttonCancel)

        colleagueChanged(checkGuest)

        pack()
        isVisible = true

    }


    override fun actionPerformed(e: ActionEvent?) {
        println(e)
        System.exit(0)
    }

    override fun createColleagues() {
        val g = CheckboxGroup()
        checkGuest = ColleagueCheckbox("Guest", g, true)
        checkLogin = ColleagueCheckbox("Login", g, false)
        textUser = ColleagueTextField("", 10)
        textPass = ColleagueTextField("", 10)
        textPass!!.echoChar = '*'
        buttonOK = ColleagueButton("OK")
        buttonCancel = ColleagueButton("Cancel")

        checkGuest!!.setMediator(this)
        checkLogin!!.setMediator(this)
        textUser!!.setMediator(this)
        textPass!!.setMediator(this)
        buttonOK!!.setMediator(this)
        buttonCancel!!.setMediator(this)

        checkGuest!!.addItemListener(checkGuest)
        checkLogin!!.addItemListener(checkLogin)
        textUser!!.addTextListener(textUser)
        textPass!!.addTextListener(textPass)
        buttonOK!!.addActionListener(this)
        buttonCancel!!.addActionListener(this)
    }

    override fun colleagueChanged(colleague: Colleague?) {
        if(checkGuest!!.state){
            textUser!!.setColleagueEnabled(false)
            textPass!!.setColleagueEnabled(false)
            buttonOK!!.setColleagueEnabled(true)
        }else{
            textUser!!.setColleagueEnabled(true)
            userpassChanged()
        }
    }

    private fun  userpassChanged(){
        val nameLength = textUser!!.text.length
        val passLength = textPass!!.text.length

        if(nameLength > 3){
            textPass!!.setColleagueEnabled(true)
            if(passLength>3){
                buttonOK!!.setColleagueEnabled(true)
            }else{
                buttonOK!!.setColleagueEnabled(false)
            }
        }else{
            textPass!!.setColleagueEnabled(false)
            buttonOK!!.setColleagueEnabled(false)
        }
    }

}