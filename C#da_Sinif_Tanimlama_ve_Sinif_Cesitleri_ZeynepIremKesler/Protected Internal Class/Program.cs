using System;

namespace finalodevi
{
    class Program
    {
       protected internal class Library
        {
            protected internal int kitapsayisi;
            protected internal string klasik;
            protected internal string kisiselgelisim;
            protected internal string roman;
            protected internal string masal;
            protected internal string bilim;
            protected internal string tarih;


        }
         static protected internal void Main()
        {
            Library kitap = new Library();
            kitap.kitapsayisi = 6;
            kitap.klasik = "Suç ve Ceza";
            kitap.kisiselgelisim = "Müthiş Psikoloji";
            kitap.roman = "Kürk Mantolu Madonna";
            kitap.masal = "Kırmızı Başlıklı Kız";
            kitap.bilim = "İzafiyet Teorisi";
            kitap.tarih = "Kavgam";
            Console.WriteLine("Kitap Sayısı: " + kitap.kitapsayisi);
            Console.WriteLine("Klasik Kitap: " + kitap.klasik);
            Console.WriteLine("Kişisel Gelişim Kitabı: " + kitap.kisiselgelisim);
            Console.WriteLine("Roman Kitabı: " + kitap.roman);
            Console.WriteLine("Masal Kitabı: " + kitap.masal);
            Console.WriteLine("Bilim Kitabı: " + kitap.bilim);
            Console.WriteLine("Tarih Kitabı: " + kitap.tarih);
        } 
    }
}
