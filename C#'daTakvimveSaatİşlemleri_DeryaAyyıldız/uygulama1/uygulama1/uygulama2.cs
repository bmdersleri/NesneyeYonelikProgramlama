using System;

namespace uygulama1
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime tarih = new DateTime(2020, 09, 16);
            TimeSpan fark = DateTime.Now.Subtract(tarih);
            Console.WriteLine("bugün" + DateTime.Now.ToShortDateString());
            Console.WriteLine("bugünün tarihi ile " + tarih.ToShortDateString() + "arasındaki fark" + fark.Days+"gün");

        }
    }
}
