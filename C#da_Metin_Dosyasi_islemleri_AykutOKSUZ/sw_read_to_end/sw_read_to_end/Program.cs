using System;
using System.IO;
using System.Text;

namespace sw_read_to_end
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\sr_readtoend.txt";

            using var fs = new FileStream(path, FileMode.Open, FileAccess.Read);
            using var sr = new StreamReader(fs, Encoding.UTF8);

            string metin = sr.ReadToEnd();

            Console.WriteLine(metin);
        }
    }
}


