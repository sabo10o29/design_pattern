package section14

class LimitSupport(private val name: String, private val limit: Int): Support(name) {

    override fun resolve(trouble: Trouble): Boolean = trouble.getNumber() < limit


}