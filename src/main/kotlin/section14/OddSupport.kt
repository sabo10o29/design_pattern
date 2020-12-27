package section14

class OddSupport(private val name: String): Support(name) {

    override fun resolve(trouble: Trouble): Boolean = trouble.getNumber() % 2 == 1


}