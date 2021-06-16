# Java'da Jenerik Sınıflar ve Kullanımı

# Hakkımızda

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/TyGPc-OwN44

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Ahmet Çetinkaya - https://ahmetcetinkaya.info


## Giriş
Bu sunumda, jeneriklerin temel ayrıntılarını ve programları tip güvenliği ile genişletmek için nasıl kullanılabileceğini sağlamaya yöneliktir. Sunum ile birlikte jenerik sınıflara giriş, Java’da jenerik sınıf kullanımı, avantajları, jenerik kısıtlar, joker karakterler, tür silinmesi ve aşırı yükleme konularını öğrenecek ve görsel destekli örnekler ile pekiştireceksiniz. Ayrıca ilgili örnekleri indirebilir kendiniz denemeler yapabilirsiniz.

## Jenerik Sınıflara Giriş?
Jenerik, kelime anlamı olarak tanıtma anlamını taşır.

Jenerik yapılar nesneye dayalı programlamada spesifik yani belirli olmayan türler için kullanılır.

Jenerik yapıda hazırlanan sınıflar, üzerinde çalışacağımız veri tipini sınıfa tanıtabilme imkanı sağlar.

Böylece aynı işleve sahip kodların, farklı türler üzerinden çalışması sağlanabilir. 

## Java’da Jenerik Sınıf Kullanımı
Java’da jenerik sınıf oluşturmak için sınıf isminden hemen sonra dik açılı ayraçlar arasında tür parametresi kullanılır.

```java
class Sinif<T> {}
```

Tür parametresi, Java isimlendirme standartları gereği genellikle Tür (Type) kelimesine kaşılık olarak ‘T’ harfiyle gösterilir. 

|     Harf             |     Anlamı     |     Açıklama                                                    |   |   |   |
|----------------------|----------------|-----------------------------------------------------------------|:-:|:-:|:-:|
|     E                |     Element    |     Genelde   Java Collection Framework de kullanılmaktadır.    |   |   |   |
|     K                |     Key        |                                                                 |   |   |   |
|     N                |     Number     |                                                                 |   |   |   |
|     T                |     Type       |                                                                 |   |   |   |
|     S,   U, V vb.    |                |     2.   3. 4. tipler alternatif olarak kullanılabilir.         |   |   |   |

Tür parametresi, belirlenecek tür için bir referans tutar. Böylelikle özellik, değişken, parametre ve dönüş türlerini belirlemede kullanılabilir.


```java
class Sinif<T> {
	T tip;
	public T fonksiyon(T tip) {…}
}
```

Virgül ile birbirinden ayırarak birden fazla tür parametresi kullanılabilir. 

```java
class Sinif<TVarlik, TDigerVarlik> {
    public TVarlik fonksiyon(TVarlik tVarlik) {
        return tVarlik;
    }
    public TDigerVarlik digerFonksiyon(TDigerVarlik tDigerVarlik) {
        return tDigerVarlik;
    }
}
```

Java’da tür parametresi sadece referans tip olabilir ve ilkel tipler kabul edilmez.

```java
List<int> liste; // Error
```
```java
List<Integer> liste;
```

## Jenerik Sınıfların Avantajları
Jenerik sınıflar, kod tekrarını önler. 

Böylelikle kullandığımız kodların çok daha etkili bir şekilde tasarlanmasına yardımcı olur.

```java
class Sinif {
	Tip fonkisyon() {
		return new Tip();
	}
}
```
```java
class FarkliSinif {
    FarkliTip fonkisyon() {
        return new FarkliTip();
    }
}
```
```java
class JenerikSinif<T> {
T fonksiyon() {
	return new T();
}
}
```

Tür parametreleri, kullanılan veri türü hakkında bilgi sağlayarak kod okunabilirliği artırır.

Derleme zamanında tip kontrolü sağlar.
```java
JenerikSinif<Integer> jenerik = new JenerikSinif<>();
```
Koleksiyon sınıflarında tip güvenliğini sağlar.
```java
ArrayList<String> liste1 = new ArrayList<>();

ArrayList<Integer> liste2 = new ArrayList<>();
```

