using System;

namespace uygulamaOrnegi4
{
    class Program
    {
        static void Main(string[] args)
        {
            int s1, s2, s3;
            double ort;

            Console.WriteLine("1. sınav notunu giriniz.");
            s1 = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("2. sınav notunu giriniz.");
            s2 = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("3. sınav notunu giriniz.");
            s3 = Convert.ToInt16(Console.ReadLine());

            ort = (s1 + s2 + s3) / 3;

            if (ort >= 50)
            {
                Console.WriteLine("Geçti");
            }
            else
            {
                Console.WriteLine("Kaldı");
            }
            Console.ReadKey();
        }
    }
}
