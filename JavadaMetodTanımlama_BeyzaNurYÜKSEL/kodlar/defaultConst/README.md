Default Constructor

Sınıfınızda herhangi bir yapılandırıcı uygulamıyorsanız, Java derleyicisi sizin adınıza  varsayılan bir yapılandırıcı ekler. Bu yapılandırıcı varsayılan yapılandırıcı olarak bilinir.

Constructor hakkında bilmemiz gereken bazı bilgiler: 
1.Constructor nesneyi hayata hazırlar.
2.Her sınıfın constructorı mutlaka var.
3.Ben constructor yazmassam benim yerime derleyici yazıyor.
4.Constructor sınıf ismi ile aynı olmalıdır.
5.Constructor geri dönüş kavramı yoktur. (void değil karıştırılmamalı)
6.Constructor NON-STATIC üye fonksiyonudur.
7.Constructor const OLAMAZ.
8.Constructor OVERLOAD edilebilir.

Parameter değişkeni olmayan yada tüm parametre değişkenleri varsayılan argüman alan constructor.
Başka bir deyişle, argüman göndermeden çağırılabilen constructor.

Argüman nedir?
Fonksiyon çağrılarıyla fonksiyonlara gönderilen ifadelere argüman yada actual parameter denir.
Biz herhangi bir constructor yazmassak, derleyici bize non-static, inline, public bir constructor yazar.
