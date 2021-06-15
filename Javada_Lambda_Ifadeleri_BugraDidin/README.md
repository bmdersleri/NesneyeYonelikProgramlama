# Konu Adı
Java'da Lambda İfadeleri Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/OTM5lt150Zs

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Buğra DİDİN


Lambda Calculus:
- Lambda Calculus , herhangi bir tek bantlı Turing 
makinesini simule edebilen evrensel bir hesaplama modelidir ve 
hesaplanabilir fonksiyonlar için kullanılır. Lambda Calculus 
komutlardan yani ifadelerden oluşmaktadır. Bu komutların karşılığı
Java programlama dilinde Lambda ifadeleri'dir.


Functional Interface Nedir:
- Functional interface içerisinde birçok varsayılan gövdeli metot 
barındırabilen fakat tek bir abstract metot bulunduran interface'dir.


Lambda İfadeleri Nedir:
- Lambda ifadeleri bir sınıfa ait olmayan, isimsiz fonksiyonlardır 
yani anonimdirler.
- Lambda ifadeleri kendi başlarına tanımlanıp kullanılamazlar bu 
sebeple functional interface'ler ile kullanılırlar. Functional 
interface içerisinde yer alan tek abstract metodun implementasyon
işlemi için kullanılırlar.
- Lambda ifadeleri 3 ana bölümden oluşmaktadır. 
	(int sayi) -> System.out.println("Sayımız : " + sayi)
Yukarıda yer alan lambda ifademize göre bölümleri;
"int sayi" = Parametre bölümü
"->"  = Lambda operatörü
"System.out.println("Sayımız : " + sayi)" = Lambda ifadesinin gövdesi
yani lambda ifadesi içerisinde yaptırmak istediğimiz işlemleri 
yazdığımız bölümdür.


Lambda İfadelerinin Özellikleri:
- Bir lambda ifadesi bir metoda argüman olarak geçebilir veya bir 
değişkende depolanabilir.
- Lambda ifadeleri kullanılarak hızlı geliştirme yapılabilmektedir.
- Lambda ifadeleri kod içerisinde tekrar tekrar kullanılabilirler.
- Lambda ifadeleri Java dünyasına Java 8 güncellemesi ile gelmiştir.
Lambda ifadelerini kullanırken yeni bir fonksiyon tipi tanımlamamız
gerekmediği için backward compatibility'i etkin kılar.
- Lambda ifadeleri birer fonksiyon olarak algılanırlar ve 
bayt (byte) koduna dönüştürülerek çalıştırılırlar.
- Lambda ifadeleri yapısal bakımından 3 şekilde yazılmaktadır:
Parametre almayan, tek parametre alan ve iki veya daha fazla parametre
alabilen.
- Lambda ifadeleri statik, instance, local ve kendi içerisinde yer
alan değişkenleri yakalayıp (Variable Capture) onlarla ilgili işlemler
yapabilir.


Lambda İfadelerinin Kullanım Alanları ve Avantajları:
- Lambda ifadeleri kullanılarak yazılan kod miktarını azaltır ve 
yazılan kodun sade, açık ve okunabilirliğinin yüksek olmasını sağlar.
- Lambda ifadeleri fonksiyonel programlama, paralel processing,
multithreading programlama, iterasyonu ve API kullanımlarını etkin
kılar. 
- Lambda ifadeleri çeşitli kod bloklarına entegre edilebilir ve 
onlarla kullanılabilirler: Functional interfaceler (Runnable, 
Comparator, Consumer, BiConsumer, Predicate vb.), thread, 
multithreading işlemleri, generic functional interfaceler, forEach
metodu, stream API.  


Metot Referansı:
- Java’da metot referans operatörü olarak da bilinen çift iki 
nokta (: :) operatörü, bir metodu doğrudan sınıfının yardımıyla 
başvurarak çağırmak için kullanılır.
- Lambda ifadelerinden tek farkı, metoda bir temsilci sağlamak 
yerine adıyla metoda doğrudan başvuru kullanmasıdır.
- 4 çeşit metot referansı bulunmaktadır.
  - Statik metot referansı
  - Instance metot referansı
  - Parametre metot referansı
  - Constructer metot referansı
