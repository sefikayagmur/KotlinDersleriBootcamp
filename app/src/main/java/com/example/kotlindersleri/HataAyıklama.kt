package com.example.kotlindersleri

fun main() {
    //1.compile Eror : Kodlama Yaparken oluşur.
    //val sayi =100
    //sayi=500

    //2.Runtime Eror (Exceptions)
    val x = 10
    val y = 0

    try{
        println("Sonuç:${x/y}")
        println("işlem Tamamlandı")
    }catch (e: Exception){
        println("İkinci sayı sıfır olmaz.")
    }catch (e: ArithmeticException) {
        println("İkinci sayı sıfır olmaz.")
    }
}