using System;
namespace Public3
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Product product = new Product();

            product.Id = 101;
            product.Name = "Oyuncak";

            Console.WriteLine(product.Id);
            Console.WriteLine(product.Name);

            Console.ReadLine();
        }
    }

    public class Product
    {
        public int Id { get; set; }
        public string Name { get; set; }
    }
}

