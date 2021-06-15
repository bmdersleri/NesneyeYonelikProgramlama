using System;

namespace uygulamaornegi9
{
    class Program
    {
        static void Main(string[] args)
        {
            char op;
            double ilk, ikinci, sonuc;

            Console.Write("İlk sayıyı girin: ");
            first = Convert.ToDouble(Console.ReadLine());
            Console.Write("İkinci sayıyı girin: ");
            second = Convert.ToDouble(Console.ReadLine());
            Console.Write("Bir işlem girin (+, -, *, /): ");
            op = (char)Console.Read();

            switch (op)
            {
                case '+':
                    sonuc = ilk + ikinci;
                    Console.WriteLine("{0} + {1} = {2}", ilk, ikinci, sonuc);
                    break;

                case '-':
                    sonuc = ilk - ikinci;
                    Console.WriteLine("{0} - {1} = {2}", ilk, ikinci, sonuc);
                    break;

                case '*':
                    sonuc = ilk * ikinci;
                    Console.WriteLine("{0} * {1} = {2}", ilk, ikinci, sonuc);
                    break;

                case '/':
                    sonuc = ilk / ikinci;
                    Console.WriteLine("{0} / {1} = {2}", ilk, ikinci, sonuc);
                    break;

                default:
                    Console.WriteLine("Invalid Operator");
                    break;
            }
            Console.ReadKey();
        }
    }
}
