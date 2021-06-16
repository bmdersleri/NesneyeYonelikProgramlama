using System;

namespace ConsoleApp4
{
    class Program
    {
        static void Main(string[] args)
        {
            Kisi kisi1 = new Kisi();
            Kisi kisi2 = new Kisi();

            kisi1.Isim = "Yunus";
            kisi1.Boyuzunlugu = 1.79;

            kisi2 = kisi1;

            kisi1.Isim = "Emre";
            kisi1.Boyuzunlugu = 1.85;

            Console.WriteLine(kisi2.Isim);
            Console.WriteLine(kisi2.Boyuzunlugu);

            Musteri musteri1 = new Musteri();
            musteri1.KartNumarasi = 12345678;

            Musteri musteri2 = new Musteri();

            musteri2 = musteri1;

            musteri2.KartNumarasi = 456789;
            Console.WriteLine(musteri1.KartNumarasi);
            Console.WriteLine(musteri2.KartNumarasi);

        }
    }

    class Kisi
    {
        public string Isim { get; set; }
        public double Boyuzunlugu { get; set; }
    }

    class Musteri
    {
        public int KartNumarasi { get; set; }
    }
}


