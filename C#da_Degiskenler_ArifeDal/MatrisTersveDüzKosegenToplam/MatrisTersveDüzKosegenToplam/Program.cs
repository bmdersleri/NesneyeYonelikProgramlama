using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MatrisTersveDüzKosegenToplam
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] A;
            A = new int[3, 3];
            int i, j;
            int dk = 0, tk = 0;
            Console.WriteLine("9 tane tam sayı giriniz:");

            for (i = 0; i < 3; i++)
            {
                for (j = 0; j < 3; j++)
                {
                    A[i, j] = Convert.ToInt32(Console.ReadLine());
                    if (i == j)
                    {
                        dk += A[i, j];

                    }
                    if (i + j == 2)
                    {
                        tk += A[i, j];
                    }
                }
            }
            Console.WriteLine("Düz köşegen toplamı:{0}\n Ters köşegen toplamı:{1}", dk, tk);
            Console.ReadKey();
        }
    }
}
