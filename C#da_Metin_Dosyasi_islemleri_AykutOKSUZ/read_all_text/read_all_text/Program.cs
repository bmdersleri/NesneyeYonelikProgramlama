using System;
using System.Text;
using System.IO;

namespace read_all_text
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\read_all_text.txt";

            string metin = File.ReadAllText(path, Encoding.UTF8);
            Console.WriteLine(metin);
        }
    }
}


