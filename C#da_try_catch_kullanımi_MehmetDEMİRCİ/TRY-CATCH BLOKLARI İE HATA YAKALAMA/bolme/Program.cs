using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bolme
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayi1, sayi2, bolme1;

            try
            {
                Console.WriteLine("sayi1=");
                sayi1 = int.Parse(Console.ReadLine());
                Console.WriteLine("sayi2=");
                sayi2 = int.Parse(Console.ReadLine());

                bolme1=sayi1/sayi2;

                Console.WriteLine ("bölme sonucu={0}",bolme1);


            }
            catch (Exception)     
            {
                Console.WriteLine("hata oluştu.");
            }
            Console.ReadKey();
        }
    }
}

