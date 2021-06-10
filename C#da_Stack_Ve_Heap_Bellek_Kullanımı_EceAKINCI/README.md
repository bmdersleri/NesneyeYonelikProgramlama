# Konu Adı
C#'da Stack Ve Heap Bellek Kullanımı Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/b112ZTALCN0

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Ece AKINCI


 	Yazdığımız kodlar işletim sisteminde bir yer kaplamaktadır. Böylelikle C# dilinde veriler boyutuna ve tipine göre RAM’ in Stack ve Heap mantıksal bölümlerinde tutulur.  Bu “yığın” anlamına gelen iki kavram bellekte verinin en uygun şekilde saklanmasını sağlamaktadır, fakat bu aşamada aralarında farklılıklar görülmektedir. Örneğin Stack bellek, değer türlerini, pointer ve adresleri hafızasında tutarken Heap bellek sadece referans türlerini hafıza bölgesinde tutar. 

 	int, long, float, double, byte, short, bool ve char gibi tipler Değer Tipleri’dir (Value Types) ve pointer olmadan kullanılabilirler. object, class, interfaces ve delegates gibi tipler ise Referans Tipleri’dir (Reference Types) ve pointer ile kulanılırlar. 

 	Verilerin bellek içerisinde dizilimi de bu iki bellekte farklıdır. Stack bellekte veriler LIFO (Last-In-First-Out) mantığıyla dizilirken Heap bellekte dağınık bir şekilde dizilmektedir. Bundan dolayı Stack hafıza bölgesindeki bir veriye erişim hızlıyken Heap’de ise durum farklıdır, bu işlem daha yavaş ve maliyetlidir. 

 	Bu iki belleğin kullanımından bahsetmemiz gerekirse, Stack bellek derleme zamanında oluşturulur ve istif bellek olarak adlandırılır, Heap bellek ise çalışma zamanında (runtime) oluşturulur ve dinamik bellek olarak adlandırılır. Oluşturulan değişkenlerin boyutları belli ise Stack bellek, değilse Heap bellek tercih edilmelidir

  	Stack alanı sınırlı olduğundan büyük sayıda ve büyük tiplerde veri atanması Stack Taşma Hatası’na (Stack Overflow) yol açacaktır. Heap’de oluşan bellek sıkıntısı da şu şekildedir, Stack bellekte veriler program kapatıldıktan sonra bilgisayar tarafından otomatik silinmektedir fakat Heap’deki veriler birdaha kullanılmamak üzere orada kalacaktır ve bundan dolayı da bellek bir süre sonra hata verecektir. Diğer birçok dilde Garbage Collector (Çöp Toplayıcı) algoritması bu sorunu giderirken C# dilinde bu algoritma olmadığından dolayı manuel olarak yapılması gerekmektedir.

