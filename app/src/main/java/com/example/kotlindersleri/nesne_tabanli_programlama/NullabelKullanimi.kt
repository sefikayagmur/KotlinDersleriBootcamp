package com.example.kotlindersleri.nesne_tabanli_programlama

fun main(){
    //Nullable,Null Safety,Optional(Swift)
    //Genellile mobil uygulama geliştirme dillerinde yer almaktadur.
    //null,Nan,nil
    //1.Tanımlama
    var mesaj: String? =null

   mesaj = "Merhaba"

    //yöntem1
    //sorun yoksa çalışır, sorun varsa uygulama çökmez.
    print("Yöntem 1: ${mesaj?.uppercase()}")

    val x =mesaj?.uppercase()
    //x.lowercase()

    //yöntem2
    //sorun yoksa çalışır, sorun varsa uygulama çöker
    //Çok emin olduğunuuz kodlarda kullanabilirsiniz.
    print("Yöntem 2: ${mesaj!!.uppercase()}")

    //yöntem3
    //null kontrol
    if(mesaj !=null){
        println("töntem 3: ${mesaj.uppercase()}")
    }else{
        println("Değişkende null yer almaktadır")
    }

    //null kontrol
    mesaj?.let{
        println("töntem 3: ${mesaj.uppercase()}")
    }
}