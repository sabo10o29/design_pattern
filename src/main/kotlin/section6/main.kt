package section6

fun main() {

    val m = Manager()
    val upen = UnderlinePen('~')
    val mbox = MessageBox('*')
    m.register("strong message", upen)
    m.register("warning box", mbox)

    val p1 = m.create("strong message")
    p1.use("Hello world!")
    val p2 = m.create("warning box")
    p2.use("Hello world!")



}