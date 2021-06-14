using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Sunu11
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(metod);
            Thread thread2 = new Thread(metod2);

            thread1.Start();
            thread1.Join();
            thread2.Start();

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
        private static void metod2()
        {
            Console.WriteLine("Thread2 başladı");
        }
    }
}
