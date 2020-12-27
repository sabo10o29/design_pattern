package section14

class NoSupport(private val name: String): Support(name) {

    override fun resolve(trouble: Trouble): Boolean {
        return false
    }

}