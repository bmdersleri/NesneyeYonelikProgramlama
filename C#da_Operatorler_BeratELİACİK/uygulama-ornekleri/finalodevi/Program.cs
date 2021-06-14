using System;

namespace finalodevi
{
    class Program
    {
        static void Main(string[] args)
        {
            //int sayi1, sayi2, sayi3;

            //Console.Write("Bir Sayı Girin :");
            //sayi1 = Convert.ToInt32(Console.ReadLine());
            //Console.Write("Bir Sayı Girin :");
            //sayi2 = Convert.ToInt32(Console.ReadLine());
            //Console.Write("Bir Sayı Girin :");
            //sayi3 = Convert.ToInt32(Console.ReadLine());

            //if (sayi1 > sayi2 && sayi1 > sayi3)
            //{
            //    Console.WriteLine("En büyük sayı :{0}", sayi1);
            //}
            //else if (sayi2 > sayi3)
            //{
            //    Console.WriteLine("En büyük sayı :{0}", sayi2);
            //}
            //else
            //{
            //    Console.WriteLine("En büyük sayı :{0}", sayi3);
            //}

            //Console.ReadLine();







            //double boy, kilo, indeks = 0;
            //Console.Write("Boyunuzu metre cinsinden Giriniz. (Örn:1,65): ");
            //boy = Convert.ToDouble(Console.ReadLine());
            //Console.Write("Kilonuzu Giriniz: ");
            //kilo = Convert.ToDouble(Console.ReadLine());
            //indeks = kilo / (boy * boy);
            //Console.WriteLine("Vücut Kitle İndexiniz: {0}", indeks);
            //if (indeks < 18)
            //{
            //    Console.WriteLine("Zayıfsınız");
            //}
            //else if (indeks >= 18 && indeks < 25)
            //{
            //    Console.WriteLine("Normalsiniz");
            //}
            //else if (indeks >= 25 && indeks < 30)
            //{
            //    Console.WriteLine("Kilolusunuz");
            //}
            //else if (indeks >= 30 && indeks < 35)
            //{
            //    Console.WriteLine("Obezsiniz.");
            //}
            //else
            //{
            //    Console.WriteLine("Ciddi Obezsiniz.");
            //}
            //Console.ReadKey();











            {
                int tahmin, hak = 5;
                bool durum = false;
                Random rastgele = new Random();
                int rastgeleSayi = rastgele.Next(0, 10);
                for (int kalanHak = hak; kalanHak > 0; kalanHak--)
                {
                    Console.WriteLine("Hak {0}", kalanHak);
                    Console.Write("Tahmininiz :");
                    tahmin = int.Parse(Console.ReadLine());
                    if (tahmin == rastgeleSayi)
                    {
                        Console.WriteLine("Tebrikler");
                        durum = true;
                        break;
                    }
                    else if (rastgeleSayi > tahmin && kalanHak != 1)
                        Console.WriteLine("Daha büyük bir sayı girin");
                    else if (rastgeleSayi < tahmin && kalanHak != 1)
                        Console.WriteLine("Daha küçük bir sayı girin");
                }
                if (!durum)
                {
                    Console.WriteLine("Tekrar Deneyin!");
                    Console.WriteLine("Sayı : {0}", rastgeleSayi);
                }
                Console.ReadKey();
            }















        }
    }
}
