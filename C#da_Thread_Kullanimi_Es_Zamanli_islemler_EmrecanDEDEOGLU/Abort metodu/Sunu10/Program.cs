using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Sunu10
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(metod);
            thread1.Start();

            Thread.Sleep(3500);
            thread1.Abort();
            Console.WriteLine("thread sonlandırıldı.");

            Console.ReadKey();
        }
        private static void metod()
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine(i);
                Thread.Sleep(1000);
            }
        }
    }
}
