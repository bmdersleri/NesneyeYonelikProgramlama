using System;

namespace ornek_01
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayi1, sayi2, sayi3;
            Console.WriteLine("Bir sayı girin: ");
            sayi1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Bir sayı girin: ");
            sayi2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Bir sayı girin: ");
            sayi3 = Convert.ToInt32(Console.ReadLine());

            if (sayi1 > sayi2 && sayi1 > 3)
            {
                Console.WriteLine("En büyük sayı: {0}", sayi1);

            }
            else if (sayi2 > sayi3)
            {
                Console.WriteLine("en büyük sayı: {0}", sayi2);

            }
            else
            {
                Console.WriteLine("en büyük sayı: {0}", sayi3);

            }
        }
    }
}
