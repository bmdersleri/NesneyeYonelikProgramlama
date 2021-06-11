using System;

namespace ProtectedInternal2
{ 
    class ClassTest
{
        protected internal string isim;
    protected internal void Print()
    {
        Console.WriteLine("\nBenim Adım" + isim);
    }

}
    class Program
    {
        static void Main(string[] args)
        {
            ClassTest objClassTest = new ClassTest();
            objClassTest.isim = "Ahmet";
            objClassTest.Print();
        }
    }
}
 



    
