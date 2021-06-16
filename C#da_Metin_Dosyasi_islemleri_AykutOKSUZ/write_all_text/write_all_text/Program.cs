using System;
using System.IO;

namespace write_all_text
{
    class Program
    {
        static void Main(string[] args)
        {
            var path = @"C:\Users\HP\Documents\metin işlemleri\write_all_text.txt";

            string metin = "Mehmet Akif Ersoy Üniversitesi";
            File.WriteAllText(path, metin);

            //File.WriteAllText komutunu yazılan metni dosyalara eklemek için kullanılır.//
            //Eğer dosya halihazırda bulunuyorsa üzerine yazar, bulunmuyorsa yeni bir dosya oluşturur.//
        }
    }
}


