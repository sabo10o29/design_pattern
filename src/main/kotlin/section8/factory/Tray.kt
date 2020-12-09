package section8.factory

import java.util.*

abstract class Tray(private val caption2: String): Item(caption2) {

    protected val tray = Vector<Item>()

    fun add(item: Item){
        tray.add(item)
    }

}