Koleksiyon elemanlarını dönüştürme işlemine gerek kalmadan kullanılmasına imkan tanır.
```java
ArrayList liste1 = new ArrayList();
liste1.add("ahmetcetinkaya");
String yazi = liste1.get(0); // Error
// String yazi = (String) liste1.get(0);
// Object yazi = liste1.get(0);
```
```java
ArrayList<String> liste1 = new ArrayList<>();
liste1.add("ahmetcetinkaya");
String yazi = liste1.get(0);
```
## Java’da Jenerik Sınıf Örneği -1
Araçları tamir eden bir tamirci robot düşünelim. İsmi ise Servis olsun.

Servis; araçları tamir edebilir, lastiklerini değiştirebilir ve bakımlarını yapabilmektedir.

Araçları lift ile yukarı kaldırarak tezgahındaki aletleriyle ilgili işlemleri en kısa sürede yapmaktadır.

Servis, hizmet vereceği her farklı türdeki araç için ayrı tezgahlara ihtiyacı var mıdır?

Bu durumda her farklı türde araç için ayrı tezgah sınıfları oluşturulması gerekirdi.
```java
class ArabaTezgahi {
	Araba araba;

	public ArabaTezgahi(Araba araba) {
		this.araba = araba;
	}

	public Araba tamir() {
		System.out.println("Araç tamir edildi.");
		return araba;
	}

	public Araba lastikDegisimi() {
		System.out.println("Aracın lastik değişimi tamamlandı.");
		return araba;
	}

	public Araba bakim() {
	System.out.println("Aracın bakımları tamamlandı.");
	return araba;
    }
}
```
```java
class KamyonTezgahi {
	Kamyon kamyon;

	public KamyonTezgahi(Kamyon kamyon) {
		this.kamyon = kamyon;
	}

	public Kamyon tamir() {
		System.out.println("Araç tamir edildi.");
		return kamyon;
	}

	public Kamyon lastikDegisimi() {
	System.out.println("Aracın lastik değişimi tamamlandı.");
		return kamyon;
	}

	public Kamyon bakim() {
		System.out.println("Aracın bakımları tamamlandı.");
		return kamyon;
	}
}
```

Ve her yeni işi gerçekleştirirken, araç türüne göre ilgili sınıfı kullanmak gerekirdi.
```java
ArabaTezgahi arabaTezgahi = new ArabaTezgahi(new Araba());
arabaTezgahi.tamir();
arabaTezgahi.bakim();
Araba araba = arabaTezgahi.lastikDegisimi();

KamyonTezgahi kamyonTezgahi = new KamyonTezgahi(new Kamyon());
kamyonTezgahi.tamir();
Kamyon kamyon = kamyonTezgahi.bakim();
```
Bu durum hem kod tekrarına girmektedir dolayısıyla kod okunabilirliğini düşürür.


En önemlisi, bir işleme yeni bir adım eklenmek istenildiğinde tüm sınıfları düzenlemek durumunda kalırız. Örneğin: Yapılan kampanya sonucu bakım işlemine fren balatalarını değiştirmeyi eklemek.
```java
public Araba bakim() {
	System.out.println("Aracın bakımları tamamlandı.");
	System.out.println("Fren balataları değiştirildi.");
	return araba;
}
```

Araçların türleri değişse de, Servis’in hepsi için yaptığı işlemler aynıdır.
- Tamir
- Lastik Değişimi
- Bakım

Sadece işlemleri uyguladığı araç tipi değişiklik göstermektedir.

Bu durumda bir adet tezgahı jenerik olarak kullanabiliriz.

Jenerik yapıdaki tezgah sınıfını inceleyelim.

```java
class Tezgah<TArac> {
	TArac arac;

	public Tezgah(TArac arac) {
		this.arac = arac;
	}

	public TArac tamir() {
		System.out.println("Araç tamir edildi.");
		return arac;
	}

	public TArac lastikDegisimi() {
		System.out.println("Aracın lastik değişimi tamamlandı.");
		return arac;
	}

	public TArac bakim() {
		System.out.println("Aracın bakımları tamamlandı.");
		System.out.println("Fren balataları değiştirildi.");
		return arac;
	}
}
```
Jenerik yapıdaki tezgah sınıfını kullanımı inceleyelim.
```java
Tezgah<Araba> tezgah = new Tezgah<Araba>(new Araba());
Araba araba2 = tezgah.tamir();

Tezgah<Kamyon> tezgah2 = new Tezgah<Kamyon>(new Kamyon());
Kamyon kamyon2 = tezgah2.lastikDegisimi();

Tezgah<Otobus> tezgah3 = new Tezgah<Otobus>(new Otobus());
Otobus kamyon3 = tezgah3.bakim();
```

