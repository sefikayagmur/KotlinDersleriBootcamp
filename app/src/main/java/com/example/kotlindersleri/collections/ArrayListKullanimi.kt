package com.example.kotlindersleri.collections

fun main(){
    //tanımlama
    val meyveler = ArrayList<String>()

    //veri Ekleme :en sonuna ekleme yapar
    meyveler.add("elma")//0
    meyveler.add("kiraz")//1
    meyveler.add("çilek")//2
    println(meyveler)

    //veri güncelleme
    meyveler[1]="yeni muz"
    println(meyveler)

    //ınsert :istediğimiz bir indeks
    meyveler.add(1,"portakal")
    println(meyveler)

    //okuma
    val m = meyveler.get(3)
    println(m)
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")

    meyveler.reverse()
    println(meyveler)

    for (meyve in meyveler) {
        println("sonuç :$meyve")
    }

        for ((indeks,meyve) in meyveler.withIndex()){
            println("$indeks. -> $meyve")
    }

    meyveler.removeAt(1)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}