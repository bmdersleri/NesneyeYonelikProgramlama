# Java'da Değişkenler
Değişken Java programı yürütülürken değeri tutan, veri değerlerini depolayan bir kaptır, bellekte ayrılan alanın adıdır.
Bilgisayar programında kullanılan verileri birbirinden ayırmak için verilen adlara değişken denir.

Değişken Tanımlamanın belirli kuralları vardır;
1 - Değişken isimleri sayı ile başlayamaz.   ![image](https://user-images.githubusercontent.com/74094387/121335034-e69c3500-c922-11eb-9f1a-c552b26f62c1.png)
2 - Her değişkenin mutlaka bir tipi olmalıdır.
3 - Değişken isimlerinde İngilizce karakterler kullanılmalıdır. 
4 - Java büyük küçük harfe duyarlı ( Case Sensitive ) bir dildir. 
5 - Java camelCase olarak adlandırılan kuralda değişken adlarında ilk isim küçük harf ile diğer isimler büyük harfler ile başlar.
6 - Değişken isimlerinde boşluk kullanılamaz.
7 - Değişkenler değer atanmadan kullanılamaz. 
8 - Aynı tipteki değişkenler tek satırda tanımlanabilir.
9 - Java’da değişken isimleri harf ile, “$”(dolar işareti) ile veya “_” (alt çizgi) ile başlayabilir.

Java'da 3 değişken türü vardır;
1 - Nesne Değişkenleri (Instance Variables) : Bir sınıftan üretilen tüm nesneler için farklı değer içeren ve statik olmayan veri alanlarıdır. 
2 - Lokal Değişkenler (Yerel) : Lokal değişken bildirimi sınıf içindeki bir veri alanının bildirimine benzer bir şekilde yapılır.
3 - Statik Değişken : Statik değişkenin tek bir kopyasını oluşturabilir ve sınıfın tüm örnekleri arasında paylaşabilirsiniz. 

Değişken tanımlamalarımızı veri tiplerimiz olmadan yapamayız veri tipi nedir, neden kullanırız?
Veri tipleri verilerin bilgisayar üzerinde ki modellemesidir. Veri tipinin özelliği ise bellekte tuttukları alanın sabit olmasıdır.
Ana bellekte o değişkene yetecek bir yer ayırır ve o veri tipine uygun işlemlerin yapılmasına izin verir.

Java'da Veri Tipleri 3 gruba ayrılır;

1 - İlkel Veri Tipi : Bu tip kendi içinden 4'e ayrılır:

    a ) Tam Sayılar : Tam sayılar kendi içinde 4'e ayrılır.
        * ) Short : -32768 ile 32767 arasında değer depolayabilmektedir. Değer aralığının dışına çıkma ihtimalinin olmadığı basit hesaplamalarda kullanılabilir.
        ** ) Long : Çok uzun sayıları depolayabilmektedir. Hesaplamalarda, karmaşık işlemlerde kullanabiliriz.
        *** ) Integer : Tamsayı türündeki değişkenler için kullanılır. Orta uzunluktaki sayıları tutmak için kullanılır. En fazla kullanılan veri tipidir. 
        **** ) Byte : Byte en küçük değişken türlerinden biridir. -128 ile 127 arasında bir değer alır. Büyük sayıların çıkma ihtimalinin olmadığı hesaplamalarda, karmaşık olmayan işlemlerde kullanılabilir.
        
    b ) Ondalıklı Sayılar : Ondalıklı sayılar kendi içinde 2'ye ayrılır:
        * ) Float : Float veri tipi 32 bitlik büyüklüğe sahiptir. 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir. Float veri tanımlarken noktadan sonra değişken değerinin sonuna “f” veya “F” koyulmalıdır. Bu tip virgülden sonra 7 haneye kadar yeterli duyarlılıktadır. (Tek duyarlı — 32 bit)
        ** ) Double : Double veri tipi 64 bitlik büyüklüğe sahiptir. 4.9×10^-324 ile 1.8×10^308 arasında bir değer tanımlanabilir. Bu tip virgülden sonra 17 haneye kadar yeterli duyarlılıktadır. 
        
    c ) Karakterler :
        * ) Char : Java da karakterler char veri tipi içinde saklanır. (16 bitlik ) Tek tırnak ile ifade edilir. Stringler de char kümesinin bir araya gelmesi ile oluşur.

    d ) Mantıksal Operatörler : 
        * ) Boolean : Java mantıksal değerlerini saklamak için kullanılmaktadır. Boolean veri tipi true ve false olmak üzere iki farklı değer alabilmektedir. Koşul belirtirken veya bir döngüde kullanılabilir. 

2 - Referans Veri Tipi : Bu tip kendi içinde 3'e ayrılır:

    a ) Class : Sınıf (class) nesnelerden oluşan geniş kapsamlı bir kod kombinasyonudur. 

    b ) Interface : Diğer sınıflara yön vermek, rehberlik yapmak anlamını taşır.

    c ) Array : Array, aynı tipten çok sayıda değişken tanımlamak için kullanılır.

3 - Null Veri Tipi : Bu tip boş değerleri içerir. 


SONUÇ : Java da kullandığımız değişkenler veri tipleri ile beraber kullanılarak kodlamalarımızda, projelerimizde kullandığımız değerleri tutar. 


   
   
   
Değişkenler Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/bmdersleri

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=dcvF0wcH9aA&t=9s

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Seda Nur POLATER
