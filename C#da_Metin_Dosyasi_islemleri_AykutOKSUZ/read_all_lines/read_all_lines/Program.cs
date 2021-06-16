using System;
using System.IO;
using System.Text;

namespace read_all_lines
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\read_all_lines.txt";

            string[] satirlar = File.ReadAllLines(path, Encoding.UTF8);

            foreach (string satir in satirlar)
            {
                Console.WriteLine(satir);
            }
        }
    }
}


