# Java’da Dizi Kullanımı

Dizi Nedir ?
    ->	Normalde bir dizi, bitişik bellek konumuna sahip benzer türde elemanların bir koleksiyonudur.
    ->	Java dizisi , benzer veri türündeki öğeleri içeren bir nesnedir. Ek olarak, bir dizinin öğeleri bitişik bir bellek konumunda depolanır. Benzer öğeleri sakladığımız bir veri yapısıdır. Bir Java dizisinde yalnızca sabit bir öğe kümesini saklayabiliriz.
    ->	C / C ++ 'dan farklı olarak, uzunluk üyesini kullanarak dizinin uzunluğunu alabiliriz. C / C ++ 'da “sizeof”  operatörünü kullanmamız gerekir.
    ->	Java'da dizi, dinamik olarak oluşturulmuş bir sınıfın nesnesidir. Java dizisi, Object sınıfını miras alır ve Serializable ve Cloneable arabirimleri uygular. İlkel değerleri veya nesneleri Java'da bir dizide saklayabiliriz. C / C ++ gibi, Java'da da tek boyutlu veya çok boyutlu diziler oluşturabiliriz.
    ->	Ayrıca Java, C / C ++ 'da bulunmayan anonim dizilerin özelliğini sağlar.
    ->	Diziler aynı tipte birden çok değişkeni tutabilen veri yapılarıdır. Nesne gibi düşündükleri için referans tipleri olarak değer görürler. Referans tipleri 2 kısıma ayrılır. Referans ve İlkel veri tipleri. Referans, nesnelerin bellekteki yerlerini tutar. İlkel ver tipleriyse sadece 1 adet veriyi tutarlar.
Java’da Dizinin Avantajları
    ->	Kod Optimizasyonu: Kodu optimize eder, verileri verimli bir şekilde alabilir veya sıralayabiliriz.
    ->	Rastgele erişim: Bir indeks konumunda bulunan herhangi bir veriyi alabiliriz.
Java’da Dizinin Dezavantajları
    ->	Boyut Sınırı: Dizideki öğeleri yalnızca sabit boyutta saklayabiliriz. Çalışma zamanında boyutunu büyütmez. Bu sorunu çözmek için, Java'da otomatik olarak büyüyen koleksiyon çerçevesi kullanılır.
Java’da diziler birer Object’dir 
    ->	Java’da bütün diziler bir nesnedir . Java bütün dizileri bir class olarak algılar bu yüzden bütün dizileri birer object – nesne olarak görür. Bu sebeple yeni bir dizi oluştururken new operatörü kullanılır. Bu operatörü kullanarak bu sınıfın constructor yani kurucu metodunu çağırmış oluruz.
Dizi Elemanlarının İlk Değerleri
    ->	Değişken oluşturduğumuzda default olarak herhangi bir değer taşımazlar. Dolayısıyla değer atamadan kullanmaya çalıştığımızda bize değer atanmadığı ile ilgili hata verecektir “not initialized” benzeri bir hata. Ancak dizilere her zaman default bir değer atanır. Bu atanan değerler kendi türünden bir değerdir. Numerik değişkenlere “0” sıfır, String değişkenlere “null” , boolean değişkenlere “false” değerleri atanır.

Çok Boyutlu Diziler
    ->	Çok boyutlu diziler 2 boyutlu ve 3 boyutlu olarak tanımlanan dizilerdir. Boyutlu dizilerde temel mantık şu şekildedir; normal bir dizi tanımladığımızda bir satır ve birden fazla sütun bulunmakta. İki boyutlu dizilerde ise birden fazla sütun ile birlikte birden fazla satır da olmaktadır.
Sonuç: Diziler aynı tipte birden çok değişkeni tutabilen veri yapılarıdır. Dizileri kullanmanın önemi ve gerekliliği hakkında bilgi edinmiş ve diziler ile ilgili konuların hepsini öğrenmiş olduk. Video içeriğinde daha fazla konu ve ayrıntı vardır. Burada yazı ile anlatabileceğim yerleri kısaca anlatmaya çalıştım. Geriye kalan konu anlatımını aşağıdaki linkten ulaşabilirsiniz. Umarım faydalı olmuştur. İyi çalışmalar.


Youtube Kanalımız: BMDersleri
Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw
Konu ile ilgili Youtube Video Linki :  https://youtu.be/Tuwb2n4kPsI
Kısa Bağlantı: https://bit.ly/32k9MnJ
Github Adresimiz: https://github.com/bmdersleri
Hazırlayan: Sena Özkara
