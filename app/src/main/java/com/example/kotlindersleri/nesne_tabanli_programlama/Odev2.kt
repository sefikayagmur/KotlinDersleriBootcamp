package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {

    //1.soru=Parametre olarak girilen dereceyi fahrenhiet'a dönüştürdükten sonra geri döndüren bir metod yazınız.
    fun dereceToFahrenheit(derece: Double): Double {
        val fahrenheit = derece * 1.8 + 32
        return fahrenheit
    }

    //2.soru=Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir metod yazınız.
    fun dikdortgenCevre(uzunKenar: Int, kisaKenar: Int): Int {
        val cevre = 2 * (uzunKenar + kisaKenar)
        return cevre
    }

    //3.soru=Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız.
    fun faktoriyelHesapla(sayi: Int): Int {
        var faktoriyel = 1
        for (i in 1..sayi) {
            faktoriyel *= i
        }
        return faktoriyel
    }

    //4.soru=parametre olarak girilen kelşme içinde kaç adet a harfi olduğunu gösteren bir metod yazınız.
    fun aHarfiniSay(kelime: String): Int {
        var sayac = 0
        for (harf in kelime) {
            if (harf == 'a' || harf == 'A') {
                sayac++
            }
        }
        return sayac
    }

    /*soru5=Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen metod yazınız.
    · İç açılar toplamı = (Kenar sayısı - 2) x 180*/
    fun icAcilarToplami(kenarSayisi: Int): Int {
        val toplam = (kenarSayisi - 2) * 180
        return toplam
    }

    /*soru6=Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
            · 1 günde 8 saat çalışılabilir.
            · Çalışma saat ücreti : 10 ₺
            . Mesai saat ucreti : 20 ₺
            · 160 saat üzeri mesai sayılır.*/
    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        var maas = 0

        if (toplamSaat <= 160) {
            maas = toplamSaat * 10
        } else {
            val mesaiSaati = toplamSaat - 160
            maas = (160 * 10) + (mesaiSaati * 20)
        }
        return maas
    }

    /*7.soru=Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.
             . 50 GB = 100 ₺
             · Kota aşımından sonra her 1 GB, 4 ₺'dir.*/
    fun kotaHesapla(kotaMiktari: Int): Int {
        val kotaLimit = 50  // 50 GB kota
        val kotaUcreti = 100  // 50 GB için 100 ₺
        val ekFiyatPerGb = 4  // Kota aşımında her 1 GB için 4 ₺

        var ucret = kotaUcreti  // Başlangıçta 50 GB için ücret

        if (kotaMiktari > kotaLimit) {
            val asimMiktari = kotaMiktari - kotaLimit
            ucret += asimMiktari * ekFiyatPerGb  // Kota aşımı ücreti ekliyoruz
        }
        return ucret
    }





    }
