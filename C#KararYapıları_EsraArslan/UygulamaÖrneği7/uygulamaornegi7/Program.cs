using System;

namespace uygulamaornegi7
{
    class Program
    {
        static void Main(string[] args)
        {
            string takim;
            Console.WriteLine("Hangi Takımı Tutuyorsunuz ?");
            takim = Console.ReadLine();

            switch (takim)
            {
                case "fenerbahce": Console.Write("Alex De Souza!"); break;
                case "galatasaray": Console.Write("Gheorghe Hagi"); break;
                case "beşiktaş": Console.Write("Sergen Yalçın"); break;
                case "trabzon": Console.Write("Hami Mandıralı"); break;
                default: Console.Write("Hatalı Giriş"); break;
            }


            Console.ReadKey();
        }
    }
}
