# Konu Adı
C#’ da Metin Dosyası İşlemleri

Youtube Kanalımız: BMDersleri

Bağlantı: https://www.youtube.com/channel/UCIdYgV-XFjv9q0IHtzUTtQw

Konu ile ilgili Youtube Video Linki : https://www.youtube.com/watch?v=MDFxqKrp3ck

Kısa Bağlantı: https://bit.ly/32k9MnJ

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Aykut ÖKSÜZ

Metin dosyası nedir?
Metin dosyası, yalnızca metni olan, görüntülerin ve diğer metin dışı karakterlerin bulunmadığı dosyalardır. Bunlar bazen .TXT, .DOCX dosya biçiminde olabilir.
Bazı metin dosyaları .TXT dosya uzantısını kullanır ve hiçbir resim içermez, bazı metin dosyaları ise hem resim, hem de metin içerebilir.

Dosya İşlemleri 
Dosya işlemleri, bir dosyadan okumak ve bir dosyaya yazmak şeklinde ayrılır. Bu işlemler haricinde dosyalarla alakalı olan birkaç sınıf da mevcuttur. 
Directory ve File sınıfları System.IO'da bulunur.  "using System.IO;" yazarak bu sınıflara erişim sağlayabiliriz. Directory sınıfı klasörler üzerinde işlem yaparken File sınıfı dosyalar üzerinde işlem yapar. 

DirectoryInfo ve FileInfo Sınıfları
Directory ve File sınıfları klasör ve dosyalar üzerinde işlemler yaparken sadece dosya yolunu kullanırlar. DirectoryInfo ve FileInfo sınıfları, dosya yolunun haricinde dosya adı, uzantısı, boyutu, oluşturulma zamanı gibi bilgileri size gösterebilir.
.CreationTime, .Delete, .FullName, .Name, .Parent gibi metotlarla oluşum zamanı bilgisine erişim, klasör silme, klasörün yolunu öğrenme, klasörün adı ve üst klasör bilgisi edinme gibi işlemler gerçekleştirebiliriz.

Dosyaya Yazma İşlemi
Dosyadan veri okuma ve yazma işlemlerimizi yerine getiren 2 sınıf vardır. Veri okuma işlemleri için, StreamReader; veri yazma işlemleri için, StreamWriter classlarını kullanırız. Metin bazlı okuma yazma işlemler için bu sınıfları kullanırken, binary okuma-yazma işlemlerinde BinaryWriter ve BinaryReader sınıflarını kullanırız.

Dosyaya Yazma İşlemi Metotları
File.WriteAllText
File.WriteAllLines
File.WriteAllBytes
Sw.WriteLine
Fs.Write
Zaman Uyumsuz Dosya Erişimi

Dosyadan Okuma İşlemi
Okuma işlemi için StreamReader sınıfını kullanıyoruz. İlk satırda StreamReader objemizi oluşturup, oluştururken okumak istediğimiz dosyanın konumunu ekleyebilir, daha sonra ReadLine veya ReadToEnd metotları ile dosya satırlarını okuma gerçekleştirebiliriz. 

Dosyadan Okuma İşlemi Metotları
File.ReadLines
File.ReadAllLines
File.ReadAllText
Sr.ReadToEnd
Sr.ReadLine






