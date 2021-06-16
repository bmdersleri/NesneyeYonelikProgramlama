# Java Composition Coding With Eclipse

![alt text](https://github.com/alpergorgulu/Java-Composition-Coding-With-Eclipse/blob/main/pic/CELL.jpg)


Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/c-uPpIHeCTc

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Alper GÖRGÜLÜ


### Proje Tanımı

Bu proje, Java'da Composition kavramını anlatmaya yönelik bir uygulamadır. 

### Detaylar

Yukarıda resmini görmüş olduğunuz telefonun ekranında, telefonun içinde bulunan bazı bileşenler bulunmaktadır.
Eclipse üzerinden yazdığım uygulamada, bu bileşenleri kullanarak composition uygulaması yaptım. 

### Projeyi Çalıştırma

Proje 6 adet Class'tan oluşmaktadır. Projenin Test dosyası. "Test.java"dır. Bu dosyaya aşağıdaki yönergeden ulaşabilirsiniz.

`src/Test.java`

### Proje Detayı

Yukarıda görmüş olduğunuz resimde telefonun bazı bileşenleri mevcut. Ram, Cpu, Screen ve Camera. Bu isimleri taşıyan Java Class'ları oluşturulup içine görev metotları
yazılmıştır. Görev metotlarına kaynak kodlardan ulaşabilirsiniz. Bu görev metotlarına Telefon.Java isimli bir Class'da composition uygulayarak erişebiliriz.

### Konu Detayı

Composition, Nesne Yönelimli Programlamanın temel taşlarından biridir. Burada ki temel yapı; oluşturulan sınıfların birbiri içerisinde kullanılabilirliğini sağlamaktır. Bu sayede kod tekrarı ve kod kirliliği önlenir.

Java dilinde kompozisyon kullanımı inheritance(kalıtım)’a alternatiftir.
Kalıtımın ana kuralı olan bir sınıf sadece bir sınıfı miras alabilir kuralı bazen bizi engelleyebilir.
Örnek verecek olursak farklı sınıflarda işimize yarayan bir metod varsa, kullanabilmek için kompozisyon yaparız.

Aggregation : Bu tür ilişki de nesnelerin yaşam döngüleri birbirlerinden ayrıdır. Bir nesne diğerinden bağımsız olarak da yaşamını sürdürebilir. Yani aralarında bir sahiplik ilişkisi (has-a ) vardır. Örneğin Dizüstü Bilgisayarınız ile onun çantası arasında böyle bir ilişki vardır. Çantayı ayrı olarak ya da laptop’u ayrı olarak düşünebiliriz. Yaşam döngüleri ortak değildir. 

Composition : Bu tür ilişki de nesnelerin yaşam döngüleri birbirleriyle bağlantılıdır. Bir nesne diğerinden bağımsız olarak kullanılamaz. Aralarındaki ilişki parçası olma(is-a-part-of ) ilişkisidir. Az önceki örneğimizden gidersek dizüstü bilgisayarımız ile ekranı arasında bu tarz bir ilişki vardır. 

Konuyu özetlersek;

Belli bir amaç için yazılmış ve doğruluğu kanıtlanmış olan sınıfları, yeni uygulamaların içerisinde kullanmak hem iş süresini kısaltacaktır hem de yeni yazılan uygulamalarda hata çıkma riskini en aza indirgeyecektir. Uygulamalarımızda daha evvelden yazılmış ve doğruluğu kanıtlanmış olan sınıfları tekrardan kullanmanın iki yöntemi bulunur.

Birinci yöntem kalıtımdır (inheritance). Bu yöntemde yeni oluşturacağımız sınıf, daha evvelden yazılmış ve doğruluğu kanıtlanmış olan sınıftan türetilir; böylece yeni oluşan sınıf, türetildiği sınıfın özelliklerine ve işlevlerine sahip olur; Ayrıca oluşan bu yeni sınıfın kendisine ait yeni özellikleri ve işlevleri de olabilir. 
İkinci yöntem ise komposizyon’dur. Bu yöntem sayesinde daha önceden yazılmış ve doğruluğu kanıtlanmış olan sınıf/sınıfları, yeni yazılan sınıfın içerisinde doğrudan kullanabilme şansına sahip oluruz.

### Youtube Channel

`www.youtube.com/BMDersleri`

### Author

Alper GÖRGÜLÜ



