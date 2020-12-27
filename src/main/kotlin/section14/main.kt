package section14

fun main(){

    val alice = NoSupport("Alice")
    val bob = LimitSupport("Bob", 100)
    val charlie = SpecialSupport("Charlie", 429)
    val diana = LimitSupport("Diana", 200)
    val elmo = OddSupport("Elmo")
    val fred = LimitSupport("Fred", 300)
    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred)

    repeat(500){
        if(it%33==0) alice.support(Trouble(it))
    }

}