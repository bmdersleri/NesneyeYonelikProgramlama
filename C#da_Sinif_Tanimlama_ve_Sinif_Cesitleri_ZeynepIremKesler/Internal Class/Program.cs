﻿using System;

namespace finalodevi
{
    class Program
    {
       internal class Okul
        {
            class sinif
            {
                internal string sinifogretmeni;
                internal int sinifno;
                internal string sube;
                internal int sinifmevcudu;
                internal string basaridurumu;

            }
        static internal void Main()
            {
                sinif ilksinif = new sinif();
                ilksinif.sinifogretmeni = "Derya";
                ilksinif.sinifno = 11;
                ilksinif.sube = "B";
                ilksinif.sinifmevcudu = 25;
                ilksinif.basaridurumu = "Orta";
            }
        }
    }
}
