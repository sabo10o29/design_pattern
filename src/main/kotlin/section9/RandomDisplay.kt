package section9

import java.sql.Time
import kotlin.random.Random

class RandomDisplay(impl: DisplayImpl): Display(impl) {

    //CountDisplayを継承してcountDisplayを呼ぶようにする
    fun randomDisplay(){
        open()
        repeat(Random.nextInt(1, 100)){
            print()
        }
        close()
    }

}