using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu_8
{
    class Program
    {
        static void Main(string[] args)
        {
            //for döngüsü ile dizi işlemi
            int[] sayilar = new int[3];
            sayilar[0] = 5;
            sayilar[1] = 12;
            sayilar[2] = 36;

            for (int i = 0 ; i< sayilar.Length; i++)
            {
                Console.WriteLine(sayilar[i]);
            }

            Console.ReadLine();

            //foreach döngüsü ile dizi işlemi
            int[] sayilar1 = new int[3];
            sayilar1[0] = 5;
            sayilar1[1] = 12;
            sayilar1[2] = 36;

            foreach (var sayi in sayilar1)
            {
                Console.WriteLine(sayi);
            }

            Console.ReadLine();
        }
    }
}
