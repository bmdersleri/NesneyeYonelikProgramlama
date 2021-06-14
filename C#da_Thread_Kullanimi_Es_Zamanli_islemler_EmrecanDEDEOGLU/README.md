# Konu Adı
C#da Thread ve Eş Zamanlı İşlemler

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/xTzf5vy0x3M

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Emrecan DEDEOĞLU


Thread hakkında
Threadleri kullanmamızdaki asıl amaç birden fazla işlemi eş zamanlı olarak çalıştırmaktır. 
Eğer threadleri kullanmazsak programdaki her işlemin çalışması için bir önceki işlemin bitmesi beklenmek zorunda olur. Ve her şey tek düze ilerleyip bağımsız işlemler yapamayız. 
Bu slaytta ise threadlerin ve thread metotlarının C# üzerinde kullanımından bahsedeceğim. 
Bilgisayarda threadlerin gerçekleşmesi ise işlemci sayısı ile bağlantılıdır. Eğer ki bilgisayarda bir adet işlemci var ise işlemci threadler arasında hızlı hızlı geçiş yaparak eş zamanlı gibi çalışmasını sağlar. Fakat bilgisayarda birden fazla işlemci var ise threadler işlemcilere dağıtılır ve yine eş zamanlı çalıştırmış olur. Fakat bu bilgiler bizim threadleri nasıl kullanacağımızı etkilemiyor.

Thread nasıl tanımlanır 
Threadleri kullanmadan önce kütüphane olarak using "System.Threading;" şeklinde eklenmelidir.
Kütüphaneyi eklediğimize göre artık threadleri kullanmaya başlayabiliriz. Thread tanımlamak için öncelikle threadin çalıştırmasını istediğimiz kod gruplarını metod altında toplamalıyız. 
Threadi tanımlarken "Thread threadAdı = new Thread(metod);" şeklinde yazabiliriz.
Thread adını istediğimiz gibi değiştirebiliriz. Fakat metod yerine geri değer döndürmeyen metod yazılmak zorundadır.
Threadi de tanımladığımıza göre artık threadleri kullanmaya başlayabiliriz.

Start metodu
İlk bahsedeceğim metod start metodu. Start metodu adından da anlaşılacağı üzere threadi başlatmamızı sağlıyor. Kullanımı ise "threadAdı.Start();" şeklindedir.
Daha önce oluşturduğumuz threadi bu şekilde başlatmış olduk. Bu şekilde thread bitene kadar ya da biz başka bir emir verene kadar çalışacak.

Sleep metodu
Sleep metodu kodun belirlediğimiz süre boyunca beklemesini sağlar.
Fakat sleepten bir önceki satırda bir thread başlatırsak sleep onu etkilemez çünkü thread başladığında main metodundaki diğer kodlardan etkilenmez onlardan ayrı bir şekilde çalışmaya devam eder. Zaten threadlerin bize sağladığı en büyük avantajlardan biri de budur.
Ayrıca sleep metodunu kullanmak için bir thread tanımlanmış olması gerekmiyor. Direkt olarak "Thread.Sleep(100);" şeklinde 100 ms kadar kodun durmasını sağlar.

Abort metodu
Abort devam etmekte olan bir threadi sonlandırmaya yarar. Bu sonlandırmanın geri dönüşü yoktur. Bir kez sonlandırılan metod devam ettirilemez. "threadAdı.Abort();" şeklinde kullanımı vardır.

Join metodu
İki threadi çalıştırırken birincinin bitip ardından ikincinin başlamasını istiyorsak join metodunu kullanabiliriz.
Kullanırken "ilkThread.Join();" şeklinde kullanılıp birinci threadin bitmesinin ardından diğer threadlerin çalışmasına izin vermektedir.

Suspend ve Resume metotları  
Suspend metodu başlatılmış ya da halihazırda devam etmekte olan threadler için threadi durdurmak için kullanılır. Fakat bu durdurma threadi yok etmez.
Durdurulmuş threadleri resume metodu ile devam ettirebiliriz.
"threadAdı.Suspend();" ile durdurabilir, "threadAdı.Resume();" ile de devam ettirebiliriz.

Name ve CurrentThread metotları  
Name metodu basit olup kullanımı bol olabilecek bir metod. Yaptığı ise threadlere isim vermek. Fakat threade isim vermezsek name null olarak okunur. Ayrıca name bir kez belirlendiğinde daha sonra değiştirilemez. Atanırken "threadAdı.Name = "konulucakAd";" şeklindedir. okuma yaparken de "thread1.Name" şeklindedir.
CurrentThread metodu o an çalışan threadin bütün özelliklerine erişebilmemizi sağlar. "CurrentThread." dan sonra erişmek istediğimiz özelliği yazarak etkileşime geçebiliriz.

IsAlive ve ThreadState metotları 
IsAlive metodu oluşturduğumuz threadin çalışmakta olup olmadığı bize true false olarak geri döndürerek belirtir. Fakat suspend metodu ile durdurduğumuz threadleri bize true olarak geri döndürür.
IsAlivea benzeyen ThreadState metodu ise bize daha belirgin bir şekilde gösterir. Bir sonraki slayta örneğini yaptım fakat ThreadState’in geri döndürdüğü değerlerden bahsetmek gerekirse bunlar;
Thread henüz başlatılmamışsa Unstarted,
Başlamış ve çalışıyorsa Running,
Suspend,  sleep, join gibi metodlar tarafından durdurulmuşsa WaitSleepJoin,
Bitmiş ya da bitirilmiş ise Stopped şeklinde çıktılar verir.

IsBackground metodu 
IsBackground metodu tüm threadlerde varsayılan false olur.
IsBackground false olan bir thread başlatıldığında thread işlemini bitirmeden program sonlanmaz. Yani main metodunda yazdığımız kodlar bitse bile programın bitmesi ya da kapanması için threadin de tamamlanması gerekir.
Eğer ki IsBackground true olursa main metodundaki işlemler bittiği anda threadin tamamlanıp tamamlanmadığına bakmaksızın program kapanır.
IsBackground değiştirilirken "threadAdı.IsBackground = true/false;" şeklindedir.

Priority metodu
Priority metodu threadler arasındaki önceliği belirlememizi sağlar. Yani önceliği yüksek olan thread daha önce tamamlanmaya çalışılır. "threadAdı.Priority = ThreadPriority." yazıp çıkan seçeneklerden istenilen seçilerek belirlenir.

ManagedThreadId metodu
ManagedThreadId threadlerde bulunan ve değiştirilemeyip sadece okunabilen eşsiz sayılardır.
Bu metod sayesinde threaderi birbirinden ayırt edebiliriz. 

Lock metodu 
Başlattığımız thread bitmeden başka işlemlerin yapılmasını engellemek için lock metodunu kullanırız. 
Lock başlatmaya çalıştığımız işlemleri yok saymaz onları sıraya sokar. Yani başlatılan ilk işlemin bitmesini bekler o bittiğinde başlar.
Fakat eğer ki ilk işlemi threadle ve lockla yaparsak ve ardından başlatacağımız işlem lock içermez ise ikinci işlem direkt başlar. Yani birbirleri ile bağlantılı ya da bağlı işlemlerimiz var ise hepsine lock eklememiz gerekir ki sorunlar oluşmasın. 
Kullanımı karmaşıktır videodan ya da kaynak koddan incelenmesi önerilir.







