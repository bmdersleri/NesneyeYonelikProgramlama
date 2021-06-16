using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Diagnostics;

namespace SenkronuAsnekron_Çalıştırma
{
    class Program
    {
        static async Task Main(string[] args)
        {
            Stopwatch sw = new Stopwatch();
            sw.Start();
            var task = Task.Run(() => Ağırİşlem(0));
            Console.WriteLine("öbür işlemleri yapıyoruz");
            var çıktı = await task;
            sw.Stop();
            Console.WriteLine("bitti " + sw.Elapsed);
            Console.ReadKey();
        }
        static long Ağırİşlem(long i)
        {
            Console.WriteLine("başladı");
            for (; i < 1000000000000; i += 500)
            {

            }
            return i;
        }

    }
}
