using System;

namespace uygulamaornegi8
{
    class Program
    {
        static void Main(string[] args)
        {
            char ch;
            Console.WriteLine("Bir harf girin.");
            ch = Convert.ToChar(Console.ReadLine());

            switch (Char.ToLower(ch))
            {
                case 'a':
                    Console.WriteLine("Sesli harf.");
                    break;
                case 'e':
                    Console.WriteLine("Sesli harf.");
                    break;
                case 'i':
                    Console.WriteLine("Sesli harf.");
                    break;
                case 'o':
                    Console.WriteLine("Sesli harf.");
                    break;
                case 'u':
                    Console.WriteLine("Sesli harf.");
                    break;
                default:
                    Console.WriteLine("Sessiz harf.");
                    break;
            }
            Console.ReadKey();
        }
    }
}
