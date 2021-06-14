using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Sunu20
{
    class Program
    {
        static void Main(string[] args)
        {
            Listeler newTest = new Listeler();
            Console.WriteLine("Liste kaç elemanlı olacak: ");
            newTest.elemanSayisiAl(Convert.ToInt32(Console.ReadLine()));
            //kullanıcının girdiği sayıyı int türüne dönüştürüp elemeanSayisiniAl metodunu çalıştırdık
            Thread threadListeOlustur = new Thread(newTest.listeOlustur);
            //listeOluştur metodunu thread olarak tanımladık alt satırda da başlattık
            threadListeOlustur.Start();

            Console.WriteLine("Aramak istediğiniz sayıyı giriniz: ");
            newTest.elemanAra(Convert.ToInt32(Console.ReadLine()));
            //yine int türüne dönüştürüp metotta kullandık

            Console.ReadKey();
        }

        class Listeler
        {
            List<int> liste = new List<int>();
            private object kilit = new object();
            //gelen threadleri bekletmek için lock ile kullanacağımız obje

            private int listeBoyutu;

            public void elemanSayisiAl(int elemanSayisi)
            {
                listeBoyutu = elemanSayisi;
            }
            public void listeOlustur()
            {
                lock (kilit)
                    for (int i = 0; i < listeBoyutu; i++)
                    {
                        liste.Add(i);
                        Thread.Sleep(100);
                        /*belitilen boyutta listeyi oluştururken eleman 
                        tanımlandıktan sonra 100ms bekledik*/
                    }
                Console.WriteLine("Liste oluşturuldu");
                /*lock'u kullanarak buradaki işlem bitene kadar class 
                içindeki diğer lock içeren işlemlerin beklemesini sağladık*/
            }

            public void elemanAra(int aranacakEleman)
            {
                lock (kilit)
                {
                    if (liste.Contains(aranacakEleman) == true)
                        Console.WriteLine("Eleman listede bulunuyor.");

                    else
                        Console.WriteLine("Eleman listede bulunmuyor.");
                }
                /*burada da lock kullanmamızın sebebi diğer lock'lu işlem 
                bitmeden buradaki işlemin başlamasını önlemek*/

            }
        }
    }
}
