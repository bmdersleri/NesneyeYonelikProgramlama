﻿using System;

namespace finalodevi
{
    class Program
    {
       protected class Kimlik
        {
            protected string isim;
            protected string soyisim;
            protected string meslek;
            protected int yas;
            protected string dogumtarihi;
            protected string dogumyeri;
            protected string kangrubu;

            static protected void Main()
            {
                Kimlik user = new Kimlik();
                user.isim = "Zeynep İrem";
                user.soyisim = "Kesler";
                user.meslek = "Bilgisayar Mühendisliği";
                user.yas = 21;
                user.dogumtarihi = "10/03/2000";
                user.dogumtarihi = "Samsun";
                user.kangrubu = "Arh+";

                Console.WriteLine("İsim: " + user.isim);
                Console.WriteLine("Soyisim: " + user.soyisim);
                Console.WriteLine("Meslek: " + user.meslek);
                Console.WriteLine("Yaş: " + user.yas);
                Console.WriteLine("Doğum Tarihi: " + user.dogumtarihi);
                Console.WriteLine("Doğum Yeri: " + user.dogumyeri);
                Console.WriteLine("Kan Grubu: " + user.kangrubu);

            }
        }
          
    }
}
