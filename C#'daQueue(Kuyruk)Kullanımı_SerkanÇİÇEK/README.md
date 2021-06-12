# C#'da Queue(Kuyruk) Kullanımı



- Queue (Kuyruk), ilk giren ilk çıkar işleyişine sahip bir koleksiyondur(FIFO). Koleksiyondan bir eleman çıkarılmak istenildiğinden, kuyruğun en önünde yer eleman çıkartılacaktır. Yeni eklenmek istenen bir eleman ise kuyruğun en sonuna eklenecektir.

- Aslında bu veri yapısı günlük yaşantımızda şıkça karşılaştığımız ve gözlemlediğimiz bir işleyişe sahip. Fatura yatırmak için sıra bekleyen bir grup insanın oluşturmuş olduğu bir kuyruğu düşünecek olursak; Sıraya ilk giren kişi yani kuyruğun en önünde bulunan kişi, faturasını ilk yatıracak kişidir. Bu yüzden kuyruktan ilk bu kişi ayrılacaktır. Sıraya en son giren yani kuyruğun sonunda ki kişi ise faturasını en son yatıracak kişidir. Eğer sıraya başka bir kişi daha dahil olmak isterse, direk kuyruğun en sonuna geçip sırasını bekleyecektir.



## Metotlar ve Özellikler

### 1 - Nesne Oluşturma
Queue sınıfından bir nesne oluşturuyoruz. Bu nesne, koleksiyondaki nesnelerin referanslarını tutacaktır.

### 2 - Enqueue(Eklenecek_Oge) ve Dequeue() Metotları
Enqueue() Metodu; Parametre olarak girilen öğeyi kuyruğun sonuna eklemektedir. Dequeue() Metodu; Kuyruğun başındaki öğeyi döndürür ve sonra öğe kuyruktan çıkarılır/silinir. Kuyruk boşken Dequeue() metodu çağrılırsa InvalidOperationException fırlatır.


### 3 - Peek() Metodu
Kuyruğun başındaki öğeyi döndürmektedir, Dequeue() metodunda farklı olarak öğeyi kuyruktan çıkarmaz/silmez. Kuyruk boşken Peek() metodu çağrılırsa InvalidOperationException fırlatır.

### 4 - Contains(Aranan_Öğe) Metodu
Kuyruk içerisinde parametre olarak girilen öğeyi arar. Öğe bulunursa TRUE, bulanamazsa FALSE döndürür.

### 5 - ToArray() Metodu
Kuyrukta yer alan elemanların kopyasını içeren bir dizi döndürür.

### 6 - Clear() Metodu ve Count Özelliği
Clear() Metodu; Kuyruğu temizlemektedir. Count Özelliği; Kuyruk içerisinde yer alan elemanların sayısını döndürmektedir.

# 

Youtube Kanalımız: BMDersleri

Bağlantı: <https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw>

Konu ile ilgili Youtube Video Linki : https://youtu.be/uC7aXM1xXkY

Kısa Bağlantı: <https://bit.ly/32k9MnJ>

Github Adresimiz: <https://github.com/bmdersleri>


Hazırlayan: Serkan ÇİÇEK







