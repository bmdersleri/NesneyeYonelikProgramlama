using System;


namespace Interfaces
{
    class Program
    {
        static void Main(string[] args)
        {
            CustomerManager customerManager = new CustomerManager(new FirstRegulation());
            customerManager.Add();

        }
    }
    class CustomerManager
    {
        private IRegulation _regulation;
        public CustomerManager(IRegulation regulation)
        {
            _regulation = regulation;
        }
        public void Add()
        {
            _regulation.doSomething();
        }
    }
    interface IRegulation
    {
        void doSomething();
    }
    class FirstRegulation : IRegulation
    {
        public void doSomething()
        {
            Console.WriteLine("First regulation!");
        }
    }
    class SecondRegulation : IRegulation
    {
        public void doSomething()
        {
            Console.WriteLine("Second regulation!");
        }
    }
}