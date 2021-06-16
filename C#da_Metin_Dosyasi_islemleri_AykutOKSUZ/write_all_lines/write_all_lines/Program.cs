using System;
using System.IO;

namespace write_all_lines
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\write_all_lines.txt";

            string[] satirlar = { "M", "A", "K", "Ü"};
            File.WriteAllLines(path, satirlar);


            //File.WriteAllLines yöntemi string şeklinde yazdığınız şeyleri satırlar halinde dosyaya yazar.//
        }
    }
}


