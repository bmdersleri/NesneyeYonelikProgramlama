using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Newtonsoft.Json;

namespace ConsoleApp7
{
    class Program
    {
        public class Hesap
        {
            public string Name { get; set; }

            public string Email { get; set; }
        }
        
        static void Main(string[] args)
        {
            Hesap hesap = new Hesap
            {
                Name = "Hüseyin Said Zeyrek",
                Email = "huseyinsaidzeyrek@hmail.com",
            };

            string json = JsonConvert.SerializeObject(hesap, Formatting.Indented);

            Console.WriteLine(json);
            Console.ReadKey();
        }
    }
}
