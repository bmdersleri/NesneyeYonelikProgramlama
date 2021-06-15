using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sunu_16
{
    class Program
    {
        static void Main(string[] args)
        {
            //Sort ve Reverse metotları ile Length özelliğinin kullanımı

            int[] sayilar = { 12, 4, 7, 21, 9, 5 };

            Array.Sort(sayilar);

            Array.Reverse(sayilar);

            Console.WriteLine("Büyükten Küçüğe Doğru:");

            for (int i=0; i<sayilar.Length; i++)
            {

                Console.WriteLine(i + 1 + ".sayi= " + sayilar[i]);

            }

            Console.ReadKey();
        }
    }
}
