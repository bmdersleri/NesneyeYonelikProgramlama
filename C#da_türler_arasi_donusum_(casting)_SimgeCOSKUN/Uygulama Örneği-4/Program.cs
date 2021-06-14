using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu21
{
    class Program
    {
        static void Main(string[] args)
        {
            double a = 3.7;

            int x = (int)a;

            int y = Convert.ToInt32(a);
            Console.WriteLine(x + " x değişkeninin tipi: " + x.GetType());
            Console.WriteLine(y + " y değişkeninin tipi: " + y.GetType());
            Console.ReadKey();
        }
    }
}
