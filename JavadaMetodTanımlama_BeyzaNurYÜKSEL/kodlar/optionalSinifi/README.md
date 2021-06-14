Java Optional Sınıfı

Bir Java geliştiricisinin korkulu rüyası NullPointerException istisnalarıyla uğraşmaktır. 
null değer ile karşılaşmak, ona karşı önlem almak herzaman için can sıkıcı olmuştur. 
Bu can sıkıcılığı ortadan kaldırmak için Java 8 içerisinde Optional sınıfı getirilmiştir. 
Optional yapısı daha evvelden farklı dil ortamlarında bulunan bir özelliktir.
Bu sınıf; null referanslar yerine isteğe bağlı değerleri göstermek için iyi bir çözüm sunmaktadır.

Optional sınıfı  java.util paketine aittir.

import java.util.Optional;
Şimdi basitçe bir optional nesnesi nasıl oluşturulur ona bakalım.

Optional empty = Optional.empty();
Yukarıda gördüğünüz üzere basitçe Optional sınıfının empty() metodunu kullanarak boş bir Optional nesnesi oluşturmuş olduk.
Optional türde bir objenin T tipine erişebilmek için get() methodu kullanılır. Empty yani boş oluşturulan bir Optional nesnesini get etmek istersek NoSuchElementException ile karşılaşırız. Sebebi nesneye henüz bir değer atanmamış olmasıdır.

Bir Optional nesnesi üzerinde herhangi bir değer olup, olmadığını nasıl kontrol ediyoruz ona bakalım.

empty.isPresent()
Yukarıdaki blokta olduğu gibi isPresent() metodunu kullanarak herhangi bir Optional nesnesi üzerinde bir değer olup, olmadığını kontrol edebiliriz.
Sonuç olarak üzerinde henüz herhangi bir değer olmadığı için bize false dönecektir.

ifPresent : Bu method Optional türde olan bir nesne için eğer tanımlı ise içerisinde işlem yapılmasına izin verir. 

get : Bu method Optional sınıfı içerisinde oluşturulmuş olan T tipindeki nesneye erişmek için kullanırız

ofNullable : Bu method Optional türde olmayan herhangi bir nesneyi Optional türe çevirmek için kullanılır. Adındanda anlaşıldığı üzre atanan değer null olabilir.of methodundan ayrı olarak null değeri verdiğimiz zaman NullPointerException değilde NoSuchElementException ile karşılaşırız.

of : Bu method Optional türde olmayan herhangi bir nesneyi Optional türe çevirmek için kullanılır. Tabiki bu nesneye bir değer atanmış olması gerekmektedir. Eğer NullPointerException almak istiyor isek of methodunun içerisine null değerini vermemiz yeterlidir.


