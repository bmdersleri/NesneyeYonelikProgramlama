using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sunu_17
{
    class Program
    {
        static void Main(string[] args)
        {
            //System.Array sınıfından Clear metodu kullanımı

            int[] sayilar = { 1, 2, 3, 4, 5 };

            Console.WriteLine("İlk Durum:");
            for (int i=0; i<sayilar.Length; i++)

            {
                Console.WriteLine(sayilar[i]);
            }

            Array.Clear(sayilar, 2, 2);

            Console.WriteLine("Son Durum:");
            for (int i = 0; i < sayilar.Length; i++)
            {

                Console.WriteLine(sayilar[i]);

            }

            Console.ReadKey();
        }

    }
}
