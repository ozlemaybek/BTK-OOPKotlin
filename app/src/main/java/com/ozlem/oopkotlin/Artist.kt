package com.ozlem.oopkotlin

// Bu sınıfta primary constructor kullanacağız:
open class Artist (name : String , age : Int , job : String) {

    // Encapsulation

    var name : String? = name
        private set // name property'sinin değeri değiştirilemeyecek
        get         // ama değeri alınabilecek

    var age : Int? = age
        private set
        get

    private var job : String? = job
}
