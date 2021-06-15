using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ilk_isim_alani
{
    class isimalani
    {
        public void isimYazdir()
        {
            Console.WriteLine("Hüseyin Said Zeyrek");
        }
    }
}

namespace ikinci_isim_alani
{
    class isimalani
    {
        public void isimYazdir()
        {
            Console.WriteLine("Mustafa Zeyrek");
        }
    }
}

namespace ConsoleApp6
{
    class Program
    {
        static void Main(string[] args)
        {
            ilk_isim_alani.isimalani ilk = new ilk_isim_alani.isimalani();
            ikinci_isim_alani.isimalani ikinci = new ikinci_isim_alani.isimalani();

            ilk.isimYazdir();
            ikinci.isimYazdir();

            Console.ReadKey();
        }
    }
}
