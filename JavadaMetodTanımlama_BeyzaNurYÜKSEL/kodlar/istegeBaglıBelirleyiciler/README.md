İsteğe Bağlı Belirleyiciler

Sık kullandıklarımız;

static : Bir sınıftaki değişken ve metotları niteler.
Nitelediği değişken veya metot nesnesi oluşturulmaya gerek olmaksızın kullanılabilir. 
Yukarıda Çocuk sınıfının değişkenlerine erişebilmek için Nesne oluşturuyorduk. 
İşte buna gerek kalmaması için static olarak nitelendiririz ve rahatlıkla erişim sağlayabiliriz.


final : Değişken, metot ve sınıfları sabitler. 
Nitelediği öğeler programın ömrü boyunca sabitlenir değiştirilemez. 
Örneğin Pi sayısını 3,14 değerine sabitleyip bir daha değiştirilmemesini sağlayabiliriz. 
Bu sayede önem taşıyan verilerin değerleri sabitlenmiş olur. Aşağıdaki örneği inceleyebilirsiniz.

abstract : Abstract sınıflar,genellikle ortak özellikleri olan nesneleri tek bir çatı altında toplamak için kullanılır. 
Abstract sınıflarda içi boş yada dolu metodlar tanımlanır. 
Abstract sınıflardan new kelimesi ile nesne oluşturulmaz. 
En az 1 abstract metod varsa sınıf abstract olmalıdır. 
Bir sınıfı abstract sınıf yapmak için abstract kelimesi kullanılır.


native : Bir java programı içerisinde java harici bir programlama dilinde yazılmış bir program çağırılabilmektedir.
Bazı durumlarda üzerinde çalıştığınız işletim sistemi ve CPU için performans açısından native kod mekanizmasına ihtiyaç duyulabilir.
Bu sayede farklı bir segmentten gelen kod ile daha hızlı koşulabilecek bir program oluşturabilir.
Genel olarak java programlama dili içerisinden çağrılan alt rutin programlar C ile yazılmaktadır. 


synchronized : synchronized Anahtar kelimesi metodun başına getirildiğinde
Metoda ulaşmak isteyen Threadler metoda sıra ile girerler ve bir thread metodu bitirmeden diğer thread giremez.

Not: Aynı anda birden fazla işlem yapmayı sağlayan yapıya thread denir. 
Bu yapı sayesinde işlemler birbirlerini beklemeden kendi işlemini yapar.​


