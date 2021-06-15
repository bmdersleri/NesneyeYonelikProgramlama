using System;

namespace ornek_03
{
    class Program
    {
        static void Main(string[] args)
        {
            int tahmin, hak = 5;
            bool durum = false;

            Random rastgele = new Random();
            int rastgeleSayi = rastgele.Next(0, 10);

            for (int kalanHak = hak; kalanHak > 0; kalanHak--)
            {
                Console.WriteLine("hak{0}", kalanHak);
                Console.WriteLine("tahmininiz: ");
                tahmin = int.Parse(Console.ReadLine());

                if (tahmin == rastgeleSayi)
                {
                    Console.WriteLine("Tebrikler doğru bildiniz");
                    durum = true;
                    break;

                }

                else if (rastgeleSayi > tahmin && kalanHak != 1)
                    Console.WriteLine("daha büyük bir sayı girin");
                else if (rastgeleSayi < tahmin && kalanHak != 1)
                    Console.WriteLine("daha küçük bir sayı girin");
            }

            if (!durum)
            {
                Console.WriteLine("tekrar deneyin");
                Console.WriteLine("sayı: {0}", rastgeleSayi);
            }
        }
    }
}
