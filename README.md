# BTK-OOPKotlin

## Kotlin İle Android Mobil Uygulama Geliştirme İleri Seviye Notlarım

## INIT VE CONSTRUCTOR

![image](https://user-images.githubusercontent.com/109730490/184338569-33b8d6c4-7362-4980-8ff4-f1ada287d037.png)

![image](https://user-images.githubusercontent.com/109730490/184339362-fc9fd85c-7a7d-4731-a75f-1d788ebebf99.png)

> Önce init sonra constructor çağrılır:

![image](https://user-images.githubusercontent.com/109730490/184339634-d7759005-a6b2-4a3e-bc34-67e52d6fca1c.png)

> Class'larda init adı verilen class'lara özgü bir yapı var. Class'a ait bir obje oluşturmak istediğimizde ilk çağrılan kod bloğu init'tir. Sonra constructor çağrılır.

![image](https://user-images.githubusercontent.com/109730490/184339879-fd8a6ec6-079b-4261-8f35-4017ee1ea359.png)

## ENCAPSULATION

> Bir nesnenin property'lerine nereden ve nasıl ulaşılabilir, hangi sınıf içerisinde neyi tutmalıyız, hangi sınıfın hangi özelliğine nereden ulaşabiliriz bütün bunları kontrol edebilmemizi sağlayan yapıya Encapsulation "kapsülleme" denir.

> Aşağıdaki gibi yazarsak objenin özelliklerine obje oluşturulduktan sonra ulaşamayız, değiştiremeyiz ve bastıramayız:

![image](https://user-images.githubusercontent.com/109730490/184341179-e8e5f1b1-1888-4d4c-b63a-b40c96153db9.png)

![image](https://user-images.githubusercontent.com/109730490/184341129-c48537e1-fccd-46b6-a9a8-d43051ce8ff9.png)

> Fakat bu şekilde yazarsam ulaşabilirim, bastırabilirim ve değiştirebilirim:

![image](https://user-images.githubusercontent.com/109730490/184341772-1cb98e6f-8ef9-4476-9ac8-02b24f573281.png)

![image](https://user-images.githubusercontent.com/109730490/184342452-124db18b-3ad0-41c7-bfec-45a3a7de0719.png)

> Erişim seviyelerini dahil edelim:

> Eğer Artist Class'ında name property'sini private tanımlasaydım Artist class'ından bir obje oluşturduktan sonra onun özelliklerine erişemezdim:

![image](https://user-images.githubusercontent.com/109730490/184342915-22613fe3-3daf-40a8-b7e8-14bcb1e7e1fa.png)

> Ve aşağıdaki gibi MainActivity.kt içinde ulaşmaya çalıştığımda hata verirdi:

![image](https://user-images.githubusercontent.com/109730490/184343048-87005fcd-d2a8-4f5c-8fbb-77b3cfa7071d.png)

> Peki Artist class'ından bir obje oluşturduğumda sonradan özelliklerini görebileyim ama değiştiremeyeyim isteseydim:

- Bunun için getter ve setter'ları kullanıyorduk ama bunun daha kolay bir yöntemi var:

![image](https://user-images.githubusercontent.com/109730490/184343611-53ba1b24-dc48-4c51-ae28-093a2dd3fe99.png)

![image](https://user-images.githubusercontent.com/109730490/184343671-93eeb4c6-3c80-4767-a84e-aa35893bbe44.png)

> Şunu yapmak mantıklı değil: Bir property'nin hem get hem de set'ini private yapacaksam zaten direkt değişkeni private tanımlayabilirim. Bu yüzden eğer ikisinide private'a çevirdiğim halde değişkeni public oluşturduysam hata alırım:

![image](https://user-images.githubusercontent.com/109730490/184344363-08c03b91-b7a1-41d8-9d56-e0f14eda396c.png)

> Primary constructor kullansam bile class içerisinde ek özellikler oluşturabilirim:

![image](https://user-images.githubusercontent.com/109730490/184344755-6d91e5fd-e0fd-482e-aff6-a66aa359bf7e.png)

## INHERITANCE (Miras Alma - Kalıtım)

> Başka bir sınıfın özelliklerini miras alabiliriz. 

> Diyelimki bir sınıfın özelliklerini kullandığımız üstüne daha fazla özellik eklememiz gereken bir durum olsun. Bu durumda inheritance kullanaibliriz.  

> Bir sınıftan kalıtım alınabilmesi için o sınıfın başında open yazmalı:

![image](https://user-images.githubusercontent.com/109730490/184348580-fd08edce-08e0-40a5-8ed2-b45ec49e3377.png)

> Ayrıca kalıtım aldığımızda diğer class'a ait primary constructor varsa onun parametrelerini de eklemeliyiz:

![image](https://user-images.githubusercontent.com/109730490/184348854-ae149190-47c1-429e-b9e8-b2a3e5f27291.png)

> PrivateArtist class'ı Artist class'ından miras alıyor:

![image](https://user-images.githubusercontent.com/109730490/184349004-bfce6ca7-8ab1-4b1f-b243-2762b3c24286.png)

> supertype: kalıtım aldığımız sınıftır.

> PrivateArtist sınıfının objeleri Artist sınıfı objelerinin yapabildiği her şeyi yapabilir ama Artist sınıfı objeleri PrivateArtist sınıfı objelerinin ek özelliklerini yapamaz. 

## POLYMORPHISM (ÇOK BİÇİMLİLİK)

> Farklı özelliklerin farklı çeşit ve farklı formlarla karşımıza çıkması olarak adlandırılır. 

> 2 çeşiti var. 1) static polymorphism 2) dinamic polymorphism

> Aynı sınıf içerisinde aynı isimle farklı işlemler yapmaya static polymorphism denir. Farklı sınıflar içerisinden aynı isimle farklı işlemler yapmaya ise dynamic polymorphism denir.

- Static Polymorphism

![image](https://user-images.githubusercontent.com/109730490/184354151-e97d49fc-dada-4d09-9433-0ab95f976364.png)

![image](https://user-images.githubusercontent.com/109730490/184354653-7559bd21-dc59-4a0a-820e-7ff9e5435ac4.png)

- Dinamic Polymorphism

> override : Daha önceyazılmış bir fonksiyonun üstüne yazmak. 

> Bir fonksiyonu override edebilmemiz için asıl fonksiyonun open olması gerekir:

![image](https://user-images.githubusercontent.com/109730490/184356164-3c914833-7197-4600-a53d-69fad5f42c24.png)

![image](https://user-images.githubusercontent.com/109730490/184356221-620457d3-517a-4aed-a25f-c80f65e1daa8.png)

> SUPER ANAHTAR KELİMESİ

![image](https://user-images.githubusercontent.com/109730490/184357275-88789b01-677c-422b-add5-3cd1dc265a34.png)

![image](https://user-images.githubusercontent.com/109730490/184357374-fc795a81-06ef-45fc-92ab-b398cb237120.png)

## ABSTRACTION (SOYUTLAMA) && INTERFACE (ARAYÜZ)

> Abstract Class; kendisinden bir obje oluşturulamayan sınıftır. 

> Bir sınıf oluşturmak ve o sınıfın özelliklerini birden fazla yerde kullanmak isteyebiliriz. Diyelimki benim projede çok fazla sınıfım var ve ben hepsine bir özellik eklemek istedim. Tek tek gidip tüm sınıflara özellik eklemek yerine bir tane abstract class yazarım bu abstract class'tan bir obje oluşturulmasına gerek kalmaz ama diğer tüm sınıflar abstract class'tan kalıtım alır. 

> Bir abstract class tanımlayalım:

![image](https://user-images.githubusercontent.com/109730490/184361105-8f45068d-dc60-492b-844d-335d50d2d71e.png)

> User class'ı Human sınıfından inheritance alsın:

![image](https://user-images.githubusercontent.com/109730490/184361188-6392bfec-afe3-4d3a-866c-45864ebb5790.png)

> Bu kez bizden class User : Human() şeklinde parantez açmamızı istemedi çünkü parantez açmak aslında obje oluşturulması demek. Ve abstract class'tan obje oluşturamayız.  

> Şimdi abstract class'ta tanımladığımız fonksiyonu kullanalım:

![image](https://user-images.githubusercontent.com/109730490/184361442-63eeff94-7295-4f36-a91b-d2e3d1815f08.png)

-------------

> Interface; bir sınıf değildir. Aslında interface %100 soyut bir sınıftır yani Interface'tende obje oluşturamayız. Ama bize sağladığı bir avantaj vardır.  

> Interface ile ilgili detayları öğrenmek için Guitar isimli bir sınıf açtık. 

> Class'lar birden fazla sınıftan kalıtım alamazlar. Ama birden fazla Interface kullanabiliriz. 

> Instrument isimli bir Interface oluşturduk.

![image](https://user-images.githubusercontent.com/109730490/184363822-2a983fd2-3dfd-4cac-b9fd-7f93c2f53bf8.png)

> Yukarıdaki durum Kotlin'e özeldir. Java'da interface'ler farklı durumlara sahiptir. 

> Interface içinde fonksiyonları böyle oluşturuyoruz. Normalde başka bir yerde bu kod hata verir:

![image](https://user-images.githubusercontent.com/109730490/184365043-046742d1-10bf-4438-b9da-a0b3b3d12efe.png)

> Bir class'a interfacelerden inheritance yaptığımızda alt enter ile implement members yapmamız gerekir:

![image](https://user-images.githubusercontent.com/109730490/184365541-7066295b-4039-4743-ad64-30fa29340c76.png)

## LAMBDA GÖSTERİMLERİ (LAMBDA EXPRESSİONS)

![image](https://user-images.githubusercontent.com/109730490/184368753-3590df13-1f22-4c1c-8208-ee1d7dfa5e7b.png)

## Kaynaklar

- [BTK Akademi](https://www.btkakademi.gov.tr/portal/course/kotlin-ile-android-mobil-uygulama-gelistirme-ileri-seviye-10359)

- [Medium](https://mebaysan.medium.com/kotlin-ve-nesne-tabanl%C4%B1-programlama-oop-29ab98b5f43d#)
