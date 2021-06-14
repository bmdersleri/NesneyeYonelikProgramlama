using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Sunu17
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(metod);
            Thread thread2 = new Thread(metod2);

            thread1.Priority = ThreadPriority.Lowest;
            thread2.Priority = ThreadPriority.Highest;

            thread1.Start();
            thread2.Start();

            Console.ReadKey();
        }

        private static void metod()
        {
            for (int i = 0; i < 20; i++)
            {
                Console.WriteLine(i);
            }
        }
        private static void metod2()
        {
            for (int i = 0; i < 20; i++)
            {
                Console.WriteLine("Emrecan");
            }
        }
    }
}
