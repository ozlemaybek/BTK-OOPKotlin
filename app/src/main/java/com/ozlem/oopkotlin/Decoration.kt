package com.ozlem.oopkotlin

interface Decoration {
    // Normalde bir class içinde bir değişkeni direkt tanımlamasını yapıp bırakamayız
    // initialize etmemiz gerekir
    // Ama interface'de initalize etmeye çalışırsak hata verir
    // Bu değişkenin değerinin Decoration interface'inin kullanıldığı yerde verilmesini istiyor:
    var room : String
}