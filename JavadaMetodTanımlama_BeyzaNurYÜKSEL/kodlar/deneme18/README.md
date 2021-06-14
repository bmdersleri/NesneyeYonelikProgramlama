Java' da Metot Tanımlama ve Kullanımı
--------------------------------------------------------------------------------------------------------------------------
Javada Metot Tanımlama

İlk konumuz Java'da Metot tanımlama bu kodların içinde bunun örneği var. Metotlar bir grup kod bloğunun belirli bir işlevi gerçekleştirmek için bir araya gelmesiyle
oluşurlar. Genelde programlar küçük parçalara bölünmüş şekle getirilmeye çalışılır. Bu küçük
parçalara metot adı verilir. Java programları, metotları içeren java sınıflarıyla, class alan metotların
birleşmesinden oluşur. Java temel parçaları olan modüller, sınıf ve metotlar proje geliştirme sürecinde yeniden kullanılarak hem kodu hem de yazılım geliştirme süresini kısaltmaktadır.
 
Metot Tanımlama
1.Metot isminini belirtmemiz gerekmektedir.
2.Metotların geri dönüş tipinin tanımlanması gerekmektedir.
3.Eğer metodun geri dönüş tipi yoksa void olarak tanımlanmalıdır.

Metotlar aşağıda yer alan şekilde ki gibi tanımlanmaktadır.

Erişim belirleyici | Dönüş tipi | Metot adi (parametre listesi)
{
//işlemler
}
-----------------------------------------------------------------------------------------------------------------------------
Javada Varargs

Bu kodların içinde yer alan diğer konularımızdan birisi Varargs. JDK 5’ten itibaren Java, değişken sayıda argüman alması gereken metotların oluşturulmasını basitleştiren bir özelliğe sahiptir. Bu özelliğe değişken uzunluklu argümanlar(variable-length arguments) anlamındaki varargs denir. Değişken sayıda argüman alan bir metoda kısaca varargs metot(variable-arity method ya da varargs method) adı verilir.
-Değişken uzunluklu bir argüman, üç nokta(…) ile belirtilir. Örneğin: static void vaTest(int …v).
-Bu sözdizimi, derleyiciye vaTest() metodunun sıfır ya da daha çok argümanla çağrılabileceğini bildirir. Sonuç olarak v, kapalı bir biçimde int[] tipinde bir dizi olarak deklare edilir. Böylece, vaTest() içinde v’ye normal dizi sözdizimi kullanılarak erişilir.

Bir metot, değişken uzunluklu bir parametrenin yanı sıra “normal” parametrelere de sahip olabilir. Ancak değişken uzunluklu parametre, metot tarafında deklare edilen son parametre olmalıdır. Örneğin:

int dolt(int a, int b, double c, int ...vals)

–>Bu durumda, dolt() metodunda yapılan çağrıda kullanılan ilk üç arguman, ilk üç parametreye karşılık gelir. Sonra, geri kalan tüm argümanlar, vals’a aittir.

–>Varargs parametrenin son parametre olması gerektiğini unutmayın. Örneğin, aşağıdaki deklarasyon hatalıdır:

int dolt(int a, int b, double c, int ...vals, boolean stopFlag)

–>Bilmeniz gereken bir kısıtlama daha vardır: Sadece bir varargs parametre bulunmalıdır. Örneğin, aşağıdaki deklarasyon geçersizdir:

int dolt(int a, int b, double c, int ...vals, double ..morevals)//Hata!

---------------------------------------------------------------------------------------------------------------------------------------
Javada Parametre Aktarımı

Bu kodların içinde yer alan diğer konularımızdan bir tanesi de Parametre Aktarımı. 
-Java bir "pass by value " dilidir.​

-Bu, değişkenin bir kopyasının yapıldığı ve metodun bu kopyayı aldığı anlamına gelir.​

-Programlama dilleri metotlara parametre aktarılırken 2 farklı yaklaşım kullanır.​

-Pass by value(değere göre geçirme) ve pass by reference(referansa göre geçirme) yaklaşımları değişkenlerin metotlara nasıl aktarıldığını tanımlamak için kullanılan 2 farklı tekniktir.​

