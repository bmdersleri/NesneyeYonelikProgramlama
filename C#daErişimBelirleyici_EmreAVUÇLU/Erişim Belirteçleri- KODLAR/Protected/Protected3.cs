using System;
namespace Protected3
{
    public class Program : Book
    {
        public static void Main(string[] args)
        {
            Program Program = new Program();
            Program.Id = 109;
            Program.Name = "C# Tutorials";
            Program.Author = " Yazar";

            Console.WriteLine(Program.Id);
            Console.WriteLine(Program.Name);
            Console.WriteLine(Program.Author);

        }
        
    }
     
    }
public class Book
{
    protected int Id { get; set; }
    protected string Name { get; set; }
    protected string Author { get; set; }
}





