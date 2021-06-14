# Konu Adı
C#da Türler Arası Dönüşüm (Casting)

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/bikqGbeTFqw

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Simge COŞKUN


C#da Tür Dönüşümü Nedir?
Bazı durumlarda tanımladığımız nesnelerin başka türdenmiş gibi davranmalarını isteriz. Çok fazla değişken olduğunda ve farklı türden değişkenlerin bir arada aynı işi yapmasını istediğimizde türler arası dönüşüm yapmamız gerekmektedir. 

Örtük Dönüşümler
Özel bir syntax gerektirmeyen, güvenli ve veri kaybının olmadığı dönüşümlerdir. Küçük tiplerden büyük tiplere olan dönüşümlerde veya türeyen sınıflardan türediği sınıfa olan dönüşümlerde örtük dönüşüm geçerlidir. 

Açık Dönüşümler
Veri kaybı olasılığı varsa, derleyicinin açık bir dönüştürme gerçekleştirmesi gerekecektir. int, long, double, float gibi primitif tipler arasında dönüşümlerde veri kaybı olabileceği için derleyici sizden açık dönüşümlerde cast operatörü ister. 

Kullanıcı Tanımlı Dönüşümler
Temel sınıf ile türetilmiş sınıf ilişkisine sahip olmayan, özel türler arasında açık ve örtük dönüştürmeleri etkinleştirmek için tanımlayabileceğiniz özel yöntemler tarafından gerçekleştirilir. 

Yardımcı Sınıflarla Yapılan Dönüşümler
Bir dizeyi bir sayıya, bir bayt dizisini bir tam sayıya veya onaltılık dizeleri diğer sayısal türlerine dönüştürmek gibi farklı, uyumlu olmayan türleri dönüştürmek için kullanılır. Doğrudan dönüştürme mümkün olmadığından farklı yardımcı sınıfa ihtiyacımız var.
int.Parse, Convert.ToInt32 gibi yardımcı sınıflarla dönüşüm yapılır.

Parse Yöntemi
Türlerin yapısal isimleri altından Int32.Parse(string) / int.Parse(string) şeklinde ulaşılabilen bu yöntem ile yalnızca string türdeki değişkenleri tam yada gerçek sayı türüne dönüştürebiliriz. ArgumentNullException hatası verir. Bu hata değer null olarak tanımlandığında oluşur.

TryParse Yöntemi
String değerin istenen türe ayrıştırılıp ayrıştırılamayacağını bilmediğimiz durumlar için TryParse() yöntemini kullanabiliriz. TryParse() bize bir true veya false değeri verecektir. Eğer ki ayrıştırabilirse true, ayrıştıramazsa false değerini verir.

System.Convert Sınıfı
System.Convert sınıfı altında bulunan ve To ifadesi ile başlayıp türlerin yapısal karşılıkları ile devam eden Convert.ToInt32(string) şeklindeki metodlar, Parse metodlarından farklı olarak yanlızca string değil  bool, byte, char, DateTime, decimal, double, float, int, long, object, sbyte, short, string, uint, long ve short türlerinin tamamından dönüştürme işlemi yapabilir.
Ayrıca parse metodlarından farklı olarak System.Convert sınıfı altındaki metodlarda ArgumentNullException hatası yoktur, kendilerine dönüştürme işlemi için null bir girdi verildiğinde sıfır (0) değeri döndürürler.

String Verileri Sayısala Dönüştürme
Kullanıcıdan bir veri aldığımız zaman bu veri string türünde bize geliyor. Fakat biz kullanıcıdan bir sayı almak istediysek ve bu sayıyı işlem yapmak için kullanmak istiyorsak tür dönüşümü yapılması gerekmektedir. Bunu da Convert.ToInt() methodu yardımı ile yaparız.

Sayısal Verileri String’e Dönüştürme
Bir sayıyı string olarak da kullanmak isteyebiliriz. Böyle bir durumda ise int türünü string türüne dönüştürmemiz gerekir. Bu dönüşümü Convert.ToString() ile yapıyoruz.

Referans ve Değer Türleri Arasındaki Dönüşüm
C# dilinde tür dönüşümleriyle ilgili en önemli konu değer tipindeki verileri referans tiplerine çevirmektir. Değer tipleri ve referans tipleri bellekte farklı bölgelerde tutulur.
Değer tiplerinin referans tiplerine, referans tiplerinin değer tiplerine dönüşümü boxing ve unboxing kavramlarıyla olmaktadır.

Boxing İşlemi
Şu anda popüler olan birçok dilde referans tipleri ile değer tipleri arasında herhangi bir dönüşüm yapılmamaktadır. Boxing işleminde değer tipini referans tipinden bir nesneye atadığımızda stack bölgesinde tutulan veri bit olarak heap bölgesine kopyalanır. Ve stack bölgesindeki obje türünden olan değişken de bu heap bölgesini gösterecek şekilde ayarlanır.
Stack bellek statik olarak yer tahsisi için kullanılırken, heap dinamik olarak yer tahsisi için kullanılır.

Unboxing İşlemi
Unboxing işlemi boxing işleminin tamamen tersidir. Yani heap bölgesindeki bir nesnenin değeri bit olarak stack bölgesine kopyalanır. Böylelikle referans türünü değer türüne dönüştürmüş oluruz.
Unboxing işleminin çalışma zamanında hata vermemesi için sağlanması gereken iki önemli koşul vardır. Bunlar:
Unboxing işlemine tabi tutulacak nesnenin daha önceden boxing işlemine tabi tutulmuş olması.
Boxing işlemine tabi tutulmuş olan bu nesnenin unboxing işlemi sırasında doğru türe dönüştürülmesidir


