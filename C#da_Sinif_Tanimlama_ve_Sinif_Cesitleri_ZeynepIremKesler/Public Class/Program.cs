﻿using System;

namespace finalodevi
{
    class Program
    {
       public class Tasit
        {
            public string marka;
            public string model;
            public string yakittipi;
            public string vitestipi;
            public string renk;
            public int hiz;
            public int fiyat;

        } 
        class Uygulama
        {
            static public void Main()
            {
                Tasit Fiat = new Tasit();
                Fiat.marka = "Fiat";
                Fiat.model = "Egea Sedan";
                Fiat.yakittipi = "Dizel";
                Fiat.vitestipi = "Manuel";
                Fiat.renk = "Siyah";
                Fiat.hiz = 230;
                Fiat.fiyat = 40000;


                Console.WriteLine("Marka: " + Fiat.marka);
                Console.WriteLine("Model: " + Fiat.model);
                Console.WriteLine("Yakıt Tipi: " + Fiat.yakittipi);
                Console.WriteLine("Vites Tipi: " + Fiat.vitestipi);
                Console.WriteLine("Renk: " + Fiat.renk);
                Console.WriteLine("Hız: " + Fiat.hiz);
                Console.WriteLine("Fiayt: " + Fiat.fiyat);

            }
        
        }
          
    }
}
