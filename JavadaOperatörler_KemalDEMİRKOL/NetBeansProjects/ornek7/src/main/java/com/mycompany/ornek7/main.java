package com.mycompany.ornek7;
public class main {
    public static void main(String[] args) {
        //7. Örnek Mantıksal Operatörler Uygulama Örneği:
        int sayi1 = 45;
        int sayi2 = 10;
        int sayi3 = 44;
        System. out. println("sayi1 > 44 && sayi2 == 10 : " + (sayi1 > 44 && sayi2 == 10));
        System. out. println("sayi1 > 44 && sayi2 != 10 : " + (sayi1 > 44 && sayi2 != 10));
        System. out. println("sayi1 > 44 && sayi2 == 10 && sayi3 < 20 : " + ((sayi1 > 44 && sayi2==10) && sayi3 < 20));
        System. out. println("sayi1 > 44 || sayi2 == 10 : " + (sayi1 > 44 || sayi2 == 10));
        System. out. println("sayi1 > 44 || sayi2 != 10 : " + (sayi1 > 44 || sayi2 != 10));
        System. out. println("(sayi1 > 44 && sayi2 == 10) || sayi3 < 45 : " + ((sayi1 > 43 && sayi2==10) || sayi3 < 45));
    }
    
}
