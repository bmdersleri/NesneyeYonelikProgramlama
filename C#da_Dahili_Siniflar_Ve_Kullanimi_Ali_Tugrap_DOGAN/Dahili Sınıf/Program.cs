using System;

namespace Dahili_Sınıf
{
    class Program
    {
        public class Ekmek
        {
        }

        public class Kiraz
        {
        }

        public class Market
        {
            public class FırınReyonu
            {
                public Ekmek EkmekSat()
                {
                    Console.WriteLine("4 ekmek satıldı.");
                    return new Ekmek();
                }
            }

            public class MeyveReyonu
            {
                public Kiraz KirazSat()
                {
                    Console.WriteLine("10 kilo kiraz satıldı.");
                    return new Kiraz();
                }
            }
        }

        static public void Main()
        {
            var satis1 = new Market.FırınReyonu();
            satis1.EkmekSat();

            var satis2 = new Market.MeyveReyonu();
            satis2.KirazSat();
        }
        
    }
}
