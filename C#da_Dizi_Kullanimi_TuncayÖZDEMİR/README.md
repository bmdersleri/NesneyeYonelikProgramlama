# Konu Adı
C#'da Dizi Kullanımı Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/gvNcKl29H3A

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Tuncay ÖZDEMİR

Dizi Kavramı ve Tanımlama: 
Bir dizi içindeki bütün elemanlara aynı isimle ulaşılır. Yani dizideki bütün elemanların isimleri ortaktır. Elemanlar arasındaki ayırt edici özellik, bellekteki yeridir.Bir dizinin elemanlarına [ ](indeks operatörü) ile ulaşılır.C# dilinde bütün diziler System.Array sınıfından türetilir. Yani biz bir dizi tanımladığımızda aslında Array sınıfı türünden bir nesne tanımlamış oluyoruz. Dizilerin tanımlanması new anahtar sözcüğü ile yapılır. Bu da dizinin her elemanına temel veri türleri için varsayılan değer, ilk değer olarak verileceğini göstermektedir.  

Döngülerle Dizi İşlemleri: 
Bir dizinin elemanlarına ulaşmak için tipik olarak dizinin boyutu kadar dönen döngüler kurulur. Dizilerin elemanları içinde genellikle for ve foreach döngüleri ile dolaşılır. 

Çok Boyutlu Diziler: 
Her bir elemanı bir dizi şeklinde olan dizilerdir. Çok boyutlu diziler iki türlüdür. Birincisi her bir dizi elemanının eşit sayıda eleman içerdiği dizilerdir. Bu diziler matris yapısında oldukları için genellikle bu tür dizilere matris dizileri de denilmektedir. İkinci tür ise, her bir elemanın farklı sayıda dizi elemanı içeren dizilerdir. Bu tür dizilerde her satırdaki elemanlarda farklı sayılarda dizi elemanı bulunabilir. Kısaca bunlara dizi dizileri diyebiliriz. Dağınık yapısından dolayı bu tür dizilere düzensiz diziler (jagged array) de denilmektedir.

Uygulama Örneklerinde Kullanılan System.Array Sınıfı Metotları:
Dizi olarak tanımladığımız değişkenler Array sınıfından türemiştir, dolayısıyla sahip oldukları bir takım metotlar ve özellikler vardır.
IndexOf: Dizi içindeki bir değerin ilk görüldüğü indeksi verir.
Sort: Bir boyutlu dizileri sıralamaya yarar.
Reverse: Diziyi tersine çevirir.
Length: Dizideki eleman sayısını verir. (int)
Clear: Dizinin elemanlarını varsayılan değere çeker.
Resize: Diziyi farklı bir boyutta yeniden ayırır ve eski dizi öğelerini yeni diziye kopyalar. 