# Konu Adı: Java'da Karar Yapıları Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/cJwzniH5hy8

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Hilal ÇINAR



-> JAVA'DA IF İFADESİ:

If durumunda girilen koşulumuz doğru olarak değerlendirilirse, koşul doğru olduğunda çalışması istenilen kod çalışır, girilen koşul false dönüyorsa if durumunda herhangi bir geri dönüş olmaz. Ve sonlanır. Çünkü tek seçimli bir yapıdır.

If ifadesinin genel biçimi veya sözdizimi şöyledir:

if (koşul) {

   	// Yürütülmek istenen ifadeler (Çalıştırılmak istenen kod)

}


-> JAVA'DA IF / ELSE İFADESİ:

Artık if durumundan farklı olarak çift seçimli bir yapı vardır. Yani koşulumuzun yanlış olduğu durum da çalıştırabileceğimiz bir kod bloğu daha vardır. Koşul true olarak döndüğünde if kısmının altında bulunan durum çalışır koşul false şeklinde döndürüldüğündeyse else durumunun altında bulunan kod bloğu çalışır.

If / else ifadesinin genel biçimi veya sözdizimi şöyledir:

if (koşul)
{

    // Koşul doğru ise bu süslü parantezler arasında verilen kodları yürütür 

}else{

    // Koşul yanlış ise bu süslü parantezler arasında verilen kodları yürütür 

}
 

-> JAVA'DA TERNARY OPERATÖRÜ:

Ternary Operatörü kendi kalıbında şarta göre farklı değerleri döndürmemizi sağlayan bir operatördür. Bu Operatör tam olarak if - else operatörleri ile yapılan işlemleri tek satırda yapmamızı sağlar. Mantığı; ilk önce bir şart durumuna sahip olmamız gerektiği ile başlar, daha sonra Ternary operatörünün kalıbına uyarak soru işareti ve iki nokta üst üste kullanırız. İki nokta üst üstenin iki yanında boşluklar bulunur ve bu boşluklardan birine koşul doğru olduğunda çalışacak kodu diğerineyse koşul yanlış olduğunda çalışacak kodu yazarız. Bu operatörü her durumda kullanmak mantıklı değildir ama bazı durumlarda çok işimize yaramakta temiz kod yazmamızı sağlamaktadır.

Java’da Ternary Operatörü Kalıbı Şöyledir:

	String mesaj =  ..Şart/Durum..?..Şart doğru olduğunda..:..Şart Yanlış olduğunda..


-> JAVA'DA İÇ İÇE GEÖMİŞ IF İFADESİ (NESTED IF):

Nested if kısmına baktığımızda; iç içe geçmiş bu if’ler en dıştaki if’in koşulunun true dönmesi ile çalışma ihtimali olan if durumlarıdır. Bu if’lerin de çalışabilmesi için o if’ler için girilen koşulların doğru olması gerekir. İç kısımda bulunan if’lerin koşullarının doğru ya da yanlış olması dışta bulunan if yapısının çalışıp çalışmama durumunu etkilemez.

Java’da iç içe geçmiş if ifadesinin (Nested if) genel biçimi veya sözdizimi şöyledir:


if (koşul1) 
{

   	// koşul1 doğru olduğunda çalıştırılır

   	if (koşul2) 
   	{

      		// koşul2 doğru olduğunda çalıştırılır

   	}
}
 
	
-> JAVA'DA IF / ELSE - IF İFADESİ: 

If / else – if durumu için; bu durumda elimizde pek çok ihtimal bulunmaktadır. Pek çok durumun olabilmesine ihtimal sağlar. İlk kısımda bulunan if durumunun koşulu false dönerse yukarıdan aşşağı else if durumlarının koşulları kontrol edilir ve true dönen bir koşul olana kadar değerlendirme devam eder eğer true dönmüyorsa en sonda bulunan else durumu çalışacaktır.

if / else – if ifadesinin genel biçimi veya sözdizimi şöyledir:


if(koşul1){

 	 //koşul1 doğru olduğunda çalıştırılır

}else if (koşul2){

  	 //koşul2 doğru olduğunda çalıştırılır

}else if (koşul3){

  	//koşul3 doğru olduğunda çalıştırılır

}
.
.
.
else{

  	//Koşullardan hiçbiri doğru değilse çalışacak kod kısmı
 
}


-> JAVA'DA SWITCH - CASE İFADESİ:

If / else – if durumuna benzer, ama Switch – case durumunda aralıklarla değil nokta atışlarıyla çalışırız. İstediğimiz durumu direkt olarak belirtmemiz gereklidir. Bu durum da yukarıdan aşşağı bir mantık ile çalışır ve her Switch – case ifadesinde break komutunun bulunması gereklidir yoksa Switch – case ‘e özgü olan bir durum ile bir kere true döndüğünde default kısmı da dahil tüm case’lerin kod bloklarını çalıştıracaktır. Hiç bir case true dönmez ise en sonunda default ile bitirilir.


Java’da Switch – Case ifadesinin genel biçimi veya sözdizimi şöyledir:

 switch (Değişken ismi) {
            case koşul1:
                Çalıştırılacak kod
                break;
            case koşul2:
                Çalıştırılacak kod
                break;
            case koşul3:
                Çalıştırılacak kod
                break;
            default:
                Çalıştırılacak kod
        }



 switch (Değişken ismi) {

            case koşul1:
                Çalıştırılacak kod
                break;

            case koşul2:
                Çalıştırılacak kod
                break;

            case koşul3:
	    case koşul4:
                Çalıştırılacak kod
                break;

            default:
                Çalıştırılacak kod
        }



-> BREAK - CONTINU NEDİR?

Break, döngüyü sona erdirir, bu ne anlama gelir programın akışında herhangi bir yerde break gördüğümüz de break görür görmez içinde bulunduğumuz döngü anında koşula bakmadan sona erer koşulun doğru ya da yanlış olması hiçbir şey ifade etmez.
	
Continue, altındaki işlemleri yapmadan döngünün en başına gider... Örneğin programın herhangi bir yerinde continue görüldü continue direkt olarak döngünün en başına gider ve alttaki hiçbir işlemi gerçekleştirmez.


