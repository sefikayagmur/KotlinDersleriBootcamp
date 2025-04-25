package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    //nesne oluşturma
    val y1 = Yemekler(100,"Köfte",249)
    //Deger okuma
    y1.bilgiAl()
    //Değer atama/değiştirmek
    y1.fiyat =350
    y1.bilgiAl()

    val y2 = Yemekler(200,"Baklava",300)
    y2.bilgiAl()
    y2.ad= "Soğuk Baklava"
    y2.bilgiAl()


}