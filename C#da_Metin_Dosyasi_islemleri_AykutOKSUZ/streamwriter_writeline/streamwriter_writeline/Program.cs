using System;
using System.IO;

namespace streamwriter_writeline
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\sw_writeline.txt";

            using var sw = new StreamWriter(path);
            sw.WriteLine("Final Ödevi");
        }
    }
}


