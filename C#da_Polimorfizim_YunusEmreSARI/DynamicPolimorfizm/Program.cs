using System;

namespace CSharpPolimorfizm
{

    //Dynamic Polimorfizm

    public class Sekil
    {
        public virtual void Ciz()
        {
            Console.WriteLine("Temel sınıf çiz çalıştı.");
        }
    }

    public class Dikdortgen : Sekil
    {
        public override void Ciz()
        {
            Console.WriteLine("Dikdörtgen sınıf çiz çalıştı.");
        }
    }

    public class Ucgen : Sekil
    {
        public override void Ciz()
        {
            Console.WriteLine("Üçgen sınıf çiz çalıştı.");
        }
    }



    class Program
    {
        static void Main(string[] args)
        {

            Dikdortgen dikdortgen = new Dikdortgen();
            dikdortgen.Ciz();

            Ucgen ucgen = new Ucgen();
            ucgen.Ciz();

        }
    }


}


