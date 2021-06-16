# MAVEN KULLANIMI

Java'da Tarih ve Saat İşlemleri Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=AlwpLJeXWZA

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Baran KELEŞ

# Ne yaptım ?

Eclipse uygulaması üzerinden küçük bir MavenTest projesi örneği verildi.

# Maven nedir ?

Proje yönetim aracıdır.Proje geliştirirken proje içerisinde bir standart oluşturmamızı, geliştirme sürecini basitleştirmemizi, dokümantasyonumuzu etkili bir şekilde oluşturmamızı, projemizdeki kütüphane bağımlılığını ve IDE bağımlılığını ortadan kaldırmamızı sağlayan bir araçtır.

# Mavenin amaçları

- Projenin geliştirme adımlarını kolaylaştırmak
- Standartlaştırma
- Projenin niteliklerini bilgi olarak sağlamak
- Tekrar kullanılabilirlik
- Kararlılık
- Bağımlılık yönetimi
- Ölçeklenebilirlik

# POM Nedir ?

Proje Nesnesi Modeli (Project Object Model) veya POM, Maven’deki temel iş birimidir. Proje kurmak için Maven tarafından kullanılan proje ve yapılandırma detayları hakkında bilgi içeren bir XML dosyasıdır.

POM, Maven 1’deki project.xml’den Maven 2’de pom.xml’ye dönüştürüldü. Bir görevi veya hedefi yürütürken; Maven, geçerli dizinde POM’u arar. POM’u okur, gerekli yapılandırma bilgisini alır, sonra hedefi yürütür.

POM’de belirtilebilecek bazı yapılandırmalar proje bağımlılıkları, çalıştırılabilecek eklentiler veya hedefler, yapı profilleri, proje sürümü, açıklama, geliştiriciler, posta listeleri ve benzerleri gibi diğer bilgiler de belirtilebilir.

# Maven’in faydaları nelerdir ?

Maven, proje kalıpları(pom.xml) sayesinde IDE bağımlılığı olmadığından dolayı kurulumda esneklik sağlar. Yeni bir proje oluşturacağınızda Maven proje kalıplarını kullanabilirsiniz, bu kalıplar birer standart haline geldiği için tüm IDE ‘lerde desteklenmektedir.

Projede kullanılacak tüm kütüphaneler ve eklentiler POM(Project Object Model) dosyasından kolayca yönetilebilmektedir. Maven, kütüphane dosyalarını kendi repository sunucularında barındırır. Projede kullanmak istediğiniz kütüphane dosyalarını ilk olarak sizin local repository klasörünüzde arar, eğer bulamazsa kendi sunucularında arama yapar, eğer kendi sunularında da bulamazsa sizin tanımlayacağınız bir sunucu adresinden dosyayı sizin local klasörünüze indirir ve projeniz içerisinde kullanabilmenizi sağlar. Ayrıca bir kütüphane başka kütüphanelere bağımlıysa bu bağımlı olduğu kütüphaneleri de indirir ve projenize ekler.

Projenizin build ya da deploy yapılandırmalarını POM dosyasından yönetebilirsiniz. Büyük çaplı bir projenin, farklı sunucu sistemlerinde ya da farklı veri tabanlarında eş zamanlı olarak çalışması gerekebilir. Bunun için her güncelleme sırasında farklı yapılandırma ayarlarıyla bu sistemleri güncellememiz gerekir. Her sistem için yapılandırma dosyalarını baştan düzenlemek oldukça yorucu bir iş. Ancak POM dosyasında tanımlanacak yapılandırma ayarları işimizi görecektir. Sadece yapılandırma adını değiştirerek proje çıktısını farklı sistemlere uygun hale getirebilirsiniz.

Sürüm yönetimi, her Maven projesinin bir grup id ‘si, bir yapı id ‘si ve bir de sürüm numarası vardır. Projenin farklı sürümlerini saklayabilir ve bunları daha sonra yeni projelerde kullanabiliriz.

# Ant ile arasındaki farklar nelerdir ?

Ant da ortak bir proje dizini yapısı gibi resmi kurallara sahip değilsiniz, kaynağı nerede bulacağınızı ve çıktıyı nereye koyacağınızı tam olarak söylemek zorundasınız.

Ant, prosedüreldir. Tam olarak ne yapacağını ve ne zaman yapacağını söylemelisiniz. Derlemeyi, sonra kopyalamayı, sonra sıkıştırmayı … Maven ise deklaratifdir. Tek yapmanız gereken bir pom.xml dosyası oluşturmak ve kaynağınızı varsayılan dizine koymaktır.

Ant da bir yaşam döngüsü yoktur, hedefleri ve hedef bağımlılıklarını tanımlamanız gerekiyor. Her bir hedefe manuel olarak bir dizi görev eklemeniz gerekiyor. Maven ise derleme ve JAR oluşturma gibi şeyleri yapan bir dizi varsayılan hedefleri yapan yaşam döngüleri mevcuttur.


# KULLANILAN IDE : ECLİPSE
