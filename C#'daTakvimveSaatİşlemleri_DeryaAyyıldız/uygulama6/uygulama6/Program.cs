using System;

namespace uygulama6
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime tbir = DateTime.UtcNow;
            DateTime tiki = DateTime.Now;
            DateTime uc = tbir;
            bool sonuc = tbir.Equals(tiki);
            Console.WriteLine("Datetime nesnesi tarih bir ve tarih iki karşılaştırmanın sonucu:{0}",sonuc);
            sonuc = tbir.Equals(uc);
            Console.WriteLine("DateTime nesnesi bir ve üç karşılaştırmanın sonucu: {0}", sonuc);

        }
    }
}