Pass-By-Value: Eğer dil pass-by-value yöntemi ile parametre aktarıyorsa, parametrenin değeri önceden belirlenir. Belirlenen değer bellekte bir alana kopyalanır ve bu şekilde metod çağırımı yapılır. Metod içerisinde siz bu değere yeni bir değer atamaya kalkarsanız, metod içerisinde hala yeni değer gözükürken metodu çağırdığınız yerde ilk değerini görmeye devam edersiniz. Java da temel tiplerin doğrudan kendi değerleri gönderilirken, nesnelerin referanslarının değeri gönderilir. İsterseniz java dil spesifikasyonunu (JLS) okuyarak kendinizde kontrol edebilirsiniz.

Pass-By-Reference: Referns ile aktarımda, metod parametreleri, parametreinin asıl değerine bir alias gibi davranır. Yani parametre bir yere kopyalanmak yerine bellekteki aynı alanı göstermeye devam eder. Metod içerisinde nesneyi yenilerseniz, nesnenin ilk değeri de yenilenecektir.

Peki spesifikasyonunu okumadan bir dilin Pass-By-Value mu yoksa Pass-By-Reference mı olduğunu nasıl anlarsınız? Bunun için çok uzağa gitmenize gerek yok, basit bir swap metodu yazarak anlayabilirsiniz. Eğer daha önce harhangibir sebepten buble-sort türü bir algoritma yazdıysanız, mutlaka swap işlemi yapmışsınızdır. Belki hatta Java da denediğinizde yazdığınız kod doğruda çalışmamıştır, kim bilir.

void swap(Dog arg1, Dog arg2) {
    Dog temp = arg1;
    arg1 = arg2;
    arg2 = temp;
}
 
...
 
Dog dog1 = ...; // Dog "Max"
Dog dog2 = ...; // Dog "Rocky"
swap(dog1, dog2); // Swapping
// now dog1 is still "Max" and dog2 is still "Rocky"

Buradan anlayacağınız, Java tamamen pass-by-value dur.
------------------------------------------------------------------------------------------------------------------------------------
Java'da Autoboxing ve Unboxing​

Bu kodların içinde yer alan diğer konularımızdan biri de Autoboxing ve Unboxing​. Autoboxing ,Java derleyicisinin ilkel türler ve bunlara karşılık gelen nesne sarmalayıcı sınıfları arasında yaptığı otomatik dönüştürmedir.
Dönüştürme diğer yöne giderse, buna Unboxing denir .
Burada dikkat edilmesi gereken konu dönüşüm yaparken alt tiplerin aynı olması gerektiği. Örneğin int ile Integer, byte ile Byte, Float ile float ve diğer aynı tipler arasında geçiş yapılabilir. Byte tipinden int tipine, int tipinden Long tipine geçiş yapmak Boxing veya Unboxing değildir. Bu geçiş işlemine Tip Dönüşümleri (Type Casting) denir.

Wrapper Classlar

* boolean -> Boolean
* char       -> Character
* byte       -> Byte
* short     -> Short
* int         ->Integer
* long      ->Long
* float      ->Float
* double ->Double

İşte en basit otomatik kutulama örneği:

Character ch = 'a';

-----------------------------------------------------------------------------------------------------------------------------
Java'da Final Keyword(anahtar sözcüğü)​

Bu kodların içinde yer alan konularımızdan diğeri de Final Anahtar Sözcüğü.Java dilinde detayları çok iyi bilinmeyen ve belki de pek önemsenmeyen, kıyıda köşede kalmış konulardan birisi de “final” anahtar kelimesidir. Java’da final anahtar kelimesi aşağıda yer alan yapılar için kullanılabilir:

-Final sınıf değişkenleri: Final olan bir sınıf değişkenine sadece bir kere değer ataması yapilabilir ve bu atama sadece sınıf konstrüktöründe gerçekleşebilir.
-Final metot parametreleri: Final olarak tanımlanmış bir metot parametresine sadece bir kere değer atanabilir. Metot parametrelerinin tamamen final olarak tanımlamış olmalarında büyük fayda vardır. Bu şekilde parametrenin metot bünyesinde değişikliğe ugrama tehlikesi ortadan kaldırılmış olur.
-Final metotlar: Final olan bir metot ne alt sınıflarca yeniden yüklenebilir (method overloading) ne de saklı (hidden) tutulabilir.
-Final sınıflar: Final olan bir sınıf genişletilerek bir alt sınıf oluşturulamaz.
Final anahtar kelimesi programın daha doğru, hatalara dayanıklı ve performanslı çalışmasını sağlar.

