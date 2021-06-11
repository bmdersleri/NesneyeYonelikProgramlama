using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StackveHeapBellekKullanimi
{
    class Program
    {
        static void Main(string[] args)
        {
            byte degisken1 = 62;
            double degisken2 = 28.4;
            double degisken3 = degisken2;
            

            Console.WriteLine("Birinci degiskenimiz= " + degisken1);
            Console.WriteLine("İkinci degiskenimiz= " + degisken2);
            Console.WriteLine("Ucuncu degiskenimiz= " + degisken3);

            var birinci_dizi = new int[] { 34, 126 };
            birinci_dizi[0] = 10;
            birinci_dizi[1] = 22;

            var ikinci_dizi = new int[] { 3, 9 };
            ikinci_dizi = birinci_dizi;

            Console.WriteLine("Birinci dizi:");
            foreach (var eleman in birinci_dizi)
                Console.WriteLine(eleman);

            Console.WriteLine("İkinci dizi:");
            foreach (var eleman in ikinci_dizi)
                Console.WriteLine(eleman);

            Console.ReadLine();
        }
    }
}
