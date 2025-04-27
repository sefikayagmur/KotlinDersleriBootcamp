package com.example.kotlindersleri.collections

fun main() {
    //HashMap json veri modeline benzemektedir.
    //Map.Dictionary(Swift)
    //Shared Preferences,DataStore,UserDefault(Swift) benziyor.
    val iller = HashMap<Int, String>()

    iller.put(16,"Bursa")
    iller[34] ="İSTANBUL"
    iller[6] ="ankara"
    println(iller)

    iller[16]="yani bursa"
    println(iller)

    val il = iller[6]
    println(il)

    println("Boyut :${iller.size}")

    for ((anahtar,deger)in iller){
        println("$anahtar -> $deger")
    }

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)


}