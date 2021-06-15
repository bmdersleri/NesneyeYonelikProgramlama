# C# da Takvim ve Saat İşlemleri
Değişken Java programı yürütülürken değeri tutan, veri değerlerini depolayan bir kaptır, bellekte ayrılan alanın adıdır.
Bilgisayar programında kullanılan verileri birbirinden ayırmak için verilen adlara değişken denir.


    
     C# da önem taşıyan kavramlar arasında olan bir kavramda  tarih ve zamandır. Bu nedenden dolayı tarihlerle ilgili bir çok işlem yaparız. Tarihleri karşılaştırabiliriz, tarihlere ekleme veya çıkarma yapabiliriz. İleriye veya geriye doğru zaman bileşenlerini öğrenebiliriz. Bazen zamanı dönüştürmemiz de gerekebilir. Farklı ülke ve kültürlerde zamanı yazmak için farklı biçimler kullanılabilir. Bilgisayar programlarının bu tür biçimleri sunması gerekebilir. C# dili tarih ve zamanla ilgili her işlemi yapabilir. 

    
C# da DateTime TimeSpan  ?

    C# diliyle takvim ve saat işlemleri için iki temel yapı kullanıyoruz. Bunlar; DateTime ve TimeSpan yapılarıdır. DateTime ve TimeSpan sınıflarının altında hazır fonksiyonları bulunur ve bu fonsiyonların  özelliklerini kullanarak takvim ve saat işlemlerini gerçekleştiririz. DateTime statik olarak bünyesinde birçok metot ve özelliği barındırır. Bu sayede bir çok işlemi  pratik bir şekilde gerçekleştirebiliriz.


DateTime Nesnesinin özellikleri ?

   ToLongDateString :Tarih değerini, uzun tarih formatında görüntülemek amacıyla kullanılır.
   ToShortDateString : Tarih değerini, kısa tarih formatında görüntülemek amacıyla kullanılır.
   Year : Tarih değerinin yıl kısmını verir.
   Month : Tarih değerinin ay kısmını verir.
   Day : Tarih değerinin gün kısmını verir.
   ToLongTimeString : Zaman değerini, uzun zaman formatında görüntülemek için kullanılır.
   ToShortTimeString : Zaman değerini, kısa zaman formatında görüntülemek için kullanılır.
   Hour : Zaman değerinin saat kısmını verir.
   Minute : Zaman değerinin dakika kısmını verir.
   Second : Zaman değerinin saniye kısmını verir.
   Millisecond : Zaman değerinin milisaniye kısmını verir.



DaysInMonth() ve IsLeapYear() Metotları

Herhangi bir yılın herhangi bir ayının kaç çektiğini öğrenmek istiyorsak DaysInMonth() metodundan yararlanabiliriz. DaysInMonth metodu 2 parametreye sahiptir. İlk parametrede yıl, 2. parametrede ise gün sayısı öğrenilmek istenen ay verilmektedir. 

4 yılda bir şubat ayı 29 çekmekte ve dolayısıyla o yılda 366 gün olmaktadır. Belirtilen yılın 366 güne sahip olup olmadığını öğrenmek istiyorsak IsLeapYear() metodunu kullanabiliriz. Bu metot parametre olarak aldığı tarih bilgisinin yılı 366 gün çekiyorsa geriye true, değilse false gönderir. 

Tarih ve Zaman Üzerinde Ekleme Çıkarma Yapmak

AddDays : Belirtilen gün değeri kadar, geçerli tarih değeri üzerine ekleme yapar.
AddHours : Belirtilen saat değeri kadar, geçerli zaman değeri üzerine ekleme yapar.
AddMilliseconds : Belirtilen milisaniye değeri kadar, geçerli zaman değeri üzerine ekleme yapar.
AddMinutes :Belirtilen dakika değeri kadar, geçerli zaman değeri üzerine ekleme yapar.
AddMonths :Belirtilen ay değeri kadar, geçerli tarih değeri üzerine ekleme yapar.
AddSeconds :Belirtilen saniye değeri kadar, geçerli zaman değeri üzerine ekleme yapar.
AddYears :Belirtilen yıl değeri kadar, geçerli tarih değeri üzerine ekleme yapar.


TimeSpan Nesnesi Özellikleri


Tarih ve zaman değerleri üzerinde ekleme, çıkarma gibi işlemler yaparken, işlem sonucunu TimeSpan nesnesi türünden bir değişkene aktararak işlem sonucunu birimlere ayırabiliriz. 
TimeSpan Değişkeni ile elde edilen işlem sonucunu gün , saat, dakika , saniye ve milisaniye cinsinden elde edebiliriz. 
Add ve Subtract metotlarını kullanarak TimeSpan nesneleri üzerinde ekleme ve çıkarma işlemleri gerçekleştirebilriz.


Tarih ve Zamanları karşılaştırmak

Tarih ve zamanları karşılaştırmak için DateTime sınıfının CompareTo ve Equals metotları kullanabiliriz.
CompareTo : İki tarih değerini karşılaştırarak geriye integer türünden bir değer döndürür. 
Equals : İki tarih değerini karşılaştırarak geriye boolean türünden bir değer döndürür.
Dönen sonuç değerleri 
-1 ise, birinci tarih değeri ikincisinden daha küçüktür.
1 ise, birinci tarih değeri ikincisinden daha büyüktür.
0 ise, her iki tarih değeri birbirine eşittir.


String Sınıfını Kullanarak Biçimlendirme Yapmak
Tarih ve zaman değeri içeren stringler üzerinde biçimlendirme işlemleri yaparken, String sınıfının Format metodunu kulanabiliriz. Format metodu, bir metni formatlı bir biçimde dönüştürmek amacıyla kullanılır. Kullanım şekli:
                        
                               String.Format{index[,length][: formatString]}
İndex : String değişkenlerin sırasını belirtir.
FormatString : Biçimlendirme işlemi sırasında kullanılan karakterleri belirtir.
Length : Biçimlendirme işleminin uygulanacağı karakter uzunluğunu belirtir.




Custom Date And Time Format Strings 
d: Gün bilgisini verir.
dd: İki basamaklı olarak gün bilgisini verir.
ddd: Gün Bilgisini kısaltarak görüntüler.
dddd: Gün bilgisini tam hali ile görüntüler.
m: Ay bilgisini verir.
mm: İki basamaklı olarak ay bilgisini verir.
mmm: Ay bilgisini kısaltarak görüntüler.
mmmm: Ay bilgisini tam hali ile görüntüler.
y: Yıl bilgisinin son basamağını verir.
yy: Yıl bilgisinin son iki basamağını verir.
yyy: Yıl bilgisini tam hali ile görüntüler
h: Saat bilgisini tek basamaklı olarak görüntüler.
hh: Saat bilgisini iki basamaklı olarak görüntüler.
H: Saat bilgisini tek basamaklı olarak görüntüler.
HH: Saat bilgisini tek basamaklı olarak görüntüler.
m: Dakika bilgisini tek basamaklı olarak görüntüler.
mm: Dakika bilgisini iki basamaklı olarak görüntüler.
s: Saniye bilgisini tek basamaklı olarak görüntüler.
ss: Saniye bilgisini iki basamaklı olarak görüntüler. 




   
# 

   Youtube Kanalımız: BMDersleri

   Bağlantı: https://www.youtube.com/bmdersleri

   Konu ile ilgili Youtube Video Linki : https://youtu.be/ByZSezQvGis

   Kısa Bağlantı: https://bit.ly/32k9MnJ

   Github Adresimiz: https://github.com/bmdersleri

   Hazırlayan: Derya Ayyıldız
