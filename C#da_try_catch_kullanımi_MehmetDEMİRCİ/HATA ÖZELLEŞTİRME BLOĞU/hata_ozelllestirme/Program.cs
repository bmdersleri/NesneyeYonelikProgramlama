using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hata_ozelllestirme
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayi1, sayi2, bolme1;
            try
            {
                Console.WriteLine("1.sayi=");
                sayi1 = int.Parse(Console.ReadLine());
                Console.WriteLine("2.sayi=");
                sayi2 = int.Parse(Console.ReadLine());

                bolme1 = sayi1 / sayi2;

                Console.WriteLine("bölme sonucu={0}", bolme1);

            }

            catch (Exception hata)  when (hata.Message == "giriş dizesi doğru biçimde değildi.")
            {
                Console.WriteLine("hatayı yakaladık");
            }

            Console.ReadKey();
        }
    }
}
