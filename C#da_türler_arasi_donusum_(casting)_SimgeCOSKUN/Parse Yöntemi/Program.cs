using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu10
{
    class Program
    {
        static void Main(string[] args)
        {
            string metinInt = "15";
            string metinDouble = "15.85";
            int a;
            double b;

            a = Int32.Parse(metinInt);

            b = Double.Parse(metinDouble);

            Console.WriteLine(" a değişkeninin tipi: " + a.GetType());
            Console.WriteLine(" b değişkeninin tipi: " + b.GetType());
            Console.ReadKey();
        }
    }
}
