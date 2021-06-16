# Konu Adı
Java'da yazıcı sınıfları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=eIXJCep4eVM

Kısa Bağlantı: https://bit.ly/32k9MnJ

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=eIXJCep4eVM

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Mubarak Ibrahim Elmi


PrintWriter sınıfı
Java’da bir metin dosyasına çıktı gönderebilmek için java.io kütüphanesinin içinde yer alan Printwriter sınıfına ait Println metodu kullanılır.
Java’da PrintWriter sınıfını programda kullanabilmek için import java.io. İle import edilmesi gereklidir.
Program çalışırken eğer ornek.txt dosyası varsa, varolan dosyanın içeriği silinip yeni içerik olarak gönderilen metin yazılır. 
Eğer ornek.txt dosyası yoksa, yeni bir dosya oluşturulup gönderilen metin yazılır.

Örnekte PrintWriter nesne kurucusuna FileOutputStream sınıfına ait bir nesne gönderilmiştir. 
FileOutputStream nesne kurucusu ise parametre olarak String türünde bir değer almaktadır ve dosyanın adını göstermektedir. 
Dosya isimleri seçerken Java’da kullanılan isimlendirme kuralları değil işletim sistemleri kuralları geçerlidir. 


FileWriter Sınıfı
Bu sınıf sayesinde metinsel veri bütünlüğünü dosyaya yazabiliriz. 
Örneğin; String nesnesini yazdırabilmemiz gibi. Ayrıca bu sınıfı OutputStreamWriter sınıfı ile birlikte kullanmamız mümkündür. Aşağıdaki uygulamada String tipinde bir nesne içeriği dosyaya yazdırılıyor. 

OutputStreamWriter Sınıfı
 Bu sınıfın görevi; verileri uygun karakter türüne dönüştürmektir. 
Örneğin; dosya yazma ve okuma işlemlerinde, Türkçe karakter farklılıkları yaşanabiliyor. Bu sınıf sayesinde karakter seti belirtilerek, Türkçe karakterlerin düzgün şekilde dosyaya yazılması sağlanabilir. 

 BufferedWriter Sınıfı 
Bu sınıfın görevi, belirtilen verileri dosyaya kaynağa giden veri yoluna iletmeden evvel tamponlayarak performansını arttırmaktır. Sınıf içerisinde verileri tamponlamak amaçlı bir içsel dizi bulunur. Bu diziyi kullanarak, çeşitli boyutlarda veriyi tek seferde yazılacak kaynağa iletmek mümkündür. Sınıfın iki adet yapılandırıcısı mevcuttur. Birinci yapılandırıcısı Writer sınıfına ait bir referans alabilir. Diğer yapılandırıcısı ise iki adet parametreye sahiptir.

StringWriter sınıfı
Bu sınıfın görevi, belirtilen String tipindeki nesneleri hedefe iletip yazmaktır. Sahip olduğu append() isimli metodlarla, veri birleştirme yapabilmektedir. Bu sınıf biri parametresiz diğeri tamsayı tipinde parametre alabilen iki yapılandırıcıya sahiptir. 
