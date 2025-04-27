package com.example.kotlindersleri.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
       // super.sesCikar() -> super : Kalıtım ile üst sınıfı(memeli) temsil
        println("miyav miyav")
    }
}