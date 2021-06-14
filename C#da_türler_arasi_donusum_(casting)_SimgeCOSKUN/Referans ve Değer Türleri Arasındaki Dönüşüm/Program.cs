using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu15
{
    class Program
    {
        static void Main(string[] args)
        {
            int i = 266;
            
            object o = i;

            i = 137;

            System.Console.WriteLine("Değer tipi (value-type) değişken içeriği = {0}", i);
            System.Console.WriteLine("Obje tipi (object-type) değişken içeriği = {0}", o);

            Console.ReadKey();
        }
    }
}
