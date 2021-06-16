Konu Anlatım Videosu =	
BMDersleri =	https://www.youtube.com/bmdersleri
Github Adresimiz =	https://github.com/bmdersleri
Hazırlayan =	Fatih Herken
 
 
 ## _JAVA'DA BAĞLI LİSTE (LİNKEDLİST) KULLANIMI​_
 

##   Bağlı Liste (Linked List)​
 
- Bağlı liste, düğüm (node) ismi verilen bir elemanda veri saklar. 
- Düğüm elemanlarına ulaşmak için liste üzerinde gezilir
- Bağlı liste çeşitleri vardır.


##   Tek-Yönlü Bağlı Liste (Singly Linked List)​
 
- Düğüm içerisinde iki adet değişken bulunur. Bunlardan birisi veri için ayrılmıştır. Diğer değişken ise işaretçidir (pointer), bir sonraki düğümün adresini tutar.

## TEK YÖNLÜ BAĞLI LİSTENİN AVANTAJLARI
> Uygulanması en kolay veri yapısıdır.​
> Eleman ekleme ve silme işlemleri kolaylıkla yapılabilir.​
> Düğümlerin eklenmesi ve silinmesi sırasında tüm düğümlerin hareket etmesi gerekmez.​
> İki yönlü bağlı listelere veya dairesel dairesel bağlı listelere kıyasla daha az bellek gerektirir.​
> Yürütülmesi sırasında gerektiğinde ihtiyaç duyulan bellek kolayca tahsis edebilir veya serbest bırakabilir.​
> Bir yönde hareket etmek gerektiği durumlarda uygulanacak en verimli veri yapısıdır. 
 

##   Çift-Yönlü Bağlı Liste (Doubly Linked List)​
 
> Düğüm içerisinde 3 adet değişken bulunur. Bunlardan birisi yine veri için ayrılmıştır. Diğer iki değişkenler işaretçidir (pointer) ve birisi kendinden önceki düğümü, diğeri kendinden sonraki düğümü tutar.​
> Java'da LinkedList bir sınıf olarak ve bir Node ayrı bir sınıf olarak temsil edilebilir. LinkedList sınıfı, Node sınıf türünün bir başvurusunu içerir.​
> Java koleksiyon çerçevesinin LinkedList sınıfı, bağlantılı liste veri yapısının (çift bağlantılı liste) işlevselliğini sağlar.​

| AVANTAJLARI | DEZAVANTAJLARI |
| ------ | ------ |
| Liste üzerinde çift yönlü hareket edilebilir,​ | Önceki işaretçi için bellekte fazladan yer kaplar,​ |
| Ekleme, Silme gibi bazı işlemler daha kolaydır.​ | Her düğümün önceki (prev) ve sonraki (next) adında iki işaretçisi olduğu için liste işlemleri daha yavaştır,​  |
|   | Hata yapılma ihtimali yüksektir. Örneğin listeye eleman ekleme sırasında, önceki işaretçileri sonraki işaretçilerle birlikte değiştirmemiz gerekir. Herhangi bir işlemin atlanması hataya neden olur.​|
 

[![N| ](https://miro.medium.com/max/5120/1*3uwHIPwTVKZTv_788lfG9w.jpeg)]( )


| Methodlar​ | Description  |
| ------ | ------ |
| contains()​ | LinkedList öğesinin içerip içermediğini kontrol eder.​ |
| indexOf()​ |Öğenin ilk oluşumunun dizinini döndürür.​  |
|  lastIndexOf()​  | Öğenin son oluşumunun dizinini döndürür.​ |
|    clear()​​  | LinkedList'in tüm öğelerini kaldırır.​|
 
## LinkedList as Deque and Queue​

| Methodlar​ | Description  |
| ------ | ------ |
| addFirst()​ | bağlantılı listenin başına belirtilen öğeyi ekler.​|
| addLast()​ |bağlantılı listenin sonuna belirtilen öğeyi ekler.​​  |
|  getFirst()​  | ilk öğeyi döndürür.​ |
|    getLast()​​  | son öğeyi döndürür.|
|    removeFirst()​​  | ilk öğeyi kaldırır.​​|
|    removeLast()​​  | son öğeyi kaldırır.​.​|
|    peek()​​  | bağlantılı listenin ilk öğesini (başını) döndürür.​​|
|    poll()​​  | bağlı listedeki ilk öğeyi döndürür ve kaldırır..​| 
|    offer()​​  | bağlantılı listenin sonuna belirtilen öğeyi ekler.​|
 
  
## LinkedList Ve ArrayList​
- Hem Java ArrayList hem de LinkedList, Koleksiyonlar çerçevesinin Liste arayüzünü uygular. Ancak aralarında bazı farklar vardır.​

| LinkedList​​ | ArrayList  |
| ------ | ------ |
| List, Queue ve Deque arayüzlerini uygular. | Liste arayüzünü uygular.​|
| 3 değeri (previous address, data ve next address) tek bir konumda depolar.​ |Tek bir konumda tek bir değeri saklar.​  |
|  Çift bağlantılı liste uygulamasını sağlar.​  | Yeniden boyutlandırılabilir bir dizi uygulaması sağlar.​ |
|    Bir eleman eklendiğinde, önceki ve sonraki adres değiştirilir.​​  | Bir öğe eklendiğinde, bu konumdan sonraki tüm öğeler kaydırılır.|
|    Bir öğeye erişmek için, baştan öğeye kadar yinelememiz gerekir.​​  | Dizinler kullanarak öğelere rastgele erişebilir.​| 
  