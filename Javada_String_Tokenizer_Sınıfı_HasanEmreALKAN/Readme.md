# Konu Adı
Java'da StringTokenizer Sınıfı 

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/kiaNkHdCa68

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Hasan Emre ALkan



StringTokenizer Sınıfı Nedir?
StringTokenizer sınıfı String metinleri bölmemizi, ayırmamızı sağlayan eski bir sınıftır.
Günümüzde pek kullanılmamakla beraber uyumluluk sorunları nedeniyle korunan bir sınıftır.


StringTokenizer vs Split Metotu
StringTokenizer Split Metot'una göre iki kat hızlıdır.
Split Metot'u StringTokenizer'a göre daha yaygındır.


StringTokenizer Yapıcıları
Constructor Type 1- StringTokenizer(String str)  :  Belirtilen dizeyle StringTokenizer oluşturur.
Constructor Type 2- StringTokenizer(String str, String delimiter)  :  Belirtilen dize ve sınırlayıcı ile StringTokenizer oluşturur.
Constructor Type 3- StringTokenizer(String str, String delimiter,bool b)  :  Belirtilen dize , sınırlayıcı ve boolean değer ile StringTokenizer oluşturur.


StringTokenizer Metotları
1- int countToken() : Toplam jeton sayısını verir.
2- String nextToken() : Sonraki jetonu verir.
3- boolean hasMoreTokens() : Daha fazla jeton olup olmadığını kontrol eder. Bir nevi  parçalanacak ifade kalıp kalmadığını kontrol eder.
4- Object nextElement(): nextToken() metoduyla aynı işlevi görür. Tek farkı obje döndürmesidir.
5- boolean hasMoreElements(): hasMoreTokens() metodunun alternatifi diyebiliriz. 


