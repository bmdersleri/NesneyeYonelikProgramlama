using System;

namespace mantiksaloperatorler
{
    class Program
    {
        static void Main(string[] args)
        {

            //mantıksal operatörler


            bool sonuc;
            int ilkSayi = 10;
            int ikinciSayi = 20;

            sonuc = (ilkSayi == ikinciSayi) || (ilkSayi > 5);
            Console.WriteLine(sonuc);

            sonuc = (ilkSayi == ikinciSayi) && (ilkSayi > 5);
            Console.WriteLine(sonuc);

            sonuc = !(ilkSayi < ikinciSayi);
            Console.WriteLine(sonuc);
        }
    }
}
