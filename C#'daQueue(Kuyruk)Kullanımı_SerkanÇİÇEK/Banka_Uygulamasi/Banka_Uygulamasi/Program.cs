using System;
using System.Collections.Generic;

namespace Banka_Uygulamasi
{
    class Program
    {
        static void Main(string[] args)
        {
            Queue<string> banka = new Queue<string>();          //Nesne Oluşturma

            banka.Enqueue("Sevgi TEKİN");                 //Enqueue Metodu
            banka.Enqueue("Mert ÇİÇEK");
            banka.Enqueue("Erman ÇANKAYA");
            banka.Enqueue("Ali KAYA");
            banka.Enqueue("Caner GÖK");


            Console.WriteLine(banka.Count);            //Count Özelliği

            string silinen_kisi = banka.Dequeue();         //Dequeue Metodu
            Console.WriteLine("Kuyruktan silinen kişi : " + silinen_kisi);

            string siradaki_kisi = banka.Peek();                //Peek Metodu
            Console.WriteLine("Sıradaki Kişi : " + siradaki_kisi);


            Console.WriteLine(banka.Contains("Ali KAYA"));          //Contains Metodu

            string[] Dizi = banka.ToArray();                       //toArray Metodu
            for (int i = 0; i < Dizi.Length; i++)
                Console.WriteLine(i + ".Length eleman :" + Dizi[i]);



            banka.Clear();        //Clear Metodu
            Console.WriteLine(banka.Count);





        }
    }
}
