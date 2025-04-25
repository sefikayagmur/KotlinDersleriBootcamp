package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    val f = Fonksiyonlar()

    //void=Unit
    f.selamla1()

    //retun
    val gelenSonuc =f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    //parametre
    f.selamla3("zeynep")

    f.topla(10,20,"Beyza")
}