using System;
using System.Collections.Generic;

namespace Dequeue_Metodu
{
    class Program
    {
        static void Main(string[] args)
        {
            Queue<string> bilet = new Queue<string>();

            bilet.Enqueue("Kerem ÖZTÜRK");
            bilet.Enqueue("Barış ÇİÇEK");
            bilet.Enqueue("Cansu KAYA");

            string silinen_eleman = bilet.Dequeue();
            Console.WriteLine("Kuyruktan Silinen Kişi : " + silinen_eleman);


            string siradaki_eleman = bilet.Peek();
            Console.WriteLine("Sıradaki Kişi : " + siradaki_eleman);

            Console.WriteLine(bilet.Contains("Cansu KAYA"));


        }
    }
}
