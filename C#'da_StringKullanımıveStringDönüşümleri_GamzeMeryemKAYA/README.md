# C#'da String kullanımı ve String Dönüşümleri

C#'da String kullanımı ve string dönüşümleri Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : 

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Gamze Meryem Kaya

# 

# STRİNG NEDİR - KULLANIMI

Türkçe’de dizgi anlamına gelmektedir.
String veri tipi C#’ın en önemli ve temel diyebileceğimiz veri tiplerinden biridir.
String; C# üzerinde bir metin, bir paragraf, belki bir roman şeklinde, uzunluğu kullandığınız bellek boyutuyla sınırlı olmak şartıyla, istediğimiz uzunluktaki veriyi tutan veri tipidir.
Çift tırnak içerinde gösterilir

System.String string farkı
string ifadesi System.String sınıfını çağırmak için kullandığımız bir aliasdır(takma ad). Kısacası ; string sözcüğünün System.String farkı yoktur.

# STRİNG ÖZELLİKLER

Bir string literal tek satır olmak zorundadır
Stringleride ilk değer ,tanımlanırken ya da değer tanımlandıktan sonra atanabilir 
string olarak tanımlanmış bir ifadeyle matematiksel işlem yapamayız bunları sayısal verilere çevirmediğimiz takdirde metin olarak algılanır.
string referans türü olmasına rağmen metotlara geçirilirken değer tipiymiş gibi kopyalanırlar.


# METOTLAR

Concat(): Parametre olarak verilen nesneleri string türünde birbirine peşisıra ekler ve geriye string türünde bir değer döndüren String metodudur.
Compare():Parametre olarak verilen iki string ifadeyi karşılaştırır ve geriye int türünde bir veri döndürür. Eğer dönüş değeri sıfır (0) ise iki metin birbirine eşittir. Aksi takdirde parametre olarak verilen metinleri ilk harflerinden itibaren tek tek karşılaştırır ve farklılığın olduğu ilk harflerin alfabedeki sıralarına göre -1 veya 1 sayı değerlerini döndürür.
Length: String değişkeni içerisinde ki metninizin uzunluğunu size geri döndürür.
String StartsWith();Metot ile string ifadesinin başlangıç karakterinden itibaren belirtilen değerin eşleşip eşleşmediğini   kontrol eder. Geriye boolean türde değer döner. Eşleşme sağlanırsa "true", sağlanmaz ise "false" geriye döner.
EndsWith(): Bir string'in ne ile bittiğini bulmak için kullanılır
Trim(); = metin değişkeninin başındaki ve sonundaki boşlukları siler.
ToLower(); =Bütün harfleri küçük yapar.
ToUpper(); = Bütün harfleri büyük yapar.
Remove(4); = 4. indexten itibaren sil.
Replace(‘bu değerleri’,’buna cevir’); = Bu metod iki parametre almaktadır.Birincisine değiştirilmek istenenen karakter,ikincisine yerine getirilecek karakterdir. 
Insert(indexNo,””); = Bu metod sayesinde istediğimiz indexten sonrasına istediğimiz eklemeyi yapabiliriz.

Copy():Parametre olarak verilen string türündeki metnin bir kopyasını almaya yarayan String metodudur. 
IsNullOrEmpty( ):Parametre olarak verilen string türündeki değişkenin içeriğinin boş mu olduğunu kontrol eden metottur. Eğer değişkenin içeriği boşsa geriye bool türünde true değeri döndürür. Eğer değişkene herhangi bir değer ataması yapılmışsa geriye false değerini
döndürür.
IndexOf(string):Birlikte çağırıldığı metinsel ifade içerisinde parametre olarak verilen string ifadeyi arar ve geriye bu ifadenin, metin içerisinde ilk bulunduğu karakter sırasını döndürür. Eğer aranan ifade metin içerisinde bulunamazsa geriye -1 değeri döndürür.
Substring():
Birlikte çağrıldığı metni parametre olarak verilen indeks değerinden itibaren keser ve arta kalan metni geriye string türünde döndüren metottur.
Split():Split metodunun temel çalışma şekli şöyledir. Bir dizgeyi (karakter dizisi) belirli bir ayraç ile parçalayıp, parçalardan bir dizi döndürür.
String.Format():Format metodu string ifadeleri belirli bir biçimde belirli bir standartta yazdırılması istendiğinde kullanılan metod'dur. 

# TÜR DÖNÜŞÜMÜ

String veri türü dönüşümleri to.String Convert.ToString Parse  dönüşümleriyle yapılabilir

ToString() ile Convert.ToString() Arasındaki Fark
İki method da string’e dönüştürme işlemi için kullanılır ancak aralarında ufak bir fark mevcuttur. Eğer dönüşüm yapılacak obje değeri null ise .ToString() ile yapılan dönüştürme işleminde NULL Reference Exception verirken, Convert.ToString() ile yapılan dönüşümde exception vermez.


