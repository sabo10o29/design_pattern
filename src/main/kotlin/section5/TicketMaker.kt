package section5

object TicketMaker {

    private var ticket = 1000
    public fun getNextTicketNumber(): Int{
        return ticket++
    }
}