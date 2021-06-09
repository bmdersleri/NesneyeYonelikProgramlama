package com.mycompany.ornek1;
public class main {
    public static void main(String[] args) {
        //1. Örnek Aritmatik Operatörler Uygulama Örneği :       
        // Değişken Tanımlaması:
        int a=25,b=3,c=17;
        String x="Aritmatik: ",y="İşlemler";
        // Stringlerde Ekleme Operatörünü Kullanırsak:
        System.out.println("Merhaba!\n"+(x+y));
        // Ekleme ve Çıkarma Operatörleri:
        System.out.println("A + B = "+ (a+b)+"\nA - C = "+(a-c));
        // Çarpma ve Bölme Operatörleri:
        System.out.println("A * B = "+ (a*b)+"\nA / 5 = "+(a/5));
        // Mod Alma Operatörü:
        System.out.println("C % B = "+(c%b));
    }
}
