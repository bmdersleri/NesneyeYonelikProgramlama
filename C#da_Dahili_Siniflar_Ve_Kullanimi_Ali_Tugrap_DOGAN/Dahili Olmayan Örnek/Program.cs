using System;

namespace Dahili_Olmayan_Ornek
{
    public class Ekmek
    {
    }

    public class Kiraz
    {
    }

    public class FırınDukkani
    {
        public Ekmek EkmekSat()
        {
            Console.WriteLine("4 ekmek satıldı.");
            return new Ekmek();
        }
    }

    public class MeyveDukkani
    {
        public Kiraz KirazSat()
        {
            Console.WriteLine("10 kilo kiraz satıldı.");
            return new Kiraz();
        }
    }
    internal class Program
    {
        private static void Main(string[] args)
        {
            var satis1 = new FırınDukkani();
            satis1.EkmekSat();

            var satis2 = new MeyveDukkani();
            satis2.KirazSat();
        }
    }
}
