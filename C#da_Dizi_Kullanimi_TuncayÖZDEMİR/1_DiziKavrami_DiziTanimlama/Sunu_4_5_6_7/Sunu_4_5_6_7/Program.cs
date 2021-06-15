using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sunu_4_5_6_7
{
    class Program
    {
        static void Main(string[] args)
        {
            //Dizi kullanmadan değişken tanımlama//
            int yas1 = 10;
            int yas2 = 40;
            int yas3 = 25;
            int yas4 = 60;
            int yas5 = 35;
            //Dizi kullanarak değişken tanımlama
            int[] yas = { 10, 40, 25, 60, 35 };

            //Dizi Tanımlama
            //1.Bildirim ve tanımlama aynı satırda
            int[] sayilar = new int[20];
            //2.Bildirim ve tanımlama ayrı satırda
            int[] sayilarr;
            sayilarr = new int[20];

            //Dizinin herhangi bir elemanına ulaşmak için [] index operatörü kullanırız
            int i = yas[0];
            int j = yas[4];

            //Dizi içine değer atama işlemi
            //1. Yöntem
            int[] sayilar1 = new int[3];
            sayilar1[0] = 5;
            sayilar1[1] = 12;
            sayilar1[2] = 36;
            //2. Yöntem
            int[] sayilar2 = new int[] { 5, 12, 36 };
            //3. Yöntem
            int[] sayilar3 = new[] { 5, 12, 36 };
            //4. Yöntem
            int[] sayilar4 = { 5, 12, 36 };

        }
    }
}
