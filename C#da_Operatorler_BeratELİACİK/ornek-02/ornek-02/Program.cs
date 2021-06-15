using System;

namespace ornek_02
{
    class Program
    {
        static void Main(string[] args)
        {
            double boy, kilo, indeks = 0;
            Console.WriteLine("Boyunuzu metre cinsinden girin. Örn 1,65: ");
            boy = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("kilonuzu girin: ");
            kilo = Convert.ToDouble(Console.ReadLine());
            indeks = kilo / (boy * boy);

            Console.WriteLine("vücut kitle endeksiniz: {0}", indeks);

            if (indeks < 18)
            {
                Console.WriteLine("zayıfsınız");

            }
            else if (indeks >= 18 && indeks < 25)
            {
                Console.WriteLine("normalsiniz");

            }

            else if (indeks >= 25 && indeks < 30)
            {
                Console.WriteLine("kilolusunuz");

            }

            else if (indeks >= 30 && indeks < 35)
            {
                Console.WriteLine("obezsiniz.");

            }

            else
            {
                Console.WriteLine("ciddi obezsiniz");

            }
        }
    }
}
