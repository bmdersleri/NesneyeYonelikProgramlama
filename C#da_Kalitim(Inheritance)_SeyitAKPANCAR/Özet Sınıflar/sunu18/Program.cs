using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu18
{
    abstract class A
    {
        public string Metot()
        {
            return "deneme";
        }
    }
    class B:A
    {
        static void Main(string[] args)
        {
            A yenia = new A();
            B yenib = new B();
            Console.ReadKey();
        }
    }
}
