using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu19
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Dikdörtgenin kısa kenarını giriniz: ");
            int kisa = Convert.ToInt16(Console.ReadLine());
            Console.Write("Dikdörtgenin uzun kenarını giriniz: ");
            int uzun = Convert.ToInt16(Console.ReadLine());

            int cevre = (kisa * 2) + (uzun * 2);
            Console.Write("Dikdörtgenin Çevresi = " + cevre);
            Console.ReadKey();
        }
    }
}
