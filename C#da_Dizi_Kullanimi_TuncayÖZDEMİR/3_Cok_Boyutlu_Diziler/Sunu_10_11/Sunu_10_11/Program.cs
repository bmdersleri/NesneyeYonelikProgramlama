using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sunu_10_11
{
    class Program
    {
        static void Main(string[] args)
        {
            //Matris dizi tanımlama
            int[,] sayilar = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

            //Düzensiz dizi (Jagged Arrays) tanımlama
            int[][] dizi = new int[3][];
            dizi[0] = new int[3];
            dizi[1] = new int[4];
            dizi[2] = new int[2];
        }
    }
}
