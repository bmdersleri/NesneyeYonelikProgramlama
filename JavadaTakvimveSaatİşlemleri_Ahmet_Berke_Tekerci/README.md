# Java'da Tarih ve Saat İşlemleri

Java'da Tarih ve Saat İşlemleri Örnek Kodları

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://youtu.be/83uPEfNxiMg

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Ahmet Berke TEKERCİ

# Kodların İçeriği

1.) Tarih
Tarih oluşturma işlemini Calendarve Date kullanarak inceleme, işlemler yapma, format belirleme.

2.) Takvim Örneği
Gregorian takvim kullanarak takvimin gün, ay, yıl gibi değerlerini alma fakat alırken yapılabilecek hatalardan bir örnek.

3.) Java Time
Bizleri eski takvim işlemlerinden kurtaran geliştirilmiş tarih zaman api'sinin sağladığı kolaylıklar ile yapılan işlemler, format belirleme vs.

4.) Yerel Tarih Zaman
Tarih ve saati kullanırken dikkat edilmesi gereken önemli bir detay bölgesel zaman dilimidir. Eğer bir zamanı alırken bölge belirtmez isek istenmeyen sonuçlar elde edebiliriz.

# Java’da güncel tarih ve zamanı alabileceğimiz sınıflar.
    java.util.Calendar
    java.util.Date
    java.sql.Date
    java.time.LocalDate
    java.time.LocalTime
    java.time.LocalDateTime
    java.time.Clock
    java.time.format.DateTimeFormatter
    java.text.SimpleDateFormat

# Bir Calendar objesi oluşturduğumuzda kullanabileceğimiz metotlar;
    add(int field, int amount) : Takvimin kurallarına göre, belirtilen takvim alanına belirtilen süreyi ekler veya çıkarır.
    clear(int field) : Verilen takvim alanı değerini ve bu tanımlanmamış öğenin zaman değerini (milisaniye uzaklığı ) ayarlar.
    clone() :Bu nesnenin bir kopyasını oluşturur ve döndürür.
    compareTo(Calendar anotherCalendar) : Zaman değerleri (milisaniye cinsinden uzaklıklar karşılaştırır) 
    complete() : Takvim alanlarındaki ayarlanmamış alanları doldurur.
    get(int field) : Verilen takvim alanının değerini döndürür.
    getFirstDayOfWeek() : Haftanın ilk gününü alır; örneğin SUNDAY ABD'de, MONDAY Fransa'da.
    getInstance() : Varsayılan saat dilimini ve yerel ayarı kullanarak bir takvim alır.
    getTime() : Milisaniye cinsinden zaman değerini döndürür.
    getTimeZone() : Saat dilimini alır.
    getWeeksInWeekYear() : Temsil edilen hafta, yıl içindeki hafta sayısını döndürür.
    getWeekYear() : Bununla temsil edilen hafta yılını döndürür.
    set(int field, int value) : Verilen takvim alanını gönderilen değere ayarlar.
    setTime(Date date) : Takvimin saatini gönderilen değerle ayarlar.
    toString() : Bu takvimin dize gösterimini döndür.

# Java Time Sınıfları
    Clock : Bir saat dilimi kullanarak mevcut an, tarih ve saate erişim sağlar.
    Duraction : ‘ 34, 5 saniye ’ gibi zamana dayalı bir süre.
    Instant	: Zaman çizgisinde anlık bir nokta.
    LocalDate : ISO-8601 takvim sisteminde saat dilimi olmayan bir tarih, örneğin 2007-12-03.
    LocalDateTime : ISO-8601 takvim sisteminde saat dilimi olmayan bir tarih-saat, örneğin 2007-12-03T10:15:30.
    LocaleDateTime : ISO-8601 takvim sisteminde saat dilimi olmayan bir saat, örneğin 10:15:30.
    ZoneId	: Europe/Paris Gibi bir saat dilimi kimliği.
    ZoneOffset : Greenwich / UTC'den bir saat dilimi uzaklığı, örneğin ‘ +02:00 ’.
    MonthDay : ISO-8601 takvim sisteminde bir ay-gün gibi 12-03.
    OffsetDateTime :ISO-8601 takvim sisteminde UTC / Greenwich'ten fark olan bir tarih-saat, örneğin 2007-12-03T10:15:30+01:00.
    OffsetTime : ISO-8601 takvim sisteminde UTC / Greenwich'ten fark olan bir saat, örneğin 10:15:30+01:00.
    Period : ISO-8601 takvim sisteminde '2 yıl, 3 ay ve 4 gün' gibi tarihe dayalı bir süre.
    Year : ISO-8601 takvim sisteminde bir yıl gibi 2007.
    YearMonth : ISO-8601 takvim sisteminde bir yıl-ay gibi 2007-12.
    ZonedDateTime : ISO-8601 takvim sisteminde saat dilimine sahip bir tarih-saat, örneğin 2007-12-03T10:15:30+01:00 Europe/Paris.

Not : ISO 8601, tarih ve saatle ilgili verilerin değişimini kapsayan ISO standardı. 1988'de Uluslararası Standardizasyon Örgütü tarafından yayınlandı. Bu standardın amacı tarihlerin ve sayısalların temsilini yanlış yorumlamaktan kaçınmak için açık ve iyi tanımlanmış bir yöntem sağlamaktır.
# Format Belirleme SimpleDateFormat
    Harf Tarih veya Saat Bileşeni	Sunum	Örnekler
    G	dönem göstergesi	Metin	AD
    y	Yıl	Yıl	1996; 96
    Y	Hafta yılı	Yıl	2009; 09
    M	Yıl içinde ay (bağlama duyarlı)	Ay	July; Jul;07
    L	Yıl içinde ay (bağımsız form)	Ay	July; Jul;07
    w	yıl içinde hafta	Numara	27
    W	ay içinde hafta	Numara	2
    D	Yıl içinde gün	Numara	189
    d	ay içinde gün	Numara	10
    F	Ay içinde haftanın günü	Numara	2
    E	Haftada gün adı	Metin	Tuesday; Tue
    u	Haftanın gün sayısı (1 = Pazartesi, ..., 7 = Pazar)	Numara	1
    a	am/pm işaretçisi	Metin	PM
    H	Gün içinde saat (0-23)	Numara	0
    k	Günde saat (1-24)	Numara	24
    K	am/pm cinsinden saat (0-11)	Numara	0
    h	am/pm cinsinden saat (1-12)	Numara	12
    m	saat cinsinden dakika	Numara	30
    s	Dakikada ikinci	Numara	55
    S	Milisaniye	Numara	978
    z	Saat dilimi	Genel saat dilimi	Pacific Standard Time; PST;GMT-08:00
    Z	Saat dilimi	RFC 822 saat dilimi	-0800
    X	Saat dilimi	ISO 8601 saat dilimi	-08; -0800; -08:00
