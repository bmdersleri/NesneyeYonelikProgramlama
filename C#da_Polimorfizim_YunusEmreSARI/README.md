# Konu Adı
C#'da Çok Biçimlilik (Polimorfizm) Örnek Kodları

Polimorfizm
Polimorfizm kelime anlamı birçok farklı biçime sahip olmak demektir. Nesne yönelimli programlamada polimorfizm genellikle "bir arayüz, çoklu fonksiyonlar" olarak gösterilir. Polimorfizm, bir sınıfa aynı isimde çoklu uygulamalar yapabilme özelliği sağlar. Kapsülleme ve kalıtım sonrası Nesneye Yönelik Programlamanın temel ilkelerinden biridir. 

Static Polimorfizm
Early Binding(erken bağlanma) olarak da bilinir.Metot aşırı yükleme(overloading), bir Statik Polimorfizm örneğidir. Overloading(aşırı yüklenme), aynı isme sahip metot veya fonksiyonun farklı imzalar(parametreler) alacak şekilde tanımlanmasıdır. Compile Time(Derleme zamanı) Polymorphism olarak da bilinir, çünkü hangi metodun veya fonksiyonun çağrılacağına derleme zamanında karar verilir. 
C # derleyicisi, gönderilen parametrelerin sayısını ve parametre türünü kontrol eder ve hangi metodun veya fonksiyonun  çağrılacağına karar verir ve eşleşen bir metot veya fonksiyon  bulunmazsa hata verir. 

Dynamic Polimorfizm
Late binding(geç bağlanma) olarak da bilinir. Metot override (geçersiz kılma), dinamik polimorfizmin bir örneğidir.  Burada, metot adı ve metot imzası(parametresi) faklı olabilir. 
Metot overriding (geçersiz kılma) kalıtım(miras alma) alınan sınıfın içerisinde overriding işlemi yapılarak metot güncellenebilir.  Metot overriding (geçersiz kılma) ile temel sınıf ve türetilmiş sınıfın aynı metot adına ve aynı özelliklere sahip olması mümkündür. Derleyici, fonksiyonu overriding(geçersiz kılmak)  için kullanılan metodun farkında olmayacağından, derleyici derleme zamanında bir hata oluşturmaz. Derleyici, çalışma zamanında hangi yöntemin çağrılacağına karar verir ve hiçbir yöntem bulunmazsa hata verir.



Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/r5-3P6Twlhw

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Yunus Emre Sarı

