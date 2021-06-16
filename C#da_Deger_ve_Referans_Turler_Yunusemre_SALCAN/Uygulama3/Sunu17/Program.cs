using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Rextester
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Urun u1;
            u1 = new Urun();
            u1.numara = 1;
            u1.fiyat = 50;

            Urun u2;
            u2 = new Urun();
            u2.numara = 2;
            u2.fiyat = 100;

            u1 = u2;

            Console.WriteLine("u1 numara :"+u1.numara);
            Console.WriteLine("u1 fiyat :" + u1.fiyat);
            Console.WriteLine("\n");
            Console.WriteLine("u2 numara :" + u2.numara);
            Console.WriteLine("u2 fiyat :" + u2.fiyat);

        }
    }

    class Urun
    {
        public int numara { get; set; }
        public float fiyat { get; set; }
    }
}