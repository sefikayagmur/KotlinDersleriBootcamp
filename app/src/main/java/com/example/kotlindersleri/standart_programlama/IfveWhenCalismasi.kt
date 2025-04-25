package com.example.kotlindersleri.standart_programlama

fun main(){
    val yas =17

    println(yas >= 18)

    if(yas >= 18){//true
        println("Reşitsiniz")
    }else{
        println("Reşit Değilsiniz")
    }

    val ka = "admin"
    val s =12345
    val sayi =10

    if(ka =="admin" && s==12345) {//&& = And(ve), true&&true ise  true olur, diğer durumlarda false olur
        println("Hoşgeldiniz")
    }else{
        println("Hatali Giriş")
    }

    if(sayi == 9 || sayi == 10) {// ||Or(veya), false ise false olur, diğer durumlarda true olur.
        println("sayi 9 veya 10 dur")
    }else{
        println("sayi 9 veya 10 değildir")
    }

    // When ,Diğer dillerde switch
    val number =5

    when(number){
        1 -> println("Sayı 1'dir")
        2 -> println("Sayı 2'dir")
        else -> println("Tanımlanmayan sayı")
    }

    //1,2,3
    var sayac =1

    while(sayac < 4){
        println("Döngü 4 : $sayac")
        sayac+=1//sayac=sayac+1
    }
}