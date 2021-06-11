using System;
namespace Protected1
{
    class A
    {
        static private int Ozellik;
    }
    class B:A
    {
       static void Main()
        {
            Console.WriteLine(Ozellik);
        }
        
    }


}