## Java’da Jenerik Kısıtları

Bazı durumlarda tür parametresi olarak her sınıfı kabul edemeyebilir.

Bu yüzden tür parametrelerine çeşitli kısıtlamalar getirilebilir.

Java’da jenerik kısıtlaması için extends anahtar kelimesi kullanılır.
Bu, T yani tür parametresinin yalnızca TemelSinif'nın alt türleri olan sınıfları kabul edebileceği anlamına gelir.

```java
class Sinif<T extends TemelSinif> {
	T tip;
	public T fonksiyon(T tip) {…}
}
```

Jenerik kısıtları birden fazla olabilir. 

Kısıtlamada bir adet temel sınıf kullanabiliyorken, birden fazla temel ara yüz kullanılabilir.

```java
class Sinif<T extends TemelSinif & TemelArayuz & DigerTemelArayuz> {
	T tip;
	public T fonksiyon(T tip) {…}
}
```

## Java’da Jenerik Kısıt Örneği

Tamirci robotumuz; Servis’e jenerik kısıt uygulayabiliriz.

Örneğin bazı durumlarda her araç tipini kabul etmeyerek sadece otomobil temel türündeki araç sınıflarını kabul edebiliriz.

```java
class Tezgah<TArac extends Otomobil> {
	...
}
```
```java
Tezgah<Araba> tezgah = new Tezgah<Araba>(new Araba());
```
```java
Tezgah<Kamyon> tezgah2 = new Tezgah<Kamyon>(new Kamyon()); // Error

Tezgah<Otobus> tezgah3 = new Tezgah<Otobus>(new Otobus()); // Error
```

## Java’da Joker Karakterler

Joker karakter Java'da soru işaretiyle ‘?’ temsil edilir.

Bilinmeyen bir türe atıfta bulunmak için kullanılırlar.

Joker karakter; parametre, alan veya yerel değişken türü ve dönüş türü olarak kullanılabilir. 

Joker karakterler, özellikle jenerik yapılar için kullanışlıdır.
```java
Sinif<?> sinif;
```

Joker karakterler, sınırsız ve sınırlı olmak üzere ikiye ayrılır.

**Sınırsız Joker Karakter:** Kalıtımla sınırlandırılmamış joker karakteri anlamına gelir. Genellikle tipi belirli olmayan verileri okumak için kullanılır.
```java
public void parcaDegistir(List<?> liste) {
for (Object parca : liste)
System.out.println(parca + " parçası değiştirildi.");
}
```
**Sınırlı Joker Karakter**: Kalıtımla sınırlandırılmış joker karakteri anlamına gelir. Kendi içinde üst sınırlı ve alt sınırlı olmak üzere ikiye ayrılır.

**Üst Sınırlı Joker Karakter**: Kalıtım yapısını extends anahtar kelimesi ile kullanır. Kendisi ve alt sınıflar ile sınırlanır. Genellikle listeden okuma için kullanılır.
```java
class Motor {}

class MotorParcasi extends Motor {}

class Piston extends MotorParcasi {}
```
```java
public static void parcaDegistir(ArrayList<? extends MotorParcasi> liste) {
	for (Object parca : liste)
	System.out.println(parca + " parçası değiştirildi.");
}
```
**Alt Sınırlı Joker Karakter**: Kalıtım yapısını super anahtar kelimesi ile kullanılır. Kendisi ve üst sınıflar ile sınırlanır. Genellikle listeye ekleme için kullanılır.
```java
public static void parcaDegistir(ArrayList<? super MotorParcasi> liste) {
	for (Object parca : liste)
	System.out.println(parca + " parçası değiştirildi.");
}
```

## Java’da Tür Silinmesi ve Aşırı Yükleme
Java'daki jenerikler, derleme zamanında tip denetimi sağlamak için Java 5 sürümü ile eklenmiştir.

Fakat tip denetimi sadece derleme zamanında sağlanır, çalışma anında zamanında sağlanmaz.

