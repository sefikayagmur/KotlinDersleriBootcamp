package com.example.kotlindersleri.degiskenler

fun main(){
    var id=1
    var ad="Mont"
    var resim="mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum =true

    println("Id : $id")
    println("Ad : $ad")
    println("Resim : $resim")
    println("Puan : $puan")
    println("Fiyat : $fiyat")
    println("Stok durum : $stokDurum ")

    //Sabitler - Constant
    var sayi = 30 //esnek yapı daha sonra içerisinde değer atanabilir daha fazla işlem yükü ister
    sayi= 100
    println(sayi)

    val numara =50 // daha az performan gerekiyor ne olacagı belli
    println(numara)

    //Tür dönüşümü
    //1 - Sayısaldan sayısala dönüşüm
    // dönüşümlerde val var yazmanın hiçbit farkı yoktur
    val d =89.56
    val i = 34
    val sonuc1 =d.toInt()
    val sonuc2 = i.toDouble()
    println(sonuc1)
    println(sonuc2 )

    //2-sayısaldan metine donüşüm
    var x = 85
    val sonuc3 = x.toString()//"85"
    println(sonuc3)

    //3- metinden sayısala dönüşüm
    val yazi ="48T"
    val sonuc4 = yazi.toIntOrNull()
    println(sonuc4)

    if(sonuc4 !=null)
    {
        println(sonuc4)
    }else{
        println("sonuç nulldur")
    }
}