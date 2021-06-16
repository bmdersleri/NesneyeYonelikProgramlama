using System;
using System.IO;
using System.Text;

namespace read_lines
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\read_lines.txt";

            var satirlar = File.ReadLines(path, Encoding.UTF8);

            foreach (var satir in satirlar)
            {
                Console.WriteLine(satir);
            }
        }
    }
}



