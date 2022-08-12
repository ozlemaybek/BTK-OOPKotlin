package com.ozlem.oopkotlin

class Guitar : Instrument , Decoration{
    // marka:
    var brand : String? = null
    // elektro gitar mı değil mi:
    var electroGuitar : Boolean? = null

    // inheritance sonrası implement members:
    override var room: String
        get() = "Living Room" // TO-DO olarak geldi bir değer verdik.
        set(value) {}

    override fun info() {

    }
}