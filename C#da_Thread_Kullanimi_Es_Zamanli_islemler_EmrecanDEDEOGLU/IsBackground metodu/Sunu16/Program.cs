using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Sunu16
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(metod);
            thread1.IsBackground = false;
            thread1.Start();

            Console.WriteLine(thread1.IsBackground);
        }

        private static void metod()
        {
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(i);
                Thread.Sleep(1000);
            }
        }

    }
}
