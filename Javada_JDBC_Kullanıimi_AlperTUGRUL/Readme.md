# Konu Adı
Java'da JDBC Kullanımı #28 Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=OK9JE5tDoFw

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Alper TUĞRUL


base Anahtar Sözcüğü
Yapıcı metotlar aşırı yüklenmişse türemiş sınıfın yapıcı metotları çağrılırken belli değerlerle temel sınıfında yapıcı metodunun çağrılması mümkündür ve bu işlem base anahtar sözcüğü ile yapılır.

Çoklu – Tekrarlı Türetmeler
Sınıflar tıpkı nine, anne, çocuk yapısında olduğu gibi art arda türetilebilir.
Örneğin; B sınıfı A sınıfından türetilip C sınıfı da B sınıfından türetilebilir.

Erişim Belirleyiciler
Tüm tipler ve tip üyeleri birer erişilebilirlik seviyesine sahiptirler.
Bu erişilebilirlik seviyeleri, ilgili tiplerin ya da üyelerin aynı assembly ya da farklı bir assembly içerisindeki kod bloklarından kullanılabilip kullanılamayacağını belirler.
C# dilinde 4 adet erişim belirleyici ve 5 adet erişim modeli vardır.
Tiplere ya da üyelere erişilebilirlik şu anahtar kelimeler ile belirlenir: public , private , protected , internal, protected internal

İsim Saklama
Türemiş sınıfta bazen temel sınıftaki üye elemanla aynı isimli bir eleman tanımlanmış olabilir.
Bu durumda temel sınıftaki elemana normal yollarda erişmek mümkün değildir çünkü türeyen sınıftaki eleman temel sınıftaki elemanı gizlemiştir.
Temel sınıftaki elemana erişmek için yine base anahtar sözcüğünden faydalanılır.
base ile hem özelliklere hem de metotlara erişilebilir.

Özet Özellikler
Özet özellikler, özet metotların taşıdığı bütün özellikleri taşırlar. Bunlara ek olarak şunları sayabiliriz:
Yalnızca kod gerçekleştirimi yapılmamış özellikler (sahte özellikler) özet olarak bildirilebilir.

Özet Sınıflar
Bazen bir ana sınıfın tek başına bir işlevi olmayabilir.
Ana sınıfın tek görevi yavru sınıflara ait bazı ortak üye elemanları barındırmak olabilir ve ana sınıf türünden nesne oluşturulmasını engellemek isteyebiliriz.
İşte bu gibi durumlarda ana sınıf özet sınıf olarak bildirilir. Özet sınıfları bildirmek için abstract anahtar sözcüğü kullanılır.

Sanal Metotlar
Sanal metotlar ana sınıf içinde bildirilmiş ve yavru sınıf içinde tekrar bildirilen metotlardır.
İsim saklamaya benzemesine rağmen kullanımda farklıdır.
Bazı anahtar sözcükler eklenerek bunun klasik bir isim saklama işleminden farklı olması sağlanır.
Sanal metotlar virtual anahtarı ile kullanılır. Bu anahtar sözcük, metot başına yazılır. Türeyen sınıfta, temel sınıftaki virtual metotları devre dışı bırakmak için ise override anahtarı kullanılır.

Yapıcı Metotlar ve Kalıtım
Hem türetilen ana sınıfın hem de türetilme sonucunda oluşturulan yavru sınıfın yapıcı metotları olabilir.
Bu durumda yavru sınıf türünden bir nesne oluşturulduğunda önce ana sınıfın, sonra da yavru sınıfın yapıcı metodu çalıştırılır.
B sınıfı türünden bir nesne oluşturduğumuzda önce A, sonrada B sınıfının yapıcı metotları çalıştırılır.
Yani gidişat anadan yavruya doğrudur.
Ana sınıftaki özet sahte özelliği override eden yavru sınıftaki özelliğin set-get durumu ana sınıftaki özet özellikle aynı olmalıdır. Yani eğer özet özellikte sadece get bloğu varsa bu özelliği override eden özelliğin de sadece get bloğu olmalıdır. 
Aynı durum set bloğu için de geçerlidir. Benzer şekilde özet özellikte hem set hem de get varsa override özellikte de bu ikisi olmalıdır.
