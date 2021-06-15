using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sunu_15
{
    class Program
    {
        static void Main(string[] args)
        {
            //System.Array sınıfından IndexOf metodunun kullanımı

            string[] isimler = { "Ali", "Veli", "Ayşe", "Fatma", "Selim" };

            string aranan;

            Console.Write("İsim giriniz = ");

            aranan = Console.ReadLine();

            if (Array.IndexOf(isimler, aranan) == -1)

                Console.WriteLine("Aradığınız kişi bulunamadı.");

                else Console.WriteLine("Aradığınız kişi bulundu");

            Console.ReadKey();
        }
    }
}
