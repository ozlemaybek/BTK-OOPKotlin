package com.ozlem.oopkotlin

// User class'ı Human abstract class'ından inheritance aldı:
class User : Human{

    var name : String? = null
    var age : Int? = null

    // Bu sınıftan her obje oluşturulduğunda bu constructor çağrılacak:
    constructor(name : String , age : Int){
        this.name = name
        this.age = age
        println("The constructor has been called...")
    }

    init {
        println("The init has been called...")
    }
}