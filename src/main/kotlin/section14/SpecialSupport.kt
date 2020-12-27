package section14

class SpecialSupport(private val name: String, private val number: Int): Support(name) {

    override fun resolve(trouble: Trouble): Boolean = trouble.getNumber() == number

}