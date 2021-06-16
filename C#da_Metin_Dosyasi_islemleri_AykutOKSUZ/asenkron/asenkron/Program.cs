using System;
using System.IO;
using System.Threading.Tasks;

namespace asenkron
{
    class Program
    {
        static async Task Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\asenkron.txt";

            string metin = "bilgisayar mühendisliği 2. sınıf";
            await File.WriteAllTextAsync(path, metin);

        }
    }
}


