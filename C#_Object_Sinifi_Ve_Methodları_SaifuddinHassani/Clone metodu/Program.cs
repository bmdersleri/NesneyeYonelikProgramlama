using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Object_sinifi_ve_metodlari
{
    class Program

    {
        public static void Main(string[] args)
        {
            string s1 = "Merhaba C# ";

            string s2 = (string)s1.Clone();

            Console.WriteLine(s1);

            Console.WriteLine(s2);
            Console.ReadKey();


        }
    }

}

