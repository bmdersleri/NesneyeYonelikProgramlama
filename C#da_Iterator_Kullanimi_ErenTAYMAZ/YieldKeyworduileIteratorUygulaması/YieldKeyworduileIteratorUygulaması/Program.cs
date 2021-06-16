using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YieldKeyworduileIteratorUygulaması
{
    class Program
    {
        static IEnumerable<string> GunleriAl()
        {
            yield return "Pazartesi";
            yield return "Salı";
            yield return "Çarşamba";
            yield return "Perşembe";
            yield return "Cuma";
            yield return "Cumartesi";
            yield return "Pazar";
        }
        static void Main(string[] args)
        {
            foreach (string day in GunleriAl())
            {
                Console.WriteLine(day);
                Console.ReadLine();
            }
        }
    }
}
