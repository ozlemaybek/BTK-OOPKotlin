package com.ozlem.oopkotlin

class PrivateArtist(name: String, age: Int, job: String) : Artist(name, age, job) {

    fun sing_a_song (){
        println("Sing a song...")
    }
}