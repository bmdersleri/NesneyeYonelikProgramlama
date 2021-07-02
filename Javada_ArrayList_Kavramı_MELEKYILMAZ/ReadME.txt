# Konu Adı
Java ArrayList Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=icD33w3lvrg

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Melek Yılmaz


ArrayList kavramı nedir?
Liste arayüzünün yeniden boyutlandırılabilir dizi uygulamasıdır.

Sınıfın kurucu metodları
ArrayList(): Başlangıç olarak sığası 10 terim olan boş bir dizi oluşturur. 
ArrayList(Collection c) Parametrede belirtilen koleksiyona ait öğeler içeren bir liste oluşturur.
 Öğeler, iterator’un belirlediği sırayla dizilidirler. 
ArrayList(int initialCapacity) Sığası (capacity) parametrenin belirlediği sayıda olan bir dizi oluşturur. 


ArrayList sınıfının özellikleri
Veri eklenip silindikçe ArrayList kendi uzunluğunu otomatik olarak ayarlar. 
ArrayList listesine erişim işlemi O(1), sokuşturma (insertion) işlemi O(n) ve silme (diletion) işlemi O(n) zaman karmaşasına sahiptir
ArrayList sokuşturma, silme ve arama eylemlerini yapan metotlara sahiptir. 
ArrayList üzerinde foreach döngüsü, iteratörler ve indexler yardımıyla gezinilebilir. 


ArrayList ve Array arasındaki farklar
Eğer, depoya konulacak öğe sayısı belirli ve o sayı sık sık değişmeyecekse array seçimi uygun olur.
 Ama öğe sayısı baştan bilinemiyor ya da o sayı sık sık değişiyorsa ArrayList doğru bir seçimdir. 
Tabii, buna ek olarak şunu söylemeliyiz: ArrayList nesnelerin depolanması içindir. İlkel veri tipleri depolamak için array seçilmesi uygun olur.
Bütün bunların ötesinde ArrayList sınıfı List arayüzünün metotlarını kullanma yeteneğine sahiptir;
dolayısıyla array yapısına oranla programcıya daha çok kolaylık sağlar.

ArrayList metodları
1-add metodu:Belirtilen öğeyi bu listenin sonuna veya belirtilen konuma ekler.Eğer belirtilen konumda öge varsa bu ögeyi ve ondan sonraki ögeleri sağa kaydırır.
Yani indislerini bir arttırır. 

2-isEmpty metodu:ArrayListte öge bulunup bulunmadığını kontrol ettik.Öge yoksa true değer döndürülür.

3-toArray metodu: ArrayListteki tüm öğeleri uygun sırayla (ilk öğeden son öğeye) içeren bir Array oluşturur.
Sonuç olarak  döndürülen Object[] bu listedeki tüm öğeleri uygun sırayla içeren bir dizidir.

4-addAll metodu: Belirtilen koleksiyondaki tüm öğeleri belirtilen konumdan başlayarak bu listeye ekler. Şu anda o konumda bulunan öğeyi (varsa) ve sonraki öğeleri sağa kaydırır Yani indislerini artırır.

5-get (int index) metodu: Belirtilen indisteki elemanı okur.

6-size metodu: Bu listedeki elemanların sayısını döndürür.Yani sonuç olarak int tipinde bir değer döndürür.

7-indexOf (Object o) metodu: Bu listede belirtilen öğenin ilk oluşumunun dizinini veya bu liste öğeyi içermiyorsa -1 değerini döndürür.

8-remove (int index) metodu: Bu listede belirtilen konumdaki elemanı kaldırır. Sonraki öğeleri sola kaydırır. Yani indislerini bir azaltır.

9-set (int index, E element) metodu: Bu listede belirtilen konumdaki öğeyi belirtilen öğeyle değiştirir.Belirtilen konumda öge yoksa buraya belirtilen ögeyi atar.

10-trimToSize () metodu: ArrayList nesnesinin sığasını, listedeki öğe sayısına indirir; yani boş terimleri siler. 

11-clone metodu: Bu ArrayList örneğinin basit bir kopyasını döndürür. Object bu ArrayList örneğinin bir klonudur.

12-ensureCapacity (int minCapacity) metodu: Gerekiyorsa ArrayList nesnesinin sığasını artırarak, parametrenin belirlediği minimum sığa kadar öğeyi depo edebilmesini sağlar.
Parametre olarak minCapacity verilir.minCapacity istenen minimum kapasitedir.

