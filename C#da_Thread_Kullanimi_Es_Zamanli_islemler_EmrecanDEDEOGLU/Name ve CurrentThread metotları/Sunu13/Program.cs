using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Sunu13
{
    class Program
    {
        static void Main(string[] args)
        {
            Thread thread1 = new Thread(metod);
            thread1.Start();
            thread1.Name = "thread1";

            Console.ReadKey();
        }

        private static void metod()
        {
            Console.WriteLine("{0} başladı", Thread.CurrentThread.Name);
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine(i);
                Thread.Sleep(1000);
            }
            Console.WriteLine("{0} bitti", Thread.CurrentThread.Name);
        }
    }
}
