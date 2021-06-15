using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sunu_18
{
    class Program
    {
        static void Main(string[] args)
        {
            //System.Array sınıfından Resize metodunun kullanımı

            string[] gunler = { "pazartesi", "salı", "çarşamba", "perşembe", "cuma" };

            string gun6, gun7;

            Console.Write("Haftanın 6. gününü giriniz= ");
            gun6 = Console.ReadLine();

            Console.Write("Haftanın 7. gününü giriniz= ");
            gun7 = Console.ReadLine();

            Array.Resize(ref gunler, 7);
            gunler[5] = gun6;
            gunler[6] = gun7;

            Console.WriteLine("*************");

            for (int i = 0; i < gunler.Length; i++)
            {

                Console.WriteLine(gunler[i]);

            }
            Console.ReadKey();
        }
    }
}
