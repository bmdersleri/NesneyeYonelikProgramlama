using System;

namespace uygulamaornegi5
{
    class Program
    {
        static void Main(string[] args)
        {
            int x, secim;
            double kare, kok, kup;
            Console.Write("Bir sayı giriniz=");
            x = int.Parse(Console.ReadLine());
            Console.Write("1-Kare 2-Küp 3-Kök\n");
            Console.WriteLine();
            Console.Write("Seçiminiz= ");
            secim = int.Parse(Console.ReadLine());
            if (secim == 1)
            {
                kare = x * x;
                Console.Write("Girdiğiniz sayının karesi= {0}", kare);
            }
            else if (secim == 2)
            {
                kup = x * x * x;
                Console.Write("Girdiğiniz sayının kübü= {0}", kup);
            }
            else if (secim == 3)
            {
                kok = Math.Sqrt(x);
                Console.Write("Girdiğiniz sayının kökü= {0}", kok);
            }
            Console.ReadKey();
        }
    }
}
