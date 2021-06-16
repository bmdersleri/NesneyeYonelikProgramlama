# Konu Adı
C#'da Sınıf Tanımlama ve Sınıf Çeşitleri Örnek Kodları 

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=z7Ms-OkGt2w&list=PLwhxgey9h6nDLc5sJa8e7hqJTDTYOIcom&index=101

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Zeynep İrem Kesler

Sınıf(Class) Nedir ve Neden Kullanırız ?
Sınıflar, nesne yönelimli programlamanın en önemli parçasıdır. 
Sınıf (Class) yapısı programlamadaki karışıklığı azaltır ve bu sayede okunabilirliği artırır. 
Programı geliştirmeyi de kolaylaştırır. Her sınıf çeşidinin farklı özellikleri vardır. 
Yazdığımız programa göre bize en uygun olan sınıfları kullanırız.
Sınıfları tanımlarken kullandığımız en önemli kavram "Erişim Belirteçleri" dir.

Erişim Belirteçleri Nelerdir ?
C# dili nesne yönelimli bir dil olduğundan her şey sınıflar içinde tanımlanır. Sınıflara ve sınıf öğelerine erişim kısıtlanabilir ya da belirli düzeylerde erişime izin verilebilir.

Sınıf Tanımlama Nasıl Yapılır ?
Class bir şema gibidir. Bir türün verilerini ve davranışını tanımlar. Bir class tanımlaması, isminden önceki class  anahtar kelimesi ile başlar. Class gövdesi, süslü parantezlerle çevrilen değişkenleri ve metotları içerir.

Sınıflar Arası İlişkiler
1. Bağıntı ilişkisi (association): Bağıntı ilişkisi, bir nesnenin diğer bir nesneyle olan kavramsal ilişkisini temsil eder ve iki nesne arasına çizilen düz bir çizgi ile belirtilir. Aradaki bu ilişki bazen çok yönlü, bazen tek yönlüdür. Bağıntının adı, çokluğu ve sınıfın bağıntıdaki rolü, bağıntı ilişkisini tanımlayıcı bilgiler arasında yer alır. Eleman sayısı (cardinality) n:m şeklinde belirtilir. 
2. Toplama, içerim bağıntısı (aggregation): Toplama, içerim bağıntısı ile modellenen nesneler, genellikle birlikte daha karmaşık bir nesne oluşturmak için bir araya getirilmişlerdir. İçerim bağıntısında nesnelerin arasındaki ilişki zayıftır. İçi boş eş kenar dörtgen (baklava) şekli ile gösterilir.
3. Oluşum, meydana gelme bağıntısı (composition): Oluşum bağıntısı, içerim bağıntısında olduğu gibi parça-bütün ilişkisini simgeler. Bu ilişkideki birliktelikler daha kuvvetlidir ve burada yer alan nesneler tek başlarına bir anlam ifade etmezler. İçi dolu eş kenar dörtgen şekli ile gösterilir.
4. Bağımlılık ilişkisi (dependency): Bir sınıfın nesnesinin diğer bir sınıfın nesnesini kullanması ya da ona bağımlı olması söz konusudur. Bağımlı sınıftan bağımsız sınıfa doğru kesik kesik olan düz bir çizgiyle gösterilir. Örnekteki RaporOluştur sınıfı rapor sınıfını kullanmak, yani Rapor sınıfına bağlı olmaktadır. Rapor sınıfında yapılacak herhangi bir değişiklik, RaporOluştur sınıfında değişiklik yapılmasına neden olacaktır.
5. Kalıtım, genelleştirme ilişkisi (inheritance): Önceden oluşturulan sınıflara (superclass) dayalı olan yeni altsınıfların (subclass) oluşturulmasına ve buna dayalı oldukları üstsınıflara ait olan özelliklerin ve davranışların altsınıflarda kullanılabilmesine NYP'de denir. Altsınıflar, içi boş olan bir ok ile üstsınıfa bağlanır.

Sınıf Çeşitleri 
Beş tane sınıf çeşidi vardır. Bunlar public class, private class, protected class, internal class, protected internal class.

Public Class 
	Her yerden erişebildiğimiz bir sınıftır. 

Private Class 
	Sadece tanımlandığı sınıftan erişilebilen bir sınıftır.

Protected Class 
	Ait olduğu sınıftan ve o sınıftan türetilen sınıflardan erişilebilen bir sınıftır.

Internal Class 
	Bulunduğu projeden erişilebilen bir sınıftır.

Protected Internal Class
	Protected ve internal sınıflarının ortak özellikleri dahilinde erişilebilen bir sınıftır.

