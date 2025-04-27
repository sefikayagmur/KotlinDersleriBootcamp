package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    val a= ClassA()

   /* //standart nesne tabanlı erişim
    println(a.x)
    a.metod()

    //sanal nesne-virtural object - nameless(isimsiz)ıbject
    println(ClassA.x)//1.nesne
    ClassA().metod()//2.nesne  */

    //Static Kullanımı
    println(ClassA.x)//1.nesne
    ClassA.metod()//2.nesne
}