# Konu Adı
Java Reader Sınıfı

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/8b8TiuEpWjM

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan:Talha NURDAĞ


​​Java Okuyucu Sınıflar
Karekter akımlarını okuyan soyut (abstract) sınıftır.​Soyut sınıf (İngilizce: abstract class), nesne yönelimli programlamada nesnesi yaratılamayan sınıflara denir. Nesne yaratılamamasının nedeni, sınıfın kullanıcı arayüzünde yer alan bir veya daha çok sayıdaki iletinin gerçekleştirilmemesidir.

Extends Ne Demek
Genel olarak bir sınıftan yeni sınıflar türetmek olarak açıklanabilir.Kalıtım veya miras olarak da bahsedebiliriz.Günümüzden örnek vericek olursak yapı olarak ; yeni doğan bir çocuğun anne ve babasından bir takım özellikleri taşıması olabilir.

Reader Metotları
ready() - Okuyucunun hazır olup olmadıgını kontrol eder​
read(char[] array) - Stream den karakterleri okur ve spesifik bir array'de depolar.​
read(char[] array, int start, int length) - Akıştan uzunluğa eşit karakter sayısını okur ve baştan başlayarak belirtilen dizide depolar​
mark() - Stream'den okunan verinin oldugu yeri işaretler.​
reset() - returns the control to the point in the stream where the mark is set//Stream'deki işaretin oldugu yere döner.​
skip() - Stream'deki spesifik numaralı karakterleri geçer.

Reader Altsınıfları
​BufferedReader, CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader

BufferedReader
Bir girdi akışındaki metni (bir dosya gibi) karakterleri, dizileri veya satırları sorunsuz bir şekilde okuyan karakterleri tamponlayarak okuyan Java sınıfıdır.​

PipedReader
PipedReader(int boruBoyutu) Henüz bağlı olmaması için bir PipedReader oluşturur ve borunun arabelleği için belirtilen boruboyutunu kullanır.​
PipedReader(PipedWriter src) PipedWriter kaynağına bağlanması için bir PipedReader oluşturur.​
PipedReader(PipedWriter src, int pipeSize) PipedWriter kaynağına bağlanması ve borunun arabelleği için belirtilen boru boyutunu kullanması için bir PipedReader oluşturur.​
PipedReader() Henüz bağlı olmayan bir PipedReader oluşturur.

Alt Sınıflar(Devamı)​
​Genel  kural  olarak, BufferedReader  tarafından  okunan  veri,  ilgili  karekter  ya  da  byte  dizisine  dönüşür. Kaynaktaki  veri  büyükse,  her  okuma  sonunda  söz  konusu  dönüşümün  yapılması,  eylemi  yavaşlatacaktır.  O nedenle,  doğrudan read()  metodu  ya  da readLine()  metodu  yerine FileReader  ya  da InputStreamReader sınıflarını eyleme katmak daha etkin olur.​
Java CharArrayReader sınıfı ( java.io.CharArrayReader), bir char dizinin içeriğini bir karakter akışı olarak okumanızı sağlar .​
Filtrelenmiş karakter akışlarını okumak için soyut sınıf. Soyut sınıfın FilterReader kendisi, tüm istekleri içerilen akışa ileten varsayılan yöntemler sağlar.
Bu sınıf temelde borulu bir karakter giriş akışıdır. G / Ç Borulu'da, JVM'de aynı anda çalışan iki iş parçacığı arasında bir bağlantı anlamına gelir. Dolayısıyla Borular hem kaynak hem de hedef olarak kullanılır.​

InputStreamReader
Java 1.1 sürümüyle gelen InputStreamReader sınıfı byte akımından karekter akımına geçişköprüsü gibidir. Giriş akımından byte okur, onları istenen charset’e dönüştürür. Sözkonusucharset, kullanılan platformun belirlediği istemsiz (implicit) charset olabileceği gibi, programcınınbelirleyeceği istemli (explicit) charset de olabilir.

Charset Nedir?
(Karakter kodlaması) Bilişimde karakter kodlaması kavramı bir çeşit kodlama sistemi kullanılarak kodlanmış karakter gruplarını temsil etmektedir. Soyutlama düzeyi ve kullanıldığı bağlama bağlı olarak karakterlere karşılık gelen kod noktaları ve bunların oluşturdukları kod alanı, bit örüntüleri, oktetler, doğal sayılar, elektrik sinyalleri vb. şeklinde algılanabilir

CharArrayReader
CharArrayReader(char[] buf) Belirtilen karakter dizisinden bir CharArrayReader oluşturur.​
protected char[] buf = Karakter arabelleği.​
protected int pos = Geçerli arabellek konumu.​
boolean markSupported() = Akışın mark() işlemini destekleyip desteklemediğini söylemek için kullanılır.




