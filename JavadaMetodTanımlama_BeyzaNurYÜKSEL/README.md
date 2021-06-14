# JAVA'DA METOT TANIMLAMA VE KULLANIMI

Metot Nedir?

Metotlar yada diğer adıyla fonksiyonlar belli bir işi yapan ve sürekli kullanılabilen yapılardır. 
Yani biz metotları veya fonksiyonları bir kez tanımlarız daha sonra her çağırdığımızda, metodu her kullanmak istediğimizde bu fonksiyon blogundaki işler yapılır.

Java’da genelde fonksiyonlara metot deriz. 
Diğer programlama dillerindeki gibi fonksiyon demeyiz. 
Çünkü metotlar classlara özgü oluyor. Her class’ın belli metotları oluyor. 
Bu yüzden javada bunlara metot demek daha doğru.

Ekrana bir şey yazdırmak için kullandığımız System.out.println da aslında bir metottur. 
System paketinin içindeki out un içindeki println fonksiyonu. 
Ve biz bu fonksiyona bir değer gönderiyoruz o da ekrana yazdırıyor. 
Aslında tek işlemi ekrana yazı yazdırmak.

Metotlara veya Fonksiyonlara Neden İhtiyaç Duyarız?

Metotlar olmadan da kodlarımızı yazabiliriz aslında. 
Ancak çok büyük java projelerinde bir işlemi 10 15 kere yapmamız gerekebilir. 
İşte böyle durumlarda yapacağımız işlemi bir metot olarak yazarsak ihtiyaç duyduğumuz yerde bu metodu çağırıp yazabiliriz. 
Yani 1 defa yazacağız fakat her yerde kullanabileceğiz.

Metotları Nasıl Tanımlarız?

Metotları tanımlarken aslında birçok anahtar kelime kullanabiliriz.

public static void main metodunu tanımlarken birçok anahtar kelime kullandık. 
Bunların yerine farklı kelimelerde kullanabilirdik. Örneğin public yerine private yazabilirdik.  
Ancak metotların genel yapısı aşağıdaki gibidir.

1 tane erişim belirleyici oluyor. Opsiyoneldir. İsterseniz yazmayabilirsiniz. Ör: public,private

1 tane ekstra özellikler oluyor. Opsiyoneldir. İsterseniz yazmayabilirsiniz. Ör: static , final

1 tane dönüş tipi oluyor. Fonksiyondan gelen çıktı anlamına geliyor. Ör: void

1 tane fonksiyonun adı. Ve içine yazacağımız parametreler. Asıl önemli kısım burası.

Fonksiyon adına herhangi birşey belirleyebiliriz. 
Ancak fonksiyon adı fonksiyonun yapacağı işle alakalı olursa çok daha güzel bir şekilde olur. 
Hemde kodumuz çok daha kolay okunmuş olur. Fonksiyon adını belirledikten sonra içine parametreler gönderebiliriz. 
Yani fonksiyonumuz belli parametreler alabilir. Dilerseniz parametreleri hiç göndermeyebilirsiniz. 
Boş kalabilir. Ancak fonksiyonun içinde belli değerlerle işlemler yapmak istiyorsanız parametreleri girmeniz gerekir. 
Daha sonra kod blogumuzu açıyoruz ve artık burası bizim fonksiyon blogumuz oluyor. 
Yani burada fonksiyon her çağrıldığında fonksiyon blogu çalışmış oluyor.

Parametreli Metod Ne Demektir?

Yukarıda anlatıldığı gibi metodlar parametre alabilirler. 
Bizim metodlarımız iki parametreliler ve integer türünde değer alıyorlar. 
Bu demek oluyor ki biz bu metodları kullanacağımız zaman iki adet integer tipinde değer vermeliyiz.

Java dili farklı veri tiplerinde, örneğin double, String ve hatta dizi türünde dahi parametre göndermeyi desteklemektedir.

Parametre Olmazsa Olmaz mı?

Elbette olur. Metodlara parametre göndermek zorunda değiliz. 
Örneğin ekrana bir cümle yazdıran metod tanımlamak istersek hiçbir parametreye gerek olmadan metodumuzu çalıştırmamız mümkün.

Geri Dönüş Değeri Nedir?

Metodlar void olarak tanımlandığında herhangi bir değer döndürmesi beklenmez. 
Sadece gövdesindeki işlemleri gerçekleştirir ve tamamlanır. 
Fakat bazen herhangi bir veri tipinde veri döndürülmesini isteyebiliriz. 
Örneğin 1’den 100’e kadar sayıları toplayan bir metod yazmak istersek sonuçta elimizde bir toplam olmasını bekleriz. 

Metot Kullanımının Faydaları:

Karmaşık programları küçük yapılara bölerek daha anlaşılır ve yönetilebilir seviyeye getiririz.
Bir uygulamada değişiklik yapılmak istenildiğinde tüm uygulamada ilgili ifadelerin geçtiği tüm
parçalar üzerinde değişiklik yapılması gerekir. Ancak metotlarda bu gibi bir sorunlar görülmez. 
İlgili metot üzerinde yapılan değişiklik tüm uygulamayı etkiler. Bu da büyük bir zaman ve performans kazandırır.

# 

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/bmdersleri

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=9vsxkXr0weQ&list=PLwhxgey9h6nDLc5sJa8e7hqJTDTYOIcom&index=30&t=1194s

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Beyza Nur YÜKSEL
