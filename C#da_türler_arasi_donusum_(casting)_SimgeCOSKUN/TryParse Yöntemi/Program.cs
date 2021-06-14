using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu11
{
    class Program
    {
        static void Main(string[] args)
        {
            string deger = "50";
            decimal sonuc;
            bool gecerlilik = decimal.TryParse(deger, out sonuc);

            Console.WriteLine(gecerlilik + " " + sonuc);
            Console.ReadKey();
        }
    }
}
