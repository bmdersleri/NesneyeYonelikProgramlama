using System;

namespace uygulama9
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime bugun = DateTime.Now;
            Console.WriteLine("Bugün Günlerden:" + bugun.DayOfWeek);
        }
    }
}
