using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu12
{
    class A
    {
        public A()
        {
            Console.WriteLine("A Sınıfı Çalıştı");
        }
    }
    class B : A
    {
        public B()
        {
            Console.WriteLine("B Sınıfı Çalıştı");
        }
    }
    class C : B
    {
        public C()
        {
            Console.WriteLine("C Sınıfı Çalıştı");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            C yeni = new C();
            Console.ReadKey();
        }
    }
}