13-Foreach() metodu  ArrayList’teki her öğe için belirli işlemleri gerçekleştirmek için kullanılır.
Tüm öğeler işlenene veya eylem bir istisna oluşturana kadar Yinelenebilir öğenin her öğesi için verilen eylemi gerçekleştirir.

14-clear metodu: Bu listeden tüm öğeleri kaldırır. Bu çağrı döndükten sonra liste boş olacaktır.

15-contains metodu: ArrayList aradığımız öğeyi içeriyorsa true; içermiyorsa false değerini döndürür.

16-lastIndexOf (Object o) metodu:Bu listedeki belirtilen öğenin son oluşumunun dizinini veya bu liste öğeyi içermiyorsa -1 değerini döndürür.
Parametre olarak Object verilir. Object aranacak öğedir.Sonuç olarak int tipinde bir değer döndürür.

17-subList (int fromIndex, int toIndex) metodu: Bir arrayliste indexOf ve lastIndexOf indisleri arasındaki indislerin ögelerini içeren bir alt liste oluşturur.
Parametre olarak toIndex ve fromIndex verilir.fromIndex alt listenin başlangıç indisidir.toIndex alt listenin bitiş indisidir.
Sonuç olarak bu listedeki belirtilen aralığın bir görünümü döndürür.

18-retainAll metodu: dizi listesinin belirtilen koleksiyonda yer almayan tüm öğelerini kaldırmak için kullanılır veya yönteme parametre olarak iletilen Koleksiyon listesindeki tüm öğelerle
eşleşen geçerli ArrayList örneğindeki tüm eşleşen öğeleri tutar.Örneğin çanta ArrayListinde  silgi ,defter, kalem elemanları bulunsun.Dolap ArrayListinde ise defter, kitap, ayraç elemanları bulunsun.Dolap Arraylistine parametresi çanta olan retainAll metodu uygulandığında eleman olarak sadece defter bulunacaktır.Çanta ArrayListinde bulunmayan kitap ve ayraç ArrayListten kaldırılacaktır.

replaceAll metodu: Arraylistte bulunan belirli bir karakter dizisini yerini alacak başka bir  karakter dizisiyle değiştirir.
Örneğin ‘Java en kullanışlı yazılım dilidir.’ ifadesinde java karakter dizisini c ile değiştirmemizi sağlar.
Böylece oluşan yeni ifade ‘c en kullanışlı yazılım dilidir.’  olacaktır.

19-replace metodu:String bir ifade içerisinde yer alan karakterleri değiştirmeyi sağlar.
Örneğin java stringindeki  ‘va’ karakter dizisini ‘vascript’ karakter dizisiyle değiştirmemizi sağlar.

20-replaceFirst metodu:  Karakter dizisinin ilk elemanını belirtilen elemanla değiştirir.Örneğin ‘ppp’ stringindeki ilk karakter olan p’yi  q ile değiştirmemizi sağlar.
Böylece yeni ifademiz ‘qpp’ olacaktır.

21-sort metodu: Bu listeyi belirtilen karşılaştırıcı tarafından oluşturulan sıraya göre sıralar.Karşılaştırıcı null ise küçükten büyüğe;
Collection.reserveOrder ise büyükten küçüğe doğru sıralar.

22-removeIf metodu:  ile belirli bir yüklemle eşleşen tüm öğeler kaldırılır.ArrayListteki tek sayıların kaldırılması buna örnek olabilir.

23-public Iterator<E> iterator () Bu listedeki öğeler üzerinde uygun sırayla bir yineleyici döndürür. Iterator ile listemizde ileri doğru gezebilir elamana ulaşabilir ve eleman çıkartabiliriz .

24-spliterator metodu: bu kümedeki öğeler üzerinde geç bağlanan ve başarısız hızlı Spliterator oluşturmak için kullanılır.

25-listIterator metodu: Sonuç olarak bu listedeki öğeler üzerinde uygun sırada bir liste yineleyici döndürür.ArrayList üzerinde ileri – geri doğru hareket edebiliriz. Elemanları alabilir, üzerinde düzeltme yapabiliriz.

26-removeRange (int fromIndex, int toIndex) metodu:fromIndex ve toIndex arasındaki indislere sahip elemanları  kaldırır.Sonraki elemanların dizinlerini bir azaltır. ToIndex == fromIndex ise ArrayListte bir değişim olmayacaktır.

27-removeAll metodu:Bu listeden, belirtilen koleksiyonda bulunan tüm öğelerini kaldırır.

