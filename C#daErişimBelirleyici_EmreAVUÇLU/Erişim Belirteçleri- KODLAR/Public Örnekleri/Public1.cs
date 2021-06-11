using System;

namespace Public1
{
    class Calisan
    {
        public string isim;
    }

    public class Program
    {
        public static void Main()
        {
            Calisan isci = new Calisan();
            isci.isim = "Mehmet";
            Console.Write("çalışanın adı" + isci.isim);
        }
    }
}
