using System;
using System.IO;
using System.Net;
using System.Net.Sockets;
using System.Text;

class MyTcpListener
{
    public static void Main()
    {
        TcpListener sunucu = null;
        try
        {
            Console.Write("Sunucunun IP Adresi: ");
            string ipadresi = Console.ReadLine();
            Console.Write("Sunucunun Portu: ");
            int port = Convert.ToInt32(Console.ReadLine());
            IPAddress SunucuIPAdresi = IPAddress.Parse(ipadresi);

            sunucu = new TcpListener(SunucuIPAdresi, port);

            // Bağlantı taleplerini dinlemeye başla
            sunucu.Start();

            // Veri okumak için tamponlama
            Byte[] bytelar = new Byte[256];
            String veri = null;

            // Sonsuz sunucu döngüsü
            while (true)
            {
                Console.Write("Bağlantı için bekleniyor... ");

                // sunucu.AcceptSocket() metodu da kullanılabilirdi burada:
                TcpClient alıcı = sunucu.AcceptTcpClient();
                Console.WriteLine("Bağlandı!");

                veri = null;

                // Okuma ve yazma için bir akıntı(stream) nesnesi türet
                NetworkStream akıntı = alıcı.GetStream();

                int i;

                // Client tarafından gönderilen verileri okuyan bir döngü.
                while ((i = akıntı.Read(bytelar, 0, bytelar.Length)) != 0)
                {
                    // Byte'ları UTF8 string'e çevir
                    veri = System.Text.Encoding.UTF8.GetString(bytelar, 0, i);
                    Console.WriteLine("Gelen mesaj: {0}", veri);

                    Console.Write("Sunucu: ");
                    string girdi = Console.ReadLine();
                    byte[] mesaj = System.Text.Encoding.UTF8.GetBytes(girdi);

                    // Mesajı karşı tarafa ilet
                    akıntı.Write(mesaj, 0, mesaj.Length);
                    Console.WriteLine("Gönderildi: {0}", girdi);
                }
                alıcı.Close();
            }
        }
        catch (SocketException e)
        {
            Console.WriteLine("Soket Hatası: {0}", e);
        }
        finally
        {
            sunucu.Stop();
        }

        Console.WriteLine("\nKapatmak için enter'a bas");
        Console.Read();
    }
}