using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu13
{
    class Program
    {
        static void Main(string[] args)
        {
            int yas;
            Console.Write("Yaşınızı Girin: ");
            yas = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine(yas + " " + yas.GetType());
            Console.ReadKey();
        }
    }
}
