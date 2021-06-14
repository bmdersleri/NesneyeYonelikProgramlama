using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Sunu18
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(metod);
            Thread thread2 = new Thread(metod2);

            Console.WriteLine("thread1 id= " + thread1.ManagedThreadId);
            Console.WriteLine("thread2 id= " + thread2.ManagedThreadId);

            thread1.Start();
            thread2.Start();

            Console.ReadKey();
        }

        private static void metod()
        {
            for (int i = 0; i < 1; i++)
            {
                Console.WriteLine(i);
            }
        }
        private static void metod2()
        {
            for (int i = 0; i < 1; i++)
            {
                Console.WriteLine("Emrecan");
            }
        }
    }
}
