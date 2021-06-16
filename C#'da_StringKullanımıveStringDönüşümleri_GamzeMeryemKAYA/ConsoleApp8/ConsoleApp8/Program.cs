using System;

namespace ConsoleApp8
{
    class Program
    {
        static void Main(string[] args)
        {
            ////STRİNG Tanımlama
            //string isim = "gamze";
            //Console.WriteLine(isim);
            //Console.ReadKey();

            //char[] dizi = ('a', 'b', 'c', 'd');
            //string b = new String(dizi);
            //Console.WriteLine(dizi);
            //Console.WriteLine(dizi);


            ////String Özellikleri
            //    string ad = "gamze";
            //string soyad;
            //soyad = "kaya";
            //Console.WriteLine(ad + " " + soyad);
            //Console.ReadKey();

            ////string tek satırda tanımlanır;
            //string metin = "nesneye dayalı programlamayı 
            //çok seviyoruz";

            ////hatalı string toplama
            //string a, b;
            //Console.WriteLine("1.sayıyı giriniz");
            //a = Console.ReadLine();
            //Console.WriteLine("2.sayıyı giriniz");
            //b= Console.ReadLine();
            //Console.WriteLine("{0} + {1} = {2}", a, b, (a + b));
            //Console.ReadKey();

            ////çift tırnak kullanımı
            //string ornek = "Sinem E \"Maksimum\" projesinin sahibidir.";
            //string ornek = @"Sinem E ""Maksimum"" projesinin sahibidir.";
            ////ters slash
            //string g = "\\\\server\\share\\file.txt"; // \\server\share\file.txt
            //string h = @"\\server\share\file.txt";    // \\server\share\file.txt

            /////?????????????????????  STRİNG METOTLAR
            //string a = "gamzemrym";
            //Console.WriteLine(a.Length);

            //string a = "nesne";
            //int b = a.IndexOf('s');
            //Console.WriteLine(b);

            //string a = "     nesne programlama   ";
            //Console.WriteLine(a.Trim());

            //string value = "Merhaba Dünya";
            //Console.WriteLine(value.Insert(7,","));

            //string a = "nesneyeyönelik";
            //Console.WriteLine(a.Remove(7));

            //string a = "string metotlar";
            //Console.WriteLine(a.Substring(9, 5));



            ////INDEXOF METODU
            //string aranacak;
            //string cumle;
            //Console.WriteLine("bir cümle giriniz");
            //cumle = Console.ReadLine();
            //Console.Write("aranacak ifadeyi giriniz");
            //aranacak = Console.ReadLine();
            //int durum = cumle.IndexOf(aranacak);
            //int durum = cumle.IndexOf(aranacak,3);
            //int durum = cumle.IndexOf(aranacak,0,3);
            //Console.WriteLine(durum);
            //Comsol.Readkey();

            ////CONTACT METODU
            //Console.Write("Bir kelime giriniz");
            //string kelime1 = Console.ReadLine();

            //Console.Write("Bir kelime daha giriniz");
            //string kelime2 = Console.ReadLine();
            //string s = String.Concat(kelime1, kelime2);
            //Console.WriteLine(s);
            //Console.ReadKey()


            //Split metotu kullanımı
            //string metin = "nesneye dayalı programlama";
            //foreach (string bosluk in metin.Split(' ')) ;
            //Console.WriteLine(bosluk);


            //Contains metodu
            //Console.Write("Metin giriniz: ");
            //string metin = Console.ReadLine();
            //Console.Write("Aranan metni giriniz: ");
            //string aranan = Console.ReadLine();
            //if (metin.Contains(aranan))
            //    Console.WriteLine("({0}) ifadesi içerisinde ({1}) kelimesi mevcuttur.", metin, aranan);
            //else
            //    Console.WriteLine("({0}) ifadesi içerisinde ({1}) kelimesi yoktur.", metin, aranan);


            //string strng = "bmdersleri.com";
            //Console.WriteLine(strng.EndsWith(".com"));
            //Console.WriteLine(strng.EndsWith(".net")); ;
            //Console.ReadKey();




            //Format Metodu kullanımı
            //Console.WriteLine("-------------------------------");
            //Console.WriteLine("Sıra No | Adınız | Soyad");
            //Console.WriteLine("-------------------------------");
            //Console.WriteLine(String.Format("{0,7} | {1,-8} | {2,10}", 1,
            //"gamze", "kaya"));
            //Console.WriteLine(String.Format("{0,7} | {1,-8} | {2,10}", 2,
            //"Sinem", "Elbir"));
            //Console.WriteLine(String.Format("{0,7} | {1,-8} | {2,10}", 3,
            //"Deniz", "Kaya"));
            //Console.WriteLine("-------------------------------");





            //ısnullorempty metodu
            //Console.Write("Kullanıcı adınızı giriniz: ");
            //string kAdi = Console.ReadLine();
            //Console.Write("Sifrenizi giriniz: ");
            //string Ksifre = Console.ReadLine();
            //bool Kadibosmu = String.IsNullOrEmpty(kAdi);
            //bool Ksifrebosmu = String.IsNullOrEmpty(Ksifre);
            //if (Kadibosmu == true)
            //    Console.WriteLine("Kullanıcı adını boş geçemezsiniz.");
            //else
            //    Console.WriteLine("Girmiş olduğunuz kullanıcı adı:" +kAdi);
            //if (Ksifrebosmu == true)Console.WriteLine("Şifreyi boş geçemezsiniz.");
            //else
            //    Console.WriteLine("Girmiş olduğunuz şifre:"+Ksifre);







            //ToString
            //char karakter = 'g';
            //string metin = karakter.ToString();
            //Console.WriteLine(metin);

            //Convert.ToString
            //int sayi = 123;
            //string metin = Convert.ToString(sayi);
            //Console.WriteLine(metin);
            //char karakter = 'g';
            //string metin1 = Convert.ToString(karakter);
            //Console.WriteLine(metin1);

            //string metin = "123";
            //int sayi1 = Convert.ToInt32(metin);
            //Console.WriteLine(sayi1);
            //byte sayi2 = Convert.ToByte(metin);
            //Console.WriteLine(sayi2);
            //double sayi3 = Convert.ToDouble(metin);
            //Console.WriteLine(sayi3);

            //PARSE YÖNTEMİ

            //string sayi = "100";
            //int sayi1 = int.Parse(sayi);
            //Console.WriteLine(sayi1);





        }
    }
}
