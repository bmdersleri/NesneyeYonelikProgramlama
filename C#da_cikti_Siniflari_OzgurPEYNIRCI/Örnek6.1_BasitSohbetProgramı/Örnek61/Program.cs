using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Net;
using System.Net.Sockets;
namespace Örnek61
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Sunucunun IP Adresi: ");
            string ipadresi = Console.ReadLine();
            Console.Write("Sunucunun Portu: ");
            int port = Convert.ToInt32(Console.ReadLine());

            TcpClient tcpClient = new TcpClient(ipadresi, port);

            NetworkStream netStream = tcpClient.GetStream();

            if (netStream.CanWrite)
            {
                Console.Write("Siz: ");
                Byte[] gönderilenBytelar = Encoding.UTF8.GetBytes(Console.ReadLine());
                netStream.Write(gönderilenBytelar, 0, gönderilenBytelar.Length);
            }
            else
            {
                Console.WriteLine("Bu akıntıya yazma izniniz yok.");
                tcpClient.Close();

                // tcp Bağlantısını kapatmak akımı kapatmadığından NetworkStream'i de ayrıca kapatmamız lazım:
                netStream.Close();
                return;
            }

            if (netStream.CanRead)
            {
                // NetworkStream'i tampona oku (bufferla)
                byte[] bytes = new byte[tcpClient.ReceiveBufferSize];
              
                // Bu metodla en az 1 byte veri okunana kadar program burada kalacaktır:
                netStream.Read(bytes, 0, (int)tcpClient.ReceiveBufferSize);

                // Rgelen veriyi byte[] 'tan stringe dönüştür
                string gelenveri = Encoding.UTF8.GetString(bytes);
            
                Console.WriteLine("Sunucu: " + gelenveri);
            }
            else
            {
                Console.WriteLine("Bu akıntıdan okuma izniniz yok.");
                tcpClient.Close();

                // tcp Bağlantısını kapatmak akımı kapatmadığından NetworkStream'i de ayrıca kapatmamız lazım:
                netStream.Close();
                return;
            }
            netStream.Close();
            Console.ReadKey();
        }
        
    }
}
