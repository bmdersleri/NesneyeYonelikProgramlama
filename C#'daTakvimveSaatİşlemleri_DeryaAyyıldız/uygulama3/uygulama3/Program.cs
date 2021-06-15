using System;

namespace uygulama3
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime ilktarih = new DateTime(2021, 10, 4);
            DateTime ikincitarih = new DateTime(2022, 1, 1);
            TimeSpan span = ikincitarih.Subtract(ilktarih);
            Console.WriteLine("{0} gün sonra 2022 yılına gireceğiz", span.TotalDays);
        }
    }
}
