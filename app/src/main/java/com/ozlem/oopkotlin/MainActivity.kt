package com.ozlem.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-------------------- Classes --------------------")

        val user = User("Özlem" , 22)
        val user2 = User("Aybek" , 22)

        println("-------------------- Encapsulation --------------------")

        val ahmet = Artist("Ahmet" , 50 , "Musician")
        // Özelliğine ulaşabiliyoruz:
        ahmet.name
        // Özelliğini bastırabiliyoruz:
        println(ahmet.name)

        println("-------------------- Inheritance --------------------")

        // PrivateArtist Class'ından bir obje oluşturalım:
        // Thespian : tiyatrocu
        val mehmet = PrivateArtist("Mehmet" , 40 , "Thespian")
        mehmet.sing_a_song()

        println("-------------------- Polymorphism --------------------")

        // Static Polymorphism:
        val transection = Transections()
        println(transection.multiplicaiton())  // output : 0
        println(transection.multiplicaiton(2 , 4))
        println(transection.multiplication(2 , 8 , 10))

        // Dinamic Polymorphism:
        val barley = Dog()
        barley.makeVoice()  // Şu anda Dog sınıfına ait makeVoice metodunu kullanır.

        val cat = Animal()
        cat.makeVoice() // Animal sınıfındaki makaeVoice metodunu kullanır.

        barley.dogFunction() // Animal sınıfındaki makeVoice metodunu kullanır.

        println("-------------------- Abstraction && Interface --------------------")

        user.humanFunction()

        var guitar = Guitar()
        guitar.brand = "Guitar Brand"
        guitar.electroGuitar = true

        println(guitar.room)
        println(guitar.info())

        println("-------------------- Lambda Gösterimleri --------------------")

        println(print("test"))

        // Lambda gösterimi sayesinde tek satırda print fonksiyonu olmadan değişken değerini yazdırabiliyoruz:
        val printLambda = {verilenString : String -> println(verilenString)}
        // Artık bu satırda içindekini yazdırır:
        printLambda("Test Lambda...")

        val multiplicationLambda = {a : Int , b : Int -> a * b}
        println(multiplicationLambda(4 , 5)) // output : 20

        val multiplicationVersion2 : (Int , Int) -> Int = {a , b -> a * b}
        println(multiplicationVersion2(5 , 6))  // output : 30


    }

    // Verdiğimiz parametre neyse onu yazdırsın:
    fun print(string: String){
        println(string)
    }
}










