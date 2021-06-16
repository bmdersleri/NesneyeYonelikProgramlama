using System;

namespace Degiskenler
{
    class Program
    {
        static void Main(string[] args)
        {

            string[] dersler1 = new string[] { "Matematik, Turkce,Fenbilimleri" };
            string[] dersler2 = new string[] { "Beden egitmi, muzik, resim" };


            dersler1 = dersler2;

            dersler2[0] = "YabanciDil";
            Console.WriteLine(dersler1[0]);

        }
    }
}







