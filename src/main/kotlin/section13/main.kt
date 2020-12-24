package section13

import section11.Directory
import section11.File

fun main(){

    println("Making root entries...")
    val rootdir = Directory("root")
    val bindir = Directory( "bin")
    val tmpdir = Directory( "tmp")
    val usrdir = Directory( "usr")

    rootdir.add(bindir)
    rootdir.add(tmpdir)
    rootdir.add(usrdir)

    bindir.add(File("vi", 10000))
    bindir.add(File("latex", 20000))

    rootdir.accept(ListVisitor())

    println("")
    println("Making user entries...")
    val yuki = Directory("yuki")
    val hanako = Directory("hanako")
    val tomura = Directory("tomura")
    usrdir.add(yuki)
    usrdir.add(hanako)
    usrdir.add(tomura)
    yuki.add(File("diary.html", 100))
    yuki.add(File("Composite.java", 200))
    hanako.add(File("memo.tex", 300))
    hanako.add(File("index.html", 300))
    tomura.add(File("game.doc", 400))
    tomura.add(File("junk.mail", 500))
    rootdir.accept(ListVisitor())

    println()

    val ffv = FileFindVisitor(".html")
    rootdir.accept(ffv)
    println("Html files are")
    ffv.getFoundFiles().forEach { it -> println(it.getName()) }


}