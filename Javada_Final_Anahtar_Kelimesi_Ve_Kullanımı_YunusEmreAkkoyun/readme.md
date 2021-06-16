Video-Konu Adı: Java’da Final Anahtar Kelimesi ve Kullanımı

Youtube Kanalımız: BMDersleri

BMDersleri YouTUBE  : https://www.youtube.com/bmdersleri 

Konu ile ilgili Youtube Video Linki : https://youtu.be/Eq2WcC4tpFA

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Yunus Emre Akkoyun



Final anahtar kelimesi programa yaparken daha sonrasında değişmesini istemediğimiz değişkenlerin veya yapıların sabitliğini kesinleştirmek için kullanılan bir anahtar kelimedir.
Bu videomuzda final anahtar kelimesinin javada nasıl ve hangi amaçlarla kullanılabileceğini kısa ve net bir şekilde anlatmaya çalıştım. Keyifli seyirler..

Final faklı programlama dillerinde kullanılanılabilen bir (Keyword) anahtar kelimedir.
Final anahtar kelimesin kullanım amacı oluşturulan değişkenlerin,metotların veya sınıflarn değiştirilemez
olmasını sağlamaktır.
Final anahtar kelimesi programın daha doğru, hatalara dayanıklı ve performanslı çalışmasını sağlar.
Java’da final anahtar kelimesi aşağıda yer alan yapılar için kullanılabilir:

Final sınıf değişkenleri: Final olan bir sınıf değişkenine sadece bir kere değer ataması yapilabilir ve bu atama sadece sınıf konstrüktöründe gerçekleşebilir.
Final metot parametreleri: Final olarak tanımlanmış bir metot parametresine sadece bir kere değer atanabilir. 
Final metotlar: Final olan bir metot ne alt sınıflarca yeniden yüklenebilir (method overloading) ne de saklı (hidden) tutulabilir.
Final sınıflar: Final olan bir sınıf genişletilerek bir alt sınıf oluşturulamaz.

Metot parametrelerinin tamamen final olarak tanımlamış olmalarında büyük fayda vardır. Bu şekilde parametrenin metot bünyesinde değişikliğe ugrama tehlikesi ortadan kaldırılmış olur. 
Bir metot final olarak tanımlanmışsa, metodun tanımlı olduğu class’dan bir kalıtım alındığında, ilgili metot override edilemez.

Bir class final ile tanımlanmışsa bu class’dan kalıtım alınamaz. Yani sınıfın alt sınıfları oluşturulamaz. ThisClassCannotBeExtends class’ından kalıtım alınmaya çalışıldığında program hata verecektir.

Sonuç olarak  Final deyince aklınıza “değiştirilemez”ibaresi gelebilir ve ayrıca değişkenlerden sınıflara kadar büyük bir skalada kullanılabilir.
Bu yüzden Final kelime anahtarını yazdığınız programı hatalara daha dayanıklı hale getirmek için kullanabilirsiniz.

