package com.mycompany.ornek6;
public class main {
    public static void main(String[] args) {
        //6. Örnek Karşılaştırma Operatörleri Uygulama Örneği :
        int sayi1 = 44;
        int sayi2 = 45;
        int sayi3 = 44;

        //Büyük olması durumu karşılaştırması:
        System. out. println("Değerler büyükmü:");
        System. out. println("sayi1 > sayi2 = " + (sayi1 > sayi2));
        //false-sayi1,sayi2 den kücüktür.
        System. out. println("sayi1 > sayi3 = " + (sayi1 > sayi3));
        //false-sayi1,sayi2 ye eşit
        System. out. println("sayi2 > sayi3 = " + (sayi2 > sayi3));
        //true-sayi2 büyüktür

        //Kücük olması durumu karşılaştırması:
        System. out. println("Değerler küçükmü:");
        System. out. println("sayi1 < sayi2 = " + (sayi1 < sayi2));
        //true-sayi1,sayi2 den kücüktür.
        System. out. println("sayi1 < sayi3 = " + (sayi1 < sayi3));
        //false-sayi1,sayi2 ye eşit
        System. out. println("sayi2 < sayi3 = " + (sayi2 < sayi3));
        //false-sayi2 büyüktür

        //Büyüktür veya eşittir durumu karşılaştırması:
        System. out. println("Değerler büyük veya eşitmi:");
        System. out. println("sayi1 >= sayi2 = " + (sayi1 >= sayi2));
        //false-sayi1,sayi2 den kücüktür.
        System. out. println("sayi1 >= sayi3 = " + (sayi1 >= sayi3));
        //true-sayi1,sayi2 ye eşit
        System. out. println("sayi2 >= sayi3 = " + (sayi2 >= sayi3));
        //true-sayi2 büyüktür
        //Küçüktür veya eşittir durumu karşılaştırması:
        System. out. println("Değerler kücük veya eşitmi:");
        System. out. println("sayi1 <= sayi2 = " + (sayi1 <= sayi2));
        //true-sayi1,sayi2 den kücüktür.
        System. out. println("sayi1 <= sayi3 = " + (sayi1 <= sayi3));
        //true-sayi1,sayi2 ye eşit
        System. out. println("sayi2 <= sayi3 = " + (sayi2 <= sayi3));
        //false-sayi2 büyüktür
        //Eşittir durumu karşılaştırması:
        System. out. println("Değerler eşitmi:");
        System. out. println("sayi1 == sayi2 = " + (sayi1 == sayi2));
        //false-sayi1,sayi2 den kücüktür.
        System. out. println("sayi1 == sayi3 = " + (sayi1 == sayi3));
        //true-sayi1,sayi2 ye eşit
        System. out. println("sayi2 == sayi3 = " + (sayi2 == sayi3));
        //false-sayi2 büyüktür
        //Eşit değil durumu karşılaştırması:
        System. out. println("Değerler eşit değilmi:");
        System. out. println("sayi1 != sayi2 = " + (sayi1 != sayi2));
        //true-sayi1,sayi2 den kücüktür.
        System. out. println("sayi1 != sayi3 = " + (sayi1 != sayi3));
        //false-sayi1,sayi2 ye eşit
        System. out. println("sayi2 != sayi3 = " + (sayi2 != sayi3));
        //true-sayi2 büyüktür
    }
    
}