Final değişkenler ilk değerini aldıktan sonra bir daha değiştirilemiyorlar.
 Örnek :

final int a=4;

int a=3; // –> Hatalı’dır final değer ilk değeri aldıktan sonra değiştirilemez..

System.out.println(“a : ” + a);
Not : * Eğer final değişkeni tanımlayıp ilk değeri belirtmezseniz yine hata alırsınız. null,0 gibi değerler vermesini beklemeyin.

--------------------------------------------------------------------------------------------------------------------------------------
Java'da Veri Tipleri

Bu kodların içinde yer alan konularımızdan birisi de Veri Tipleri. Nesne yönelimli programlama dillerinde, genel olarak her sınıf bir veri tipidir. Kulanılan bu tipler verileri tutmak, saklamak için kullanılır. Kullanılan veri tipine göre bellekte yer ayrılır.
Java’da veri tipleri 3 gruba ayrılır.
1.İlkel (Primitive) Veri Tipleri
2.Referans Tipleri
3.Null Tipi

Bu tipler arasında ilk ikisi kendi aralarında alt gruplara ayrılır.

1.İlkel Veri Tipleri

Mantıksal (boolean) Veri Tipleri

Sayısal veri tipleri

-Tamsayı veri tipleri

          byte

          short

          int

          long

          char

-Kesirli sayı tipleri (floating point types)

float

double


2.Referans Tipler

          class

          interface

          array

3.Null Tip

          null

 Bir programda farklı veri tipleriyle işlem yapmamız gerekebilir. Örneğin, tamsayılar, kesirli sayılar, karakterler (harfler ve klavyedeki diğer simgeler), metinler (string), mantıksal (boolean) değerler (doğru=true, yanlış=false) ilk aklımıza gelen farklı veri tipleridir. Bu farklı veri tiplerinin büyüklükleri (bellekte kaplayacakları bit sayısı) ve onlarla yapılabilecek işlemler birbirlerinden farklıdır. Örneğin, sayılarla dört işlem yapabiliriz, ama metinlerle yapamayız. O nedenle, Java ve başka bazı diller verileri tiplere ayırır. Değişken tanımlarken onun hangi tip veriyi tutacağını belirtir. Böylece, ana bellekte o değişkene yetecek bir yer ayırır ve o veri tipine uygun işlemlerin yapılmasına izin verir.

----------------------------------------------------------------------------------------------------------------------------------------------
Java Encapsulation

Bu kodların içinde yer alan son konumuz da Encapsulation(Kapsülleme).Encapsulation kelimesinin Türkçe yazılım dilinde karşılığı, Kapsülleme veya Sarmalama olarak belirtilebilir. Java Encapsulation aslında java sınıfı içerisinde tanımladığımız değişkenlerimizi korumak veya saklamak anlamanına gelmektedir. Dışarından ya da yanlış kullanım sonucu kodu ve veriyi koruyan bir mekanizmadır. Bir diğer şekliyle iş metot tarafından yapılır fakat metotun içeriği gösterilmez.

-Private: Sadece bulunduğu sınfta kullanılabilecek değerlerdir. Direk erişilemeyen değişkenlerdir.
-Public: Herkesin erişebildiği sınıftır.
-Protected:Extends edilebilir ancak sadece aynı pakette erişilebilen değişkendir.
-Default:Paket içerisinden erişilebilen değişkendir.

Tanımladığımız bir sınıf içerisindeki değişkenin direk olarak değiştirilememesi, bunun yerine bizim izin verdiğimiz ölçüde, metotlar aracılığıyla değiştirilmesi gerekmektedir. Bir değişkene sadece okuma yetkisi verebilir, sadece yazma yetkisi verebilir veya hem okuma hem yazma yetkisi verebiliriz.

Java Encapsulation yapısından faydalanılarak yazılan kodlar bakımı daha kolay, değiştirmeye ve geliştirmeye daha açık ve daha esnek hale gelmektedir. Java ile bir proje geliştirirken Nesne Yönelimli Programlama yapılarına dikkat edilmeli. Java Encapsulation yapısından her zaman faydalanılmalıdır.
------------------------------------------------------------------------------------------------------------------------------------------------------------

Sonuç 

Bu anlattığımız konuların kodları Final.java projemizin içerisindedir.






















