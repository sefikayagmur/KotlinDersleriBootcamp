package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){

    //1.soru
    val odev = Odev2()  // Odev2 sınıfından bir nesne oluşturduk
    val derece = 25.0    // 25 dereceyi örnek aldık
    val sonuc = odev.dereceToFahrenheit(derece) // fonksiyonu çağırdık
    println("$derece derece = $sonuc Fahrenheit")

    //2.soru
    val uzunKenar = 8
    val kisaKenar = 5
    val cevre = odev.dikdortgenCevre(uzunKenar, kisaKenar)
    println("Dikdörtgenin çevresi: $cevre")

    //3.soru
    val sayi = 5
    val sonuc3 = odev.faktoriyelHesapla(sayi)
    println("$sayi sayısının faktöriyeli: $sonuc3")

    //4.soru
    val kelime = "Antalya"
    val sonuc4 = odev.aHarfiniSay(kelime)
    println("Kelime içinde $sonuc4 adet 'a' harfi var.")

    //5.soru
    val kenar = 5
    val sonuc5 = odev.icAcilarToplami(kenar)
    println("$kenar kenarlı bir şeklin iç açılar toplamı: $sonuc5 derece")

    //6.soru
    val gun = 22
    val maas = odev.maasHesapla(gun)
    println("$gun gün çalışmanın maaşı: $maas ₺")

    //7.soru
    val kota = 60
    val ucret = odev.kotaHesapla(kota)
    println("Kota ücreti: $ucret ₺")
}