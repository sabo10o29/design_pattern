package section11

fun main(){

    println("Making root entries...")
    val rootdir = Directory("root")
    val bindir = Directory("bin")
    val tmpdir = Directory("tmp")
    val usrdir = Directory("usr")

    rootdir.add(bindir)
    rootdir.add(tmpdir)
    rootdir.add(usrdir)

    bindir.add(File("vi", 10000))
    bindir.add(File("latex", 20000))

    rootdir.printList()


}