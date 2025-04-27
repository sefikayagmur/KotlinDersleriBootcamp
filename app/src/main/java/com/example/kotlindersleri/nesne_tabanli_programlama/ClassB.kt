package com.example.kotlindersleri.nesne_tabanli_programlama

class ClassB: MyInterface{
    override var degisken: Int =100

    override fun metod1() {
        println("Metot1 calıstı")
    }

    override fun metod2(): String {
        return "metod 2 calıstı"
    }


}