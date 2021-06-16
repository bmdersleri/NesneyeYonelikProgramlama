using System;
using System.IO;
using System.Text;

namespace write_all_bytes
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\write_all_bytes.txt";

            string metin = "nesneye dayali programlama";
            byte[] data = Encoding.UTF8.GetBytes(metin);

            File.WriteAllBytes(path, data);

            //File.WriteAllBytes komutu UTF8.GetBytes methodunu kullanır.//
            //Yazılan metni byte haline dönüştürür ve dosyaya yazar.//
        }
    }
}


