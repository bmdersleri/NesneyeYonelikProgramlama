using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu10
{
    class kisi
    {
        public string ad, soyad;
        private string adres, dogumTarihi;
        public void bilgiGir()
        { }
        private void bilgiListele()
        { }
    }
    class Ogrenci : kisi
    {
        public string ogrenciNo;
        public void notListele()
        { }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Ogrenci yeni = new Ogrenci();
            Console.WriteLine(yeni.ad);
        }
    }
}
