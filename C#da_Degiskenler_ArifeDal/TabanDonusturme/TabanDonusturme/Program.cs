using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TabanDonusturme
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayi, kalan;
            string Kalan1 = "";
    
            Console.Write("Sayıyı Giriniz..:");
            sayi = Convert.ToInt32(Console.ReadLine());
            while (sayi != 0)
            {
                kalan = sayi % 2;
                sayi = sayi / 2;

                Kalan1 = kalan.ToString() + Kalan1;
                
            }
            Console.WriteLine("2'lik Sistemde Karşılığı : {0}", Kalan1);
            Console.ReadKey();
        }
    }
}
