using System;
using System.IO;
using System.Text;

namespace filestream_write
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\fs_write.txt";

            using FileStream fs = File.OpenWrite(path);

            var data = "MA\nKÜ";
            byte[] bytes = Encoding.UTF8.GetBytes(data);

            fs.Write(bytes, 0, bytes.Length);
        }
    }
}


