using System;
namespace Protected2
{
    class A
    {
        protected int _a;
        private int _b;

    }



    class B : A
    {
        public B()
        {
            Console.WriteLine(this._a);
        }
    }

    class Program
    {
        static void Main()
        {
            B b = new B();
        }
    }
}

