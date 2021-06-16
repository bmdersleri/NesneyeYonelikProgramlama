# Javada Gelişmiş Tamponlama İşlemleri (Buffer Sınıfları) 


Kavramsal olarak, bir tampon bir nesnenin içine sarılmış ilkel veri elemanları dizisidir. Bir Buffersınıfın basit bir diziye göre avantajı, veri içeriğini
 ve verilerle ilgili bilgileri tek bir nesneye kapsüllemesidir.

Bir Buffer nesne, sabit miktarda veri için kap olarak adlandırılabilir. Verilerin depolanıp daha sonra alınabileceği bir bekletme tankı görevi görür.
Java’nın dosya üzerinde işlemlerinde daha gelişmiş giriş çıkış işlemleri de mevcut. Ağ uygulamalarında sunucu ve istemci tarafında bir giriş çıkış 
görevlendirilmiştir. Veri gelirken alır ve diğer veri gelene kadar beklemede kalır. Yani biz hiç veri almazsak, bu veri kabul etme işi için atanmış 
eleman boş olarak bekletilir. Bu da bir performans ve işlem bakımından güç kaybı nedenidir.Önceki sınıflarla çalışırken, veri işlem yapmak için 
birçok ara sınıf kullanıyorduk. Bir byte veriyi alırken veya bir dosyaya yazarken, birçok işlemden geçirerek String olarak almayı sağlıyordu. 
Bu süreçte veriye tip dönüştürme kavramı uygulanıyor. Bu da uygulama performansı olumsuz etkiler. 
Bu tür sorunları; gelişmiş tamponlama işlemleri ile çözebilmek mümkündür.


Javada Buffer Sınıfları 7'ye ayrılır:

    1) ByteBuffer Sınıfı ve Metodları : Bu sınıf; byte temel veri tipine uygundur. Dolayısıyla byte veriler üzerinde tamponlama işlemi gerçekleştirecektir.

    2 ) CharBuffer Sınıfı ve Metodları : Dönüş değer tipleri CharBuffer türündendir. Ayrıca metodlara parametre olarak verilen temel veriler de char türündedir. 

    3 ) DoubleBuffer Sınıfı ve Metodları : Dönüş değer tipleri DoubleBuffer türündendir. Metodlara parametre olarak verilen değerler double tipindedir.

    4 ) FloatBuffer Sınıfı Metodları : Dönüş değer tipleri FloatBuffer türündendir. Metodlara parametre olarak verilen değerler float tipindedir. 

    5 ) IntBuffer Sınıfı ve Metodları  : Dönüş değer tipleri IntBuffer türündendir. Metodlara parametre olarak verilen değerler integer, yani tamsayı tipindedir.

    6 ) LongBuffer Sınıfı ve Metodları : Dönüş değer tipleri LongBuffer türündendir. Metodlara parametre olarak verilen değerler long tipindedir. 

    7 )ShortBuffer Sınıfı ve Metodları  : Dönüş değer tipleri ShortBuffer türündendir. Metodlara parametre olarak verilen değerler short tipindedir. 


# SONUÇ : 

Önceki sınıflarla çalışırken, veri işlem yapmak için birçok ara sınıf kullanıyorduk. Ancak bu durum bir karmaşıklığa neden oluyor. Bu sorunları; 
gelişmiş tamponlama işlemleri ile çözebilmek mümkündür.


   
# 

   Youtube Kanalımız: BMDersleri

   Bağlantı: https://www.youtube.com/bmdersleri

   Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=6g9HbMVmfv4

   Kısa Bağlantı: https://bit.ly/32k9MnJ

   Github Adresimiz: https://github.com/bmdersleri

   Hazırlayan: Şilan Dersu KILIÇ

