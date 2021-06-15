Konu Başlığı: C# Dilinin Tarihçesi ve Kurulumu

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/SjRpC8pZa08

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Eren TAYMAZ

Bu sunum içeririsinde Iterator kavramını ve ne işe yaradığını açıklayarak C# Dilinde Iterator uygulamasını yaptım.Daha sonrasında Yield Sözcüğünün tanımlamasını yaparak yine Yield ile Iterator uygulamasını da yaptım. 

Anahtar Kelimeler: #Iterator #Foreach #Yield #YieldKeyword #C #Döngü #Interface #Arayüz #Design #Pattern #IteratorDesignPattern #Proprety #ConcreteIterator #Aggregate #ConcreteAggregate #Client #Struct IAggregate #Count #BMDersleri

Iterator bir çözüme giden her adımı tarif etmektir.Türkçe'de anlam olarak 'Tekrarlayıcı','Yineleyici' anlamlarına gelir.Iterator bir koleksiyonun türüne bakmaksızın elemanları üzerinde gezinmemizi sağlar.C#’da iterator dendiğinde aklamıza ilk olarak foreach döngüsü gelmektedir. Foreach döngüleri ile bir koleksiyon veya array içerisindeki elemanlara erişip istediğimiz işlemleri gerçekleştirebiliyoruz. Foreach döngüsünün arka planına baktığımızda da aslında bir iterator yapısı görülür çünkü iteratorlar foreach döngüleri tarafından kullanılırlar. İşlem yaptıkları koleksiyonlar veya arrayler içerisindeki elemanları foreach döngüsüne iletirler.

Iterator’lar, diziler ya da koleksiyonlar üzerinde’yield’ anahtar sözcüğü arayıcılığıyla çözüme gidecek olan adımları oluşturur.Yield Keywordü C# 2.0 ile birlikte gelmiş olup iterasyon işlemlerini daha kısa ifadelerle oluşturmamızı sağlar.
Yield keyword’ünün iki farklı kullanım şekli vardır:
	◉Yield return <value>
	◉Yield break

Yield return ifadesi ile iterator’a çağrı yapılan foreach döngüsüne bir eleman döndürülür.
Yield break ifadesi ile aktif olarak bulunan iterator içerisindeki iterasyonun son  erdiği bilgisi iterator’u çağıran foreach döngüsüne iletilir.

SONUÇ
C#’da Iterator yapısı Foreach döngüleri ile bir koleksiyon veya dizi içerisindeki elemanlara erişerek  istediğimiz işlemleri gerçekleştirmemizi sağlar.
Foreach döngüsü verilen koleksiyon veya dizi içerisindeki elemanları iterator sayesinde tek tek elde eder.
Iteraror’lar bir metot olarak geliştirelebileceği gibi aynı zamanda bir property’nin get erişimcisi olarak ya da bir operator olarak da geliştirilebilir.
Iterator Tasarım deseni ile periyodik ya da aşamalı işlemleri rahat bir şekilde veri kümesini uygulamadan soyutlayarak kullanılabilir.
Iterator yapıları işlemleri gerçekleştirmek üzere kurgulu olduğu için üzerinde gezdiği koleksiyonun ne olduğunu bilmez.


