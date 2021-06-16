using System;

namespace finalodevi
{
    class Program
    {
        private class Ev
        {
            private int kapino;
            private string apartmanadi;




            static private void Main()
            {


                Ev ilkev = new Ev();
                ilkev.kapino = 12;
                ilkev.apartmanadi = "Yasemin";
                Console.WriteLine("Apartman: " + ilkev.apartmanadi + "," + "Kapı Numarası: " + ilkev.kapino);


            }
        }
          
    }
}
