using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DegiskenTurleri
{
    class Program
    {
        static void Main(string[] args)
        {
            //Sayısal Türler
            int k = 5;
            double l = 2.6;
            byte c = 255;

            //Metinsel Türler
            char a = 'A';
            string b = "Bugün hava çok güzel.";

            //Sayısal ve Metinsel Olmayanlar
            bool degisken;
            bool degisken1 = true;
            bool degisken2 = false;
            bool degisken3 = 3 > 2;

            object sayi = 2;
            object ad_soyad = " Arife Dal";

            object sayi1;
            var sayi1;

            object sayi2 = 0;
            var sayi3 = 1;


            DateTime zaman = DateTime.Now;
            string str = DateTime.Now.ToString("HH:mm");

            const string kullanici= "Arife";
            const double pi = 3.14;
            const int Sayi = 5;
            const double topla = pi + Sayi;



        }
    }
}
