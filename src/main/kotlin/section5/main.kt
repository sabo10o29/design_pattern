package section5

import kotlin.concurrent.thread

fun main() {
    println("Start.")
    val obj1 = Singleton
    val obj2 = Singleton
    if(obj1 == obj2){
        println("obj1 and obj2 are same instance.")
    }else{
        println("obj1 and obj2 are NOT same instance.")
    }
    println("End.")

    //練習5-1
    val maker1 = TicketMaker
    val maker2 = TicketMaker
    repeat(100){
        thread { println("Maker1: ${maker1.getNextTicketNumber()}") }
        thread { println("Maker2: ${maker2.getNextTicketNumber()}") }
    }

    //練習5-2
    val tri1 = Triple.getInstance(0)
    val tri2 = Triple.getInstance(1)
    val tri3 = Triple.getInstance(2)
    val tri4 = Triple.getInstance(2)
    if(tri1 == tri2){
        println("tri1 and tri2 are same instance.")
    }else if(tri2 == tri3){
        println("tri2 and tri3 are same instance.")
    }else if(tri1 == tri3){
        println("tri1 and tri3 are same instance.")
    }else{
        println("tri1, tri2 and tri3 are NOT same instance.")
    }
    if(tri3 == tri4){
        println("tri3 and tri4 are same instance.")
    }else{
        println("tri3 and tri4 are NOT same instance.")
    }





}