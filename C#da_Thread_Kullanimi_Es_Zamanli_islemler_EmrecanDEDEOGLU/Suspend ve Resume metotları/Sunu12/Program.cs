using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Sunu12
{
    class Program
    {
        [Obsolete]
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(metod);
            thread1.Start();

            Thread.Sleep(1500);
            thread1.Suspend();
            Thread.Sleep(3000);
            thread1.Resume();

            Console.ReadKey();
        }
        private static void metod()
        {
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(i);
                Thread.Sleep(1000);
            }
            Console.WriteLine("Thread1 bitti\n");
        }
    }
}
