using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Object_Sinifi_ve_Methodlari
{
    class Program
    {
        public class Ogrenci
        {
            int No;
            string Adisoyadi;

            public static void Main(string[] args)
            {
                Ogrenci ogr = new Ogrenci();
                ogr.No = 12345;
                ogr.Adisoyadi = "Saifuddin Hassani";

                Console.WriteLine(ogr.No);
                Console.WriteLine(ogr.Adisoyadi);
                Console.ReadLine();
            }

        }


    }
}    