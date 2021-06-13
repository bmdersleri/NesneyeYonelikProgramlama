Dönüş Tipi
Return Ne Anlama Geliyor?

Bizim fonksiyonlarımız ve bu fonksiyonlarımızın içerisine değer vererek yaptığı işler var.
İçerisine yazdığımız bu değerler doğrultusunda fonksiyonlarımız bize çağrıldığı yere bir değer döndürüyor. 
İşte bu değer döndürmesini sağlayan anahtar kelimemiz return kelimesidir.

Dönüş tipleri ;
Void: Geri Dönüş değeri almaz.

İnt, String, Float, Double : Return değeri almaktadır.



// Eğer bir metotdan bir değer döndürmek istiyorsak.
    // Yapacağımız iki şey var.
    // 1.Dönüş tipini belirlemek.
    // 2. metodun sonunda (return) kelimesi ile de
    // dönüş tipi belirlenmiş olan değeri döndürmek.
    // Yani dönüş tipi String ise return [String ifade] olmalıdır.

    /*
    Kullanımı :
       
    [Erişim] [Dönüş Tipi] [Metot ismi]( [alacağı değerler(varsa)] ){
         //Metot içindeki işlemler
         //En son return u kullanıyoruz. return kullanıldığında
         //Metotdan çıkılır. Çünkü metot amacına ulaşmıştır.
      
         return [Dönüş Tipindeki Veri];
    }