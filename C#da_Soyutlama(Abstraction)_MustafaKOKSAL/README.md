# Konu Adı
C#da Soyutlama (Abstraction)

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/c/bmdersleri​​

Konu ile ilgili Youtube Video Linki : https://youtu.be/rENSAKqIZdw?list=PLwhxgey9h6nDLc5sJa8e7hqJTDTYOIcom

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Mustafa KÖKSAL


Nesne yönelimli programlamada soyutlama nedir?

Karmaşıklığı yönetmek için kullanılır. Nesnenin diğer tüm nesne türlerinden ayıran temel özelliklerini belirtir, böylece izleyicinin bakış açısından açıkça tanımlanmış bir kavramsal sınır sağlar. Nesne yönelimli programlamada, ayırma, ayrıntıları tanımlamaktan ziyade sınıflar veya yöntemler için temel görevleri tanımlamak anlamına gelir. Temel olarak, problemi çözmek için kullanılan yöntem öncelikle daha genel, daha basit ve soyut olmalıdır.
Bir sınıfın özelliklerinin ve davranışlarının tanımlanmasına denir. Örneğin: Bir kişinin adı, soyadı, yaşı, boyu, kilosu, saç rengi gibi özellikleridir. Kişinin yetenekleri davranışları içerisinde yer alır ve metotlar ile saklanır.
Soyutlama Bir sistemin soyut bir gösterimini tanımlamak için varlıkların ilgili özniteliklerini ve etkileşimlerini sınıf olarak modelleme.

Soyut Sınıf?
“abstract” olarak nitelendirilen bir sınıf, soyut bir sınıf olarak adlandırılır. Somut methodların yanı sıra soyut methodlara da sahip olabilir. Normal sınıfın soyut methodlar olamaz.

Soyut Method?
Bir bedeni olmayan bir yöntem, Soyut Metot olarak bilinir. Soyut methodlar sadece soyut sınıflarda beyan edilmelidir. Soyut method asla nihai olmayacaktır, bu yüzden soyut sınıftan oluşturulan sınıflar bu metodları oluşturmak zorundadır.

Soyut Method Kuralları 
Bir sınıf soyut bir yöntem kullanıyorsa, soyut olarak beyan edilmelidir. Tam tersi doğru olamaz. Bu, soyut bir sınıfın mutlaka soyut bir yönteme sahip olmadığı anlamına gelir.
Eğer normal bir sınıf soyut bir sınıf genişletirse, o sınıf soyut ebeveynin tüm soyut yöntemlerini uygulamalıdır.

Soyutlamanın Avantajları 
Soyut bir sınıf kullanmanın temel faydası, birkaç ilgili sınıfı kardeş olarak gruplandırmanıza izin vermesidir.
Soyutlama, yazılımın tasarım ve uygulama sürecinin karmaşıklığını azaltmaya yardımcı olur.
Kod yinelemesini önler ve kodun yeniden kullanılabilirliğini sağlar.
Kullanıcıya yalnızca gerekli ayrıntılar verildiği için bir uygulama veya programın güvenliğini artırmaya yardımcı olur.
Kodlardaki karmaşıklığı azaltır.

Soyutlama Ne Zaman Kullanılır?
Soyut yöntemler çoğunlukla iki veya daha fazla alt sınıfın farklı uygulamalarla aynı şeyi farklı şekillerde gerçekleştirdiği beyan edilir.
Soyut sınıflar, genel davranış türlerini ve nesne yönelimli programlama sınıfı hiyerarşisini tanımlamaya yardımcı olur. Aynı zamanda soyut sınıfın uygulama detaylarını sunmak için alt sınıfları tanımlar.

Abstract anahtar kelimesi sınıflara, metotlara ve özelliklere uygulanır. Abstract sınıflara soyut yada özet sınıflar diyebiliriz.

Abstract Class: abstract olarak tanımlanan bir sınıf temel sınıftır. Bu sınıftan new anahtar kelimesi kullanılarak bir nesne oluşturulamaz.

Abstract Metot: Sadece soyut sınıflar içerisinde kullanılabilirler. Mirasçı sınıflarda override edilmek zorundadırlar.Abstarct metotlar sadece tanımlanır. Herhangi bir işlemi yerine getirmezler. Yapacakları işlemler override edildikleri sınıfta kodlanmalıdır.

