using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sunu_12
{
    class Program
    {
        static void Main(string[] args)
        {
            //Ülkemizin 7 bölgesini ve her bölgede bulunan 3 şehri tutan çok boyutlu bir dizi örneği

            string[,] bolge = new string[7, 3]
            {
                { "İstanbul","Bursa","Yalova"},
                { "İzmir","Denizli","Aydın" },
                { "Antalya","Adana","Mersin"},
                { "Konya","Ankara","Niğde"},
                { "Ordu","Rize","Artvin"},
                { "Siirt","Mardin","Batman"},
                { "Van","Ağrı","Erzurum"}

            };

            for (int i=0; i<=bolge.GetUpperBound(0); i++)
            {
                for (int j=0; j<=bolge.GetUpperBound(1); j++)
                {
                    Console.WriteLine(bolge[i,j]);
                }
                Console.WriteLine("-");
            }
            Console.ReadLine();
        }
    }
}
