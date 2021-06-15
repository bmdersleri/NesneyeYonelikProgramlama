using System;

namespace ArabaOrnegi
{
    internal class Kapı { }
    class Program
    {

        public class Araba
        {
            protected Kapı önSag;
            protected Kapı önSol;

            protected class Motor
            {
                public int Beygir;

            }
            protected class Aku
            {
                public int voltaj;
            }
            public class Kapı
            {
                
                public int pozisyon;
            }

            protected Motor motor; protected Aku aku;
            public Araba()
            {
                motor = new Motor();
                aku = new Aku();
            }
        }


        public class Ford : Araba
        {
            public Ford()
            {
                motor.Beygir = 1500;
                aku.voltaj = 123;
                önSag.pozisyon = 2;
                önSol.pozisyon = 1;
            }
        }
        static void Main(string[] args)
        {


        }
    }
}
