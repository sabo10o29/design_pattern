package section20

fun main() {

    Runtime.getRuntime().gc()
    var bs1 = BigString("12165234324351532432657698707", true) as BigString?
    var used1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()
    println("1 true Memory: $used1")
    bs1 = null

    Runtime.getRuntime().gc()
    var bs2 = BigString("12165234324351532432657698707", false) as BigString?
    val used2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()
    println("2 false Memory: $used2")
    bs2 = null

    Runtime.getRuntime().gc()
    var bs3 = BigString("12165234324351532432657698707", true) as BigString?
    val used3 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()
    println("3 true Memory: $used3")
    bs3 = null

    Runtime.getRuntime().gc()
    var bs4 = BigString("12165234324351532432657698707", false) as BigString?
    val used4 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()
    println("4 false Memory: $used4")
    bs4 = null

}