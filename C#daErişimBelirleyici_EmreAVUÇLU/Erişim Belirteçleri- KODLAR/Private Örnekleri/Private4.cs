using System;

namespace Private4
{
    class Dikdortgen
    {
        private double uzunluk;
        private double genislik;

        public void Uzunluk(double sayi)
        {
            uzunluk = sayi;
        }
        public void Genislik(double sayi)
        {
            genislik = sayi;
        }
        public double Alangetir()
        {
            return uzunluk * genislik;

        }

        public void Yazdir()
        {
            Console.WriteLine("Uzunluk: {0}", uzunluk);
            Console.WriteLine("Genislik: {0}", genislik);
            Console.WriteLine("Alan: {0}", Alangetir());
        }
    }

    class Program
    {
        static void Main(string[]args)
        {
            Dikdortgen sekil = new Dikdortgen();
            sekil.Uzunluk(4);
            sekil.Genislik(5);
            sekil.Yazdir();
            Console.Readline();
        }
    }
}
