using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu8
{
    class Program
    {
        public class MyClass

        {

            public int Toplam { get; set; }

            public static explicit operator MyClass(int i)

            {

                MyClass instance = new MyClass();

                instance.Toplam = i; return instance;

            }

        }

        static int deger = 5;

        MyClass instance = (MyClass)deger;
        static void Main(string[] args)
        {
        }
    }
}
