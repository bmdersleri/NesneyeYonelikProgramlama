using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DegiskenlerdeTurDonusturme
{
    class Program
    {
        static void Main(string[] args)
        {
            object deger = 1;  //boxing
            int deger1 = (int)deger;  //unboxing

            //Parse
            string kelime = "40";
            int donustur = int.Parse(kelime);

            //ToString
            int sayi1 = 6;
            string str1 = sayi1.ToString();


            int sayi = 0;
            Console.WriteLine("Değer Giriniz:");

            sayi = Convert.ToInt32(Console.ReadLine());
        }
    }
}
