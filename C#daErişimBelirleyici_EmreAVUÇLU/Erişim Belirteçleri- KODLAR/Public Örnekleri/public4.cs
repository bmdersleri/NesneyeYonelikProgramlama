using System;
namespace Public4
{
   class Dikdortgen
    {
        //üye değişkenler
        public double uzunluk;
        public double genislik;

        public double AlanGetir()
        {
            return uzunluk * genislik;
        }

        public void Yazdir()
        {
            Console.WriteLine("Uzunluk: {0}", uzunluk);
            Console.WriteLine("Genişlik: {0}", genislik);
            Console.WriteLine("Dikdörtgen Alanı: {0}", AlanGetir());
        }
    }

    class Program
    {
        static void Main(string[] args)
        {

            Dikdortgen sekil = new Dikdortgen();
            sekil.uzunluk = 4;  //public olduğu için sınıf dışından ulaşılabilir durumda
            sekil.genislik = 5; //public olduğu için sınıf dışından ulaşılabilir durumda
            sekil.Yazdir();     //public olduğu için sınıf dışından ulaşılabilir durumda
            Console.ReadLine();

        }
    }

}
