using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu16_1
{
    class A
    {
        public void Metot()
        {
            Console.WriteLine("A Sınıfı");
        }
    }
    class B : A
    {
        public void Metot()
        {
            Console.WriteLine("B Sınıfı");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            A yenia = new A();
            B yenib = new B();
            yenia = yenib;
            yenia.Metot();
            Console.ReadKey();
        }
    }
}
