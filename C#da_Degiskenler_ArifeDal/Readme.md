# Konu Adı
C# da Değişkenler Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/igvTCEQhbnU

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Arife Dal


Değişken Nasıl Tanımlanır?
Değişkenler,          DeğişkenTürü DeğişkenAdı    ;    şeklinde tanımlanır. İstenirse aynı tür değişkenler tek bir satırda tanımlanabilir. 


Değişken Türleri
Sabit Değişkenler (const): Programda değeri hiç değişmeyecek olan değişkenler için kullanılır. Ayrıca const değişkeni ile matematiksel işlemler yapmak da mümkündür. Dikkat edilmesi gereken mutlaka bir değer ataması yapılması gereklidir.
Sayısal Değişken Türleri:Tam sayı, ondalıklı sayı gibi sayı değerlerini tutar. Çeşitleri vardır. Çeşistlere göre değer aralıkları ve bellek alanları farklıdır.
Metinsel Değişken Türleri:Harfleri,kelimeleri,cümleleri,paragrafları tutar.

Sayısal ve Metinsel Olmayan Türler
Bool: True(1) ve False(0) değerlerini döndürür. Koşullu yapılarda kullanılır.1 byte yer kaplar.
Object: Object C#‘daki bütün veri tiplerini içinde bulunduran bir türdür.C#‘daki veri tipleri bu object veri türünden türemiştir.
Var: Var türü de object türüne benzer. Var değişken tipini girilen değere göre anlar. Ayrıca var türünde ilk değer ataması yapmak zorunludur. Object de böyle bir zorunluluk yoktur.
DateTime: Tarih ve zaman değerlerini tanımlarken kullanılır. 8 byte yer kaplar.
Readonly: Readonly aynı const türüne benzer. const dan farklı olarak  ilk değer ataması yapmak zorunlu değildir. Sınıfların içinde metotların dışında tanımlanır. Değer ataması ise sadece yapıcı metotta tanımlanabilir. Onun dışında diğer metotlarda okunabilir olacaktır.  


Değişkenlere Değer Atama
Programcı isterse bazı değişkenlerde değer ataması yapabilir. Bu değişkenler de sık sık yapılan bir durumdur. Bazı türler de ise değer ataması yapmak zorunludur.


Değişkenlerde Tür Dönüştürme
Boxing & UnBoxing: Object türünde bir değişken tanımlayıp değer ataması yaptığımız olaya Boxing denir. Eğer ben bu değişkeni başka bir tipteki değişkene  atamak istersek Unboxing yapmamız gerekir.
Parse(): Tür.Parse(DeğişkenAd) şeklinde kullanılır. Parse dönüşümünde sadece string ifadeleri farklı bir türe dönüştürebiliriz.
ToStrind(): Eğer bir veri tipini stringe dönüştürmek istersek ToString() metodunu kullanabiliriz.


Global Değişken
C# ‘ da değişkenler kütüphane içinde Global olarak tanımlanamazlar. 
Ancak sınıfların içinde veya metotların içinde tanımlanabilirler.


Örnek-1(10'luk tabandan 2'lik tabana çevirme)
Kullanıcının girdiği bir sayıyı 10'luk tabandan 2'lik tabana çevirmek için girilen sayı bölüm 1 olana kadar 2'ye bölünür. Bölümle birlikte kalanlar sağdan sola doğru yazılır.Bu sayının 2'lik tabandaki karşılığı olur.


Örnek-2(Matrisin düz köşegen toplamlarını ve ters köşegen toplamlarını buldurma)
3 satırdan ve 2 sütundan oluşan bir matris tanımlanır. Kullanıcıdan matris içine girilecek değerler istenir. Düz köşegenler ve ters köşegenler toplanır.


Örnek-3(Hill Şifreleme)
Eski bir şifreleme yöntemidir. Eski uygarlıklar önemli yazışmaları çeşitli şifreleme yöntemleriyle yaparlardı.Bunlardan biri hill şifrelemedir.
Alfabe 1'den 26'ya kadar(kullandığınız alfabeye bağlı) sayılanır. İstenilen şekilde anahtar matris oluşturulur. Kelimenin içindeki harflerin sayısal karşılıkları yazılır. Şifrelenecek kelime 2'şer 2'şer ayrılır. Anahtar matris ve gruplar tek tek çarpılır. Çıkan sonuçların 26'ya göre modları alınır. Çıkan sayıların harfsel karşılığı bulunur. çıkan harfler kelimemizin şifrelenmiş hali olur.





















