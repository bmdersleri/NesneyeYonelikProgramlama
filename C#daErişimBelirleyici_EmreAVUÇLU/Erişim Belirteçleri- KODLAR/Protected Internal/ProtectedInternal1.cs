using System;

namespace ProtectedInternal1
{ 
    class TestClass
{
        protected internal string isim = "Ahmet";
        protected internal void Print(string msg)
    {
        Console.WriteLine("Merhaba" + msg);
    }

}
    class Test2
    {
        static void Main(string[] args)
        {
            TestClass tc = new TestClass();
            Console.WriteLine("Hoş geldin" + tc.isim);
            tc.Print("Ahmet");
        }
    }
}
 



    
