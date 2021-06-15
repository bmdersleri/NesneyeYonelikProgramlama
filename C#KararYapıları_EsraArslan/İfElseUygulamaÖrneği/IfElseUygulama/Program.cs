using System;

namespace IfElseUygulama
{
    class Program
    {
        static void Main(string[] args)
        {

         Console.Write("Bir sayı giriniz:");
         int sayi = Convert.ToInt32(Console.ReadLine());
        if (sayi % 2 == 0)
            Console.WriteLine("Girdiğiniz sayı çifttir.");
        else
            Console.WriteLine("Girdiğiniz sayı tektir.");

            Console.ReadKey();
        }
    }
}
