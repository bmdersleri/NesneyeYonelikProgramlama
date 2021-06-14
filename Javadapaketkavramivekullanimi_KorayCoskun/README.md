# Java’da paket kavramı ve kullanımı

Java’da paket kavramı
Java’nın kullanıcılarına sunduğu paket (package) kavramı; geliştirilecek olan projelerde sınıflar (classes) arasındaki hiyerarşik düzenin oluşmasını sağlar.
Özetle, işletim sistemlerinde kullanılan klasör mantığının birebir karşılığıdır.
Örneğin bir projede veritabanı işlemleri bir paket içerisinde, arayüz ayrı pakette, sınıf değişkenleri de başka bir pakette tutulabilir. 
Özellikle büyük ve kapsamlı projelerde sınıflar; mantıksal ve yapısal durumlarına göre farklı paketler içerisinde bulunur.
#
Java’da paket çeşitleri
Java’da paketler genel olarak ikiye ayrılmaktadır.
Yerleşik paketler (Built-in packages)
Kullanıcı tarafından oluşturulmuş paketler (User-defined packages)
#
Paket tanımlama
Java’nın içerisindeki tanımlı paketler haricinde kendimiz de paket tanımlayabiliriz.
Java’da uygulama geliştirirken paket tanımlanmazsa varsayılan paket (default package) oluşturur ve sınıfları bu paket içinde tutar. 
Paket tanımlaması şu şekilde gerçekleştirilir.
package paket_adı ;
package paket_adı.altpaket_adı ;
#
import komutunun kullanımı
Java’da paketlerin kullanılabilmesi için öncelikle çağrılması gerekmektedir. Bu işlemi de “ import ” komutuyla yapabiliriz.
Bir programda kullanılacak java paketleri ve içeriğindeki sınıflar şu şekilde çağrılır.
import paket_adı;
import paket_adı.altpaket_adı.sınıf_adı;
import paket_adı.sınıf_adı; // Sadece belirtilen paket içerisindeki belirtilen sınıf çağrılır.
import paket_adı.*; // Belirtilen paket içerisindeki bütün sınıflar çağrılır.
#
Java’da paket kullanımı 
import işlemiyle çağrılan sınıf kullanılarak nesne üretilir.
Sınıf_adı nesne_adı = new Sınıf_adı();

#
Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/DQgIbTS_J_Q

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Koray Çoşkun


