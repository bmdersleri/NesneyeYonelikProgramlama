using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu20
{
    abstract class A
    {
        abstract public int ozellik
        {
            set;
            get;
        }

    }
    class B : A
    {
        override public int ozellik
        {
            get { return 100; }
            set { Console.WriteLine("Bu bir denemedir"); }
        }
    }
    class program
    {
        static void Main()
        {
            //A yenia = new A();
            B yenib = new B();
            Console.WriteLine(yenib.ozellik);
            yenib.ozellik = 200;
            Console.ReadKey();
        }
    }
}
