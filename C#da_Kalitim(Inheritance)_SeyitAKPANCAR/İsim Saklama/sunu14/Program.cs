using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu14
{
    class A
    {
        public int x = 10;
    }
    class B : A
    {
        public int x;
        public int Metot()
        {
            return base.x;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            B yeni = new B();
            Console.WriteLine(yeni.Metot());
            Console.ReadKey();
        }
    }
}
