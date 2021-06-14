Java'da Erişim Belirleyiciler

Bir java deyimi (belli bir iş yapan kod veya kodlardan oluşan blok) bir değişkeni çağırabiliyorsa (kullanabiliyorsa), o kod sözkonusu değişkene erişebiliyor, denir.
Benzer olarak, bir java kodu bir metodu çağırabiliyorsa, o kod sözkonusu metoda erişebiliyor, diyoruz.
Bir sınıfın içindeki kodlar, başka bir sınıfın içindeki değişkenlere ve metotlara erişebiliyorsa, o sınıf sözkonusu sınıfa erişebiliyor, diyoruz. 
Paketler için de benzer tanım geçerlidir.

Bir Java öğesi (değişken, metot, sınıf, paket) tanımlanırken, o öğeye kimlerin erişebileceğini belirtme olanağı vardır. 
Bunlara Erişim Belirtkeleri (Access modifiers, access levels) denir. 
Java terimleriyle söylersek, erişim belirtkeleri sistemin güvenliğini sağlar. 

Dört tane erişim belirtkesi vardır:

-Public: Public, olan elemana herkes erişebilir.
-Protected: Bir sınıf protected olarak tanımlanmış elemanına o sınıftan, o sı ıftan türetilmiş sınıflardan ve o sınıf ile aynı pakete bulunan sınıflara erişilebilir.
-Private: Private olarak tanımlanan sınıflara yanlız o sınıftan erişilir. Bunun haricinde erişilemez.
-Default: Herhangi bir erişim belirleyici tanımlanmamışsa default olarak kabul edilir. Default tanımlanmış sınıf elemanına, o sınıftan ve aynı paketteki sınıftan erişilebilir.


1.) public

public damgası bir değişkeni, bir metodu ya da bir sınıfı niteleyebilir. 
Nitelediği öğeler herhese açık olur. Başka pakette olsa bile, program içindeki, her kod onlara erişebilir. 
public damgalı bir sınıfın değişkenlerine ve metotlarına kendi alt-sınıfları ve dışarıdaki başka sınıflar kısıtsız erişebilir.
public damgalı değişkenler ve metotlar için de kısıtsız erişim vardır. 
Uygulama programlarında main() metodunun public damgalı olmasının nedeni budur.

  Örnekler:

a. public sınıf bildirimi

public class class_adı {

            Class gövdesi

}

b. public değişken bildirimi

public long  r ;

c. public metot bildirimi

public  double toplam(int m, double  d){

return m + d ;

}



2.) private

Bazı değişken, metot ya da sınıflara başka sınıftaki kodların erişmesini engellemek isteyebiliriz. Bunun için private nitelemesini kullanırız. private erişim belirtkesi, public belirtkesinin karşıtı gibidir. private   damgalı öğelere yalnız aynı sınıftaki kodlar erişebilir, başka sınıftaki kodlar erişemez. Kendi alt-sınıfları bile erişemez. Bir alt-sınıf, atasının public ve ön-tanımlı öğelerine erişebilir, ama private öğelerine erişemez. Onlara erişebilmesi için, super class interface-fonksiyonu kullanılır. Bunun nasıl olduğunu ileride göreceğiz. Sözdizimi şöyledir:

a. private sınıf bildirimi

private class class_adı {

            Class gövdesi

}

b.) private değişken bildirimi

private long  r ;

c. private metot bildirimi

private  double toplam(int m, double  d){

return m + d ;

}



3.) protected

Bir sınıf içindeki değişken ve metotlara alt-sınıfların erişebilmesini, ama paket içindeki ya da program içindeki başka kodların erişmesini engellemek isteyebiliriz. Bunun için sözkonusu öğeyi, protected damgası ile nitelemek yetecektir. Bu demektir ki, alt-sınıf, üst-sınıfın protected damgalı öğelerine sanki public öğelermiş gibi erişir. Görüldüğü gibi, protected belirtkesi, ön-tanımlı belirtke ile private belirtkesinin işlevleri arasında bir işleve sahiptir. Alt sınıflara erişme yetkisi verdiği için, kalıtım (inheritance) olgusunda önemli rol oynar.  Sözdizimi şöyledir:

a. protected  sınıf bildirimi

protected class class_adı {

            Class gövdesi

}

b. protected değişken bildirimi

protected long  r ;

c. protected metot bildirimi

protected  double toplam(int m, double  d){

return m + d ;

}



4.)Ön-tanımlı (default ) belirtke

Bir öğenin önüne hiçbir erişim belirtkesinin konmadığı durumdur. Erişim belirtkesi konmamışsa ön-tanımlı (default) belirtke etkin olur. Buna, bazı kaynaklarda dostça erişim (frendly access) denir.

a. paket  bildirimi

Paketler yalnızca ön-tanımlı erişime sahiptir, başka erişim belirtkesi almazlar. Paket içindeki her sınıf pakette olan her değişken ve metoda erişebilir. Ama başka paketlerdeki sınıflar erişemez.

   package paket_adı {

            Paket gövdesi  }

b. erişim belirtkesiz (default) sınıf  bildirimi

Sınıf bidiriminde, sınıfın önüne hiçbir erişim belirtkesi konmazsa, o sınıf içindeki değişken ve metotlara o sınıfı içeren paketteki bütün kodlar erişebilir. Kuruluş yapısı şöyledir:

class class_adı {

    Class gövdesi

}

 

c. erişim belirtkesiz (default) metot  bildirimi

Metot bildiriminde hiçbir erişim belirtkesi konulmazsa, default belirke geçerlidir. Bu halde, class’ın kendisi, alt-sınıflar ve aynı paket içindeki diğer sınıflar erişebilir. Örnek:

int topla (int m, int n) {

   return m+n ;

}





