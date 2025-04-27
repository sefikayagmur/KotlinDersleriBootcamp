package com.example.kotlindersleri.collections

fun main(){
    //HASHSET
    //Tanımlama
    val meyveler = HashSet<String >()
//Any -> en üst sınıf demek
    //bütün türleri kapsar
    //java ->object
    meyveler.add("elma")
    meyveler.add("muz")
    meyveler.add("kiraz")
    println(meyveler)

    meyveler.add("Amasya elma")
    println(meyveler)

    val y = meyveler.elementAt(2)
    println(y)

    println("boyut :${meyveler.size}")

    for (meyve in meyveler) {
        println("sonuç :$meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){
        println("$indeks. -> $meyve")
    }

    meyveler.remove("elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)


}
