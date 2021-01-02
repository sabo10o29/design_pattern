package section19

import java.lang.Thread.*

fun main() {

    val frame = SafeFrame("State Sample")
    while(true){

        (0 until 24).forEach {
            frame.setClock(it)
            sleep(1000)
        }


    }

}