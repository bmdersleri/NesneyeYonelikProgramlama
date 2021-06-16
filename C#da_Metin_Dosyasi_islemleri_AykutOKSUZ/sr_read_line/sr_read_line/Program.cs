using System;
using System.IO;
using System.Text;

namespace sr_read_line
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\sr_readline.txt";

            using var fs = new FileStream(path, FileMode.Open, FileAccess.Read);
            using var sr = new StreamReader(fs, Encoding.UTF8);

            string satir = String.Empty;

            while ((satir = sr.ReadLine()) != null)
            {
                Console.WriteLine(satir);
            }
        }
    }
}


