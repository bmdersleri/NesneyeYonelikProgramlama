package com.mycompany.ornek8;
public class main {
    public static void main(String[] args) {
        //8. Örnek Bit Düzeyinde Operatörler Uygulama Örneği:
        //0 ile 1'in ve yada veya işlemleri
        System.out.println("0 & 1 sonucu: "+ (0 & 1));
        System.out.println("0 | 1 sonucu: "+ (0 | 1));
       // And Operatörü(&) : 2’lik sayı sistemine çevirir,VE işlemi yapıp, döndürür.  
       int sayi1 = 4;                       //0000 0100
       int sayi2 = 7;                       //0000 0111
       int VE = sayi1 & sayi2;              //0000 0100 –>;sonuç = 4
       System.out.println(VE);
       // Or Operatörü(|) : 2’lik sayı sistemine çevirir, VEYA işlemi yapıp, döndürür.
       int sayi3 =4;                        //0000 0100
       int sayi4 =7;                        //0000 0111
       int VEYA = sayi3 | sayi4;            //0000 0111 –>sonuç = 7
       System.out.println(VEYA);
       // Xor Operatörü(^) : 2’lik sayı sistemine çevirir 
       // XOR işlemini yapar,sonucuda döndürür.
       int sayi5 =4;                        //0000 0100
       int sayi6 =7;                        //0000 0111
       int OZELVEYA = sayi5 ^ sayi6;        //0000 0011 –>sonuç = 3
       System.out.println(OZELVEYA);
       // Tamamlama(Complement) Operatörü degerleri 2’lik sayı sistemine çevirir
       // ve biti 0 olanı 1 yapar,1 olanı da 0 yapar ve sonucuda döndürür.
       int sayi7 = 4;
       System.out.println(~sayi7);          //-5 En Soldaki işaret biti
       //Kaydırma Operatörü degerleri 2’lik sayı sistemine çevirir,
       //ve istenildigi kadarıyla saga veya sola kaydırılır.
       int KAYDiRMA = 4;                       //0000 0100
       System.out.println(KAYDiRMA >> 1);      //0000 0010 –>sonuç = 2
       System.out.println(KAYDiRMA << 4);      //0100 0000 –>sonuç = 64
    }
    
}
