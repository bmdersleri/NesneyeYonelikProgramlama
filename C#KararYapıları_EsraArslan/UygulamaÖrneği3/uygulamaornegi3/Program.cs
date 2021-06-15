using System;

namespace uygulamaornegi3
{
    class Program
    {
        static void Main(string[] args)
        {
            double sicaklik;
            Console.WriteLine("Maddenin sıcaklık değerini giriniz.");
            sicaklik = Convert.ToDouble(Console.ReadLine());

            if (sicaklik >= 100)
            {
                Console.WriteLine("Madde {0} derecede gaz haldedir.", sicaklik);
            }
            else if (sicaklik > 0)
            {
                Console.WriteLine("Madde {0} derecede sıvı haldedir.", sicaklik);
            }
            else
            {
                Console.WriteLine("Madde {0} derecede katı haldedir.", sicaklik);
            }
            Console.ReadKey();
        }
    }
}
