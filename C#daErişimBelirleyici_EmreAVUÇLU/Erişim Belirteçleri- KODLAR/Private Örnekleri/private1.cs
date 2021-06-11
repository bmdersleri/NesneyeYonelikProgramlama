using System;

namespace privateornek
{

class MesajVer
    {
        private void hataGoster()
        {
            Console.WriteLine("Hata Oluştu...");
        }
    }
}


class Program
{
    static void Main(string[] args)
    {
        MesajVer mesaj = new MesajVer();
        mesaj.hataGoster();
    }
}