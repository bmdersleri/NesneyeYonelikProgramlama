using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu20
{
    class Program
    {
        static void Main(string[] args)
        {
            string metin = "15";
            int a, b;

            a = Int32.Parse(metin);
            b = Convert.ToInt32(metin);

            Console.WriteLine(a + " a değişkeninin tipi: " + a.GetType());
            Console.WriteLine(b + " b değişkeninin tipi: " + b.GetType());
            Console.ReadKey();
        }
    }
}
