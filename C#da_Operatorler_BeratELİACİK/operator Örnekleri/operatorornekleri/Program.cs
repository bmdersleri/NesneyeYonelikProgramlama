using System;

namespace operatorornekleri
{
    class Program
    {
        static void Main(string[] args)
        {

            // aritmetik operatörler


            //int a = 10;
            //int b = 5;

            //Console.WriteLine(a + b);
            //Console.WriteLine(a - b);
            //Console.WriteLine(a * b);
            //Console.WriteLine(a / b);
            //Console.WriteLine(a % b);


            // karşılaştırma operatörleri


            //bool a = 4 < 6;
            //bool b = 6 > 5;
            //bool c = 7 <= 7;
            //bool d = 9 >= 12;
            //bool e = 10 == 12;
            //bool f = 1 != 8;

            //Console.WriteLine(a);
            //Console.WriteLine(b);
            //Console.WriteLine(c);
            //Console.WriteLine(d);
            //Console.WriteLine(e);
            //Console.WriteLine(f);



            //mantıksal operatörler


            //bool sonuc;
            //int ilkSayi = 10;
            //int ikinciSayi = 20;

            //sonuc = (ilkSayi == ikinciSayi) || (ilkSayi > 5);
            //Console.WriteLine(sonuc);

            //sonuc = (ilkSayi == ikinciSayi) && (ilkSayi > 5);
            //Console.WriteLine(sonuc);

            //sonuc = !(ilkSayi < ikinciSayi);
            //Console.WriteLine(sonuc);



            //bitsel operatörler


            // 5 = 0000 0101
            //  3= 0000 0011
            //   = 0000 0001

            //byte a = 5 & 3;
            //Console.WriteLine(a);


            // 5 = 0000 0101
            //  3= 0000 0011
            //   = 0000 0111

            //byte b = 5 | 3;
            //Console.WriteLine(b);

            // 5 = 0000 0101
            //  3= 0000 0011
            // = 0000 0110

            //byte c = 5 ^ 3;
            //Console.WriteLine(c);

            // 5 = 0000 0101
            //   = 1111 1010

            //byte d = 5;
            //byte e = (byte)~d;
            //Console.WriteLine(e);





            // bitsel sola kaydırma operatörü

            // 100 = 0110 0100

            //byte b = 100;
            //byte c = (byte)(b << 1); // 1100 1000
            //Console.WriteLine(c);

            // 50 = 0011 0010

            //byte d = 50;
            //byte e = (byte)(d >> 2); // 0000 1100 
            //Console.WriteLine(e);






            // Atama operatörleri


            // int a = 0, b = 0;
            //a + b = 20; // hatalı kullanım



            // a = a + b;
            //a += b;

            // a = a - b;
            // a - b;

            // a *= b;
            //a /= b;
            //a %= b;


            // string a = "Berat";
            // string b = "Eliaçık";
            // Console.WriteLine(a + b);





            //Console.WriteLine("Covid-19 geçirdiniz mi? (e, h):");
            //string durum = Console.ReadLine();
            //Console.WriteLine(durum == "e" ? "Geçmiş olsun" : "Bravo tedbirlere uymaya devam et");







            //Console.WriteLine("hello world");






            //int sayi1, sayi2, sayi3;
            //Console.WriteLine("Bir sayı girin: ");
            //sayi1 = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Bir sayı girin: ");
            //sayi2 = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Bir sayı girin: ");
            //sayi3 = Convert.ToInt32(Console.ReadLine());

            //if (sayi1>sayi2 && sayi1>3)
            //{
            //    Console.WriteLine("En büyük sayı: {0}", sayi1);

            //}
            //else if (sayi2>sayi3)
            //{
            //    Console.WriteLine("en büyük sayı: {0}", sayi2);

            //}
            //else
            //{
            //    Console.WriteLine("en büyük sayı: {0}", sayi3);

            //}





            //double boy, kilo, indeks = 0;
            //Console.WriteLine("Boyunuzu metre cinsinden girin. Örn 1,65: ");
            //boy = Convert.ToDouble(Console.ReadLine());
            //Console.WriteLine("kilonuzu girin: ");
            //kilo = Convert.ToDouble(Console.ReadLine());
            //indeks = kilo / (boy * boy);

            //Console.WriteLine("vücut kitle endeksiniz: {0}", indeks);

            //if(indeks<18)
            //{
            //    Console.WriteLine("zayıfsınız");

            //}
            //else if(indeks>=18 && indeks < 25)
            //{
            //    Console.WriteLine("normalsiniz");

            //}

            //else if (indeks>= 25 && indeks < 30)
            //{
            //    Console.WriteLine("kilolusunuz");

            //}

            //else if (indeks>=30 && indeks < 35)
            //{
            //    Console.WriteLine("obezsiniz.");

            //}

            //else
            //{
            //    Console.WriteLine("ciddi obezsiniz");

            //}






            //int tahmin, hak = 5;
            //bool durum = false;

            //Random rastgele = new Random();
            //int rastgeleSayi = rastgele.Next(0, 10);

            //for(int kalanHak=hak; kalanHak>0; kalanHak--)
            //{
            //    Console.WriteLine("hak{0}", kalanHak);
            //    Console.WriteLine("tahmininiz: ");
            //    tahmin = int.Parse(Console.ReadLine());

            //    if (tahmin == rastgeleSayi)
            //    {
            //        Console.WriteLine("Tebrikler doğru bildiniz");
            //        durum = true;
            //        break;

            //    }

            //    else if (rastgeleSayi > tahmin && kalanHak != 1)
            //        Console.WriteLine("daha büyük bir sayı girin");
            //    else if (rastgeleSayi < tahmin && kalanHak != 1)
            //        Console.WriteLine("daha küçük bir sayı girin");
            //}

            //if (!durum)
            //{
            //    Console.WriteLine("tekrar deneyin");
            //    Console.WriteLine("sayı: {0}", rastgeleSayi);
            //}


















































































































































































        }
    }
}
