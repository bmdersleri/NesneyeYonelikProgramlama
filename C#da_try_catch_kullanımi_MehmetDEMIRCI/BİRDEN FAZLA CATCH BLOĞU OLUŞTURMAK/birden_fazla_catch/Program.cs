using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace birden_fazla_catch
{
    class Program
    {
        static void Main(string[] args)
        {
            int sayi1, sayi2, bolme1;
            try
            {
                Console.WriteLine("1.sayi=");
                sayi1 = int.Parse(Console.ReadLine());
                Console.WriteLine("2.sayi=");
                sayi2 = int.Parse(Console.ReadLine());

                bolme1 = sayi1 / sayi2;

                Console.WriteLine("bölme sonucu={0}",bolme1);
            }
            catch (FormatException)
            {
                Console.WriteLine("format hatası");
            }

            catch(DivideByZeroException)

            {
                Console.WriteLine("bölme hatası");
            }

            catch (Exception hata)
            {
                Console.WriteLine(hata.Message);
            }

            Console.ReadKey();
        }
    }
}
