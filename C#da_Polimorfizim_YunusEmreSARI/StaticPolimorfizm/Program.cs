using System;

namespace CSharpPolimorfizm
{


    //Static Polimorfizm

    public class OrnekSinif
    {
        public int Toplama(int a, int b, int c)
        {
            return a + b + c;
        }

        public int Toplama(int a, int b)
        {
            return a + b;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {

            OrnekSinif yeniNesne = new OrnekSinif();

            int ucSayiToplami = yeniNesne.Toplama(45, 34, 67);
            int ikiSayiToplami = yeniNesne.Toplama(23, 34);

            Console.WriteLine("Üç sayının toplamı: " + ucSayiToplami);
            Console.WriteLine("İki sayının toplamı: " + ikiSayiToplami);

        }
    }




}


