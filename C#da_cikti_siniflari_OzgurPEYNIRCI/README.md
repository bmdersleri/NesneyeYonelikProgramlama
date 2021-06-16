# Konu Adı
C#da Çıktı Sınıfları Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/s4frv-vzBf4

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Özgür PEYNİRCİ

Stream Kavramı
Stream, akıntı demektir. Programlamada, akış halinde olan veriyi tanımlar. 
Tıpkı bir suyun belli bir nehirden akması gibi, belli bir yoldan akan veriye stream(akıntı) denir.
Akan veri bir giriş noktasından başlar ve çıkış noktasına sekanslar hâlinde ulaşır.

Asenkron Programlama
Bir program normalde komutlarını sırayla uygulatır. İşlemcinin bir sonraki komutu uygulayabilmesi için hâlihazırdaki komutu uygulayıp geri dönüş alması gerekmektedir.
Asenkron programlamada istenen komutların sonucu geri dönüş üretmeden işlemcinin sonraki komuttan devam etmesi daha sonra bu komutun uygulaması bitirildiğinde o noktaya geri dönülmesi işlemciye söylenir.
Uygulanması milisaniyeler süren çoğu işlemin aksine saniyeler, dakikalar, saatler ve hatta günler alabilen veri aktarma işlemlerinde asenkron programlama büyük bir öneme sahiptir.

async ve await anahtar sözcükleri
async anahtar sözcüğü asenkron çalıştırılmak istenen metodun döndüreceği değer tipinin önüne getirilerek C# yorumlayıcısına fonksiyonun asenkron doğası bildirilir. 
await anahtar sözcüğü asenkron çalışacak operasyonların önüne getirilir.

C#'ta Asenkron Programlama
async ve await sözcükleriyle en temel şekilde asenkron programlama sağlanılabileceği gibi senkron metodlarda asenkron şekilde çalışma verimlilik karşılığında zorlanabilir.

Stream Çeşitleri
İnternet, dosya, ses, görüntü, bellek stream(akıntı) kavramının en yaygın görüldüğü alanlardır. C#'ta her biri için Microsoft veya 3. taraflar tarafından sağlanan zengin kütüphaneler vardır.

Senkron-Asenkron Karşılaştırması
Senkron Programlar farklı operasyonların bitmesini beklerken asenkron programlar ilgili operasyonların bitmesi beklenmeden programın diğer işlevlerinin çalıştırmasına olanak verir. Bu da başta performans ve çokyönlülük olmak üzere programa birçok avantaj kazandırır.

Asenkron-Paralel Asenkron Karşılaştırması
Asenkron programların çalışma prensipleri her ne kadar farklı olsa da özel olarak ayarlanmadıkça yine birbirlerinin işlemlerinin bitmesini bekleyecekleri senkron-vari bir yaklaşımda çalışabilirler. Paralel bir şekilde asenkron metotları çalıştırmak, asenkron metotların doğası göreği mümkündür.

Temel Dosya İşlemleri
System.IO içinde bulunan File ve FileInfo sınıflarıyla oluşturma, silme, şifreleme, disk bilgisi gibi temel işlemler yapılabilir.

Ağ Aktarımları
NetworkStream sınıfı Ağ bağlantıları içerisinde veri aktarmak için gerekli metodları senkron ve asenkron versiyonlarıyla sunar. Bu sınıfta tamponlama (buffering) işlemi dışında çoğu detay arka planda C# Yorumlayıcısı tarafından halledilecektir.

