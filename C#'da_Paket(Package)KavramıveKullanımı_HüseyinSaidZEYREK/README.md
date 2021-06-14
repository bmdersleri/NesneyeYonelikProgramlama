# C#da Paket(Package) Kavramı ve Kullanımı
C#da Paket(Package) Kavramı ve Kullanımı Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=sn7szLBtrPY&list=PLwhxgey9h6nDLc5sJa8e7hqJTDTYOIcom&index=61

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Hüseyin Said ZEYREK


Paket(Package) Kavramı
Nesnelerin taşınabilirlik ve verimli erişim için tanımlı bir fiziksel biçimin tek bir varlığında düzenlemek amacıyla kullanılabilen soyut bir sınıftır. 

PackagePart(Paket Parçası) Kavramı
Paket(Package) içerisinde depolanan bir nesneyi temsil eden soyut bir sınıftır.

PackageRelationship(Paket İlişkisi) Kavramı
Bir kaynak Paket(Package) veya PackagePart(Paket Parçası) ile hedef nesne arasındaki ilişkiyi tanımlar. 

PackageDigitalSignature(Paket Dijital İmzası)
Bir paket parçaları ve ilişkileri kümesine uygulanan bir dijital imzayı temsil eder. Güvenlik için bir dijital imza bir paketin içindeki bölümlerle ilişkilendirilebilir. 
Dijital imza doğrulama denetimi gerçekleştirir. Örneğin, bir bölümün açılmasını önleyebilir veya kullanıcıya parçanın değiştirildiğini ve güvenlik açısından güvenli olduğunu bildirebilir.

NuGet Nedir?
Tüm modern geliştirme platformları için gerekli olan bir araç, geliştiricilerin yararlı kod oluşturma, paylaşma ve kullanma konusunda bir mekanizmadır. 
Bu tür kodlar genellikle derlenen kodu (dll 'Ler olarak) içeren "paketler" şeklinde paketlenmiştir ve bu paketleri kullanan projelerde gereken diğer içeriklerle birlikte paketlenir.
Kod içeren geliştiriciler, paket oluşturma ve bunları herkese açık veya özel bir konakta yayımlamaktır. 
Paket tüketicileri, bu paketleri uygun konaklardan elde eder, projelerine ekler ve ardından Proje kodlarında bir paketin işlevini çağırır. Ardından NuGet, tüm ara ayrıntıları işler.

Paketin İndirilmesi
İnternet üzerinden paketlere nuget.org(en popüler olan kaynak) sitesinden ulaşılabileceği gibi farklı kaynaklardan da ulaşılabilir.
Bir paketi Visual Studio Paket Yöneticisi'nden indirebiliriz. Bu yöneticiye girerek oradan arama yaparak istediğimiz paketi indirilebilir. 
Bu paketleri ise using komutu ile aktif olarak kullanabiliyoruz. Yani kullanmanız için using ile paketi çağırmanız yetecektir.






