using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sunu13
{
    class A
    {
        public int ozellik1;
        public int ozellik2;
        public A(int x1, int x2)
        {
            ozellik1 = x1;
            ozellik2 = x2;
        }
    }
    class B : A
    {
        public int ozellik3;
        public int ozellik4;
        public B(int x3, int x4, int k1, int k2) : base (k1, k2)
        {
            ozellik3 = x3;
            ozellik4 = x4;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
        }
    }
}
