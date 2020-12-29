package section16

interface Mediator {

    abstract fun createColleagues()
    abstract fun colleagueChanged(colleague: Colleague?)

}