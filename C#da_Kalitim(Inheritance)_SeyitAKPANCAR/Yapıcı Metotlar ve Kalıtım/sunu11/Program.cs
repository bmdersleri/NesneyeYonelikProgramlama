using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu11
{
    class A
    {
        public A()
        {
            Console.WriteLine("A Sınıfı Yapıcı Metot");
        }
    }
    class B:A
    {
        public B()
        {
            Console.WriteLine("B Sınıfı Yapıcı Metot");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            B yeni = new B();
            Console.ReadKey();
        }
    }
}
