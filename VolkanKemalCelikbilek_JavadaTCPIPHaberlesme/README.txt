TCP/IP Nedir?, TCP/IP Katmanları, TCP/IP Haberleşmesi, Port Nedir?, Socket ve ServerSocket ve Örnek Uygulama.

TCP/IP Haberleşmesi = TCP bağlantılı(CONNECTION ORIENTED) çalışan bir sistemdir. Genel olarak bağlanan programa Client , bağlanılan programa Server denilir.

Server program dinleyen	(listener) programdır. Client ise hizmet almak için önce bağlanacak olan processdir. Server program gelecek clientlara(alıcılara) ilişkin dinlemede bekler. Client(Alıcı) programın serverdan hizmet alması için el sıkışması (hand shaking) gerekir. El sıkışma kullanılacak Ip'de protokolde ve port numarasında anlaşmadır. Yani client programın server programın Ipsini bilerek ve port numarasıyla ona erişmesi gerekir.

TCP haberleşmesi soketlerle yapılır. Soketler TCP haberleşmesi yapmaya olanak sağlayan genel olarak sınıflar şeklinde implemente edilen sınıflardır. 

Youtube Kanalımız: BMDersleri

Konu ile ilgili Youtube Video Linki : 

Github Adresimiz: https://github.com/bmdersleri

Hazırlayan: Volkan Kemal Çelikbilek