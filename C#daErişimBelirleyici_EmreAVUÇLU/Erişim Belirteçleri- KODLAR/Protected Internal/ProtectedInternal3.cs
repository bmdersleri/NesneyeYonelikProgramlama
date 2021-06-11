using System;

namespace ProtectedInternal1
{ 
    public class Program
{
        
        public static void Main(string[] args)
    {
            Game game = new Game();
            game.Id = 255;
            game.Name = "Counter Strike";

            Console.WriteLine(game.Id);
            Console.WriteLine(game.Name);
            Console.ReadLine();
        }

}
    public class Game
    {
        protected internal int Id { get; set; };
        protected internal string Name { get; set; };
    }
}
 



    