Örneğin, geliştirilme aşamasında jenerik yapıdaki sınıf parametresi
```java
public void fonkisyon(Sinif<T> sinif) {...}
```
derlemeden sonra aşağıdaki gibi jenerik yapıyı göremeyiz.
```java
public void fonkisyon(Sinif sinif) {...}
```

Bu durum aşırı yüklemede derleme hatasına yol açabilir.
```java
public void fonkisyon(Sinif sinif) {...}

public void fonkisyon(Sinif<T> sinif) {...}
```
```java
public void fonksiyon(Sinif sinif) {...} // Error

public void fonksiyon(Sinif sinif) {...} // Error
```

## Java’da Jenerik Sınıf Örneği -2

Çeşitli ürünlerin satışını gerçekleştiren bir işletme olduğunu düşünelim.

İşletme, ürün takibi için ürünleri ve kampanyalar için de müşterileri kayıt altına almak istiyor.

Bu isterler doğrultusunda sizden bir program yazmanızı istemektedir.

Bu durumda hazırlayacağınız programda ürünler ve müşteriler servisi olmalıdır.

Her servis için, veriyi kayıt etmek için belirli fonksiyonlar olmalıdır. Bunlar;
- Ekleme
- Listeleme
- Getirme
- Güncelleme
- Silme

Jenerik yapıları öğrendiğimize göre servislerimizi jenerik yapıda tasarlayabiliriz.
```java
class TemelServis<Tip> {
	List<Tip> varliklar = new ArrayList<Tip>();

List<Tip> hepsiniGetir() {
	return varliklar;
}

Tip getir(int sira) {
	return varliklar.get(sira);
}

void ekle(Tip varlik) {
	varliklar.add(varlik);
}

void güncelle(int sira, Tip varlik) {
	varliklar.set(sira, varlik);
}

void sil(Tip varlik) {
	varliklar.remove(varlik);
}
}
```

Jenerik servis sınıfını, ürünler ve müşteriler için kullanabiliriz.
```java
TemelServis<Urun> urunServisi = new TemelServis<Urun>();

urunServisi.ekle(new Urun());
urunServisi.ekle(new Urun());

for (Urun urun : urunServisi.hepsiniGetir())
	System.out.println("- " + urun);
```
```java
TemelServis<Musteri> musteriService = new TemelServis<Musteri>();

musteriService.ekle(new Musteri());

for (Musteri musteri : musteriService.hepsiniGetir())
	System.out.println("- " + musteri);
```
Daha sonra işletme sipariş bilgilerini de kayıt altına almak istediğinde yapacağımız işlem oldukça basittir.
```java
class Siparis {}
```
```java
TemelServis<Siparis> siparisServisi = new TemelServis<Siparis>();

siparisServisi.ekle(new Siparis());

for (Siparis siparis : siparisServisi.hepsiniGetir())
	System.out.println("- " + siparis);
```

## Sonuç

Java’da jenerik sınıflar, programcının işini kolaylaştırdığı ve hata olasılığını azalttığı için büyük bir öneme sahiptir.

Jenerikler, derleme zamanında tür doğruluğunu zorunlu kılar. 

Ve böylelikle en önemlisi, uygulamalarımıza herhangi bir ek yüke neden olmadan genel algoritmaların uygulanmasını sağlar.

Bu sunum, jeneriklerin temel ayrıntılarını ve programları tip güvenliği ile genişletmek için nasıl kullanılabileceğini sağlamaya yöneliktir.

## Kaynaklar

- [Generic Types](https://docs.oracle.com/javase/tutorial/java/generics/types.html)
- [Generics in Java](https://www.javatpoint.com/generics-in-java)
- [The Basics of Java Generics](https://www.baeldung.com/java-generics)
- [Java Generics Example Tutorial](https://www.journaldev.com/1663/java-generics-example-method-class-interface)
- [Java Generics](https://www.programiz.com/java-programming/generics)
- [Java’da Generics](https://medium.com/bili%C5%9Fim-hareketi/java-generics-7948a2da58d3)
- [Generics in Java](https://www.geeksforgeeks.org/generics-in-java/)


# Hakkımızda

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=OK9JE5tDoFw

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Ahmet Çetinkaya - https://ahmetcetinkaya.info