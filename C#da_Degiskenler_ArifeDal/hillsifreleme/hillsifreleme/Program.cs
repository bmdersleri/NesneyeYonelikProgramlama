using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace hillsifreleme
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, k, top, boyut = 0;
            int[,] anahtar = new int[25, 25];
            int[,] kelime = new int[25, 1];
            string metin = "";

            Console.WriteLine("Şifrelemek istediğiniz metini giriniz:");
            metin = Console.ReadLine();
            char[] txt = metin.ToCharArray();
            boyut = txt.Length;

            //int[] anahtar={1,3,2,1}
            Random rnd = new Random();
            for(i=0;i<boyut;i++)
            {
               for(k=0;k<boyut;k++)
                {
                    anahtar[i, k] = rnd.Next();
                }
            }

            for(i=0;i<boyut;i++)
            {
                top = 0;
                for(k=0;k<boyut;k++)
                {
                    top += anahtar[i, k] * (int)txt[k];
                }
                kelime[i, 0] = top;
            }

            for(i=0;i<boyut;i++)
            {
                char sifre = (char)(((kelime[i, 0]) % 26) + 97);
                Console.Write("\t" + sifre);
            }
            Console.ReadKey();

             
            


        }
    }
}
