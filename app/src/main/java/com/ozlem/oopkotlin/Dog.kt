package com.ozlem.oopkotlin

class Dog : Animal() {

    fun dogFunction(){
        // super kalıtım alınan sınıfa referans verir:
        super.makeVoice() // Animal sınıfı içindeki metodu kullanır.
    }

    // override method:
    override fun makeVoice(){
        println("Dog Class...")
    }
}

