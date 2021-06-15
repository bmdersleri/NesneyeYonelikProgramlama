using System;

namespace bitseloperatorler
{
    class Program
    {
        static void Main(string[] args)
        {
            //bitsel operatörler


            // 5 = 0000 0101
            //  3= 0000 0011
            //   = 0000 0001

            byte a = 5 & 3;
            Console.WriteLine(a);


            // 5 = 0000 0101
            //  3= 0000 0011
            //   = 0000 0111

            byte b = 5 | 3;
            Console.WriteLine(b);

            // 5 = 0000 0101
            //  3= 0000 0011
            // = 0000 0110

            byte c = 5 ^ 3;
            Console.WriteLine(c);

            // 5 = 0000 0101
            //   = 1111 1010

            byte d = 5;
            byte e = (byte)~d;
            Console.WriteLine(e);



            // bitsel sola kaydırma operatörü

            // 100 = 0110 0100

            byte f = 100;
            byte g = (byte)(f << 1); // 1100 1000
            Console.WriteLine(g);

            // 50 = 0011 0010

            byte h = 50;
            byte i = (byte)(h >> 2); // 0000 1100 
            Console.WriteLine(i);
        }
    }
}
