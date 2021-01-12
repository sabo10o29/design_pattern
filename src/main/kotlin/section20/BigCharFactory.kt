package section20

import kotlin.math.sign

const val BASE = "./src/main/kotlin/section20/"

class BigCharFactory {

    private constructor()

    private val pool = mutableMapOf<String, BigChar?>()

    companion object{

        private val singleton = BigCharFactory()
        public fun getInstance(): BigCharFactory{
            return singleton
        }
    }

    public fun getBigChar(charName: Char): BigChar{
        var bc = pool[charName.toString()]
        if(bc != null ){
            return bc
        }else{
            bc = BigChar(BASE, charName)
            pool[charName.toString()] = bc
            return bc
        }
    }

    public fun getBigChar(charName: Char, shared: Boolean): BigChar{
        return if(shared) getBigChar(charName) else BigChar(BASE, charName)
    }


}