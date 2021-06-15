using System;

namespace UygulamaOrnegi1
{
    class Program
    {
        static void Main(string[] args)
        {
            double sayi1, sayi2, sonuc = 0;
            Console.Write("Birinci sayıyı girin:");
            sayi1 = Convert.ToDouble(Console.ReadLine());
            Console.Write("İkinci sayıyı girin:");
            sayi2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Toplama için---> t \n Çıkarma için---> ç \n Çarpma için---> x \n Bölme için---> b tuşuna basınız.");
            string islem = Console.ReadLine();
            if (islem == "t")
                sonuc = sayi1 + sayi2;
            else if (islem == "ç")
                sonuc = sayi1 - sayi2;
            else if (islem == "x")
                sonuc = sayi1 * sayi2;
            else if (islem == "b")
                sonuc = sayi1 / sayi2;
            else
                Console.WriteLine("Yanlış bir tuşa bastınız.");
            Console.WriteLine("İşlemin Sonucu:" + sonuc);

            Console.ReadKey();
        }
    }
}
