dusing System;

namespace UygulamaOrnegi2
{
    class Program
    {
        static void Main(string[] args)
        {

            double urun1, urun2, ilktoplam, odemetutari, indirim;
            Console.Write("Birinci ürünün fiyatını girin:");
            urun1 = Convert.ToDouble(Console.ReadLine());
            Console.Write("İkinci ürünün fiyatını girin:");
            urun2 = Convert.ToDouble(Console.ReadLine());
            ilktoplam = urun1 + urun2;
            odemetutari = ilktoplam;
            if (ilktoplam >= 200)
            {
                indirim = urun2 * 25 / 100;
                odemetutari = ilktoplam - indirim;
            }
            Console.WriteLine("Ödeme tutarı:" + odemetutari);

            Console.ReadKey();
        }
    }
}
