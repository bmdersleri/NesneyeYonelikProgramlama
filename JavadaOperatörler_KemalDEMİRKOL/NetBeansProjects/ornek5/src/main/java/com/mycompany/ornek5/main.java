package com.mycompany.ornek5;
public class main {
    public static void main(String[] args) {
        //5. Örnek Artırma ve Azaltma Operatör Uygulama Örneği :
        int a=10, b=15;
        int c=3,d=8;
                a++;
                b--;
                --c;
                ++d;
        System.out.println(" a="+a +" \n b="+b+"\n c="+c+"\n d="+d);
        int toplamSonuc = ++a + b--;
        System. out. println("Toplama işlemi sonucu :"+ toplamSonuc);
        System. out. println("b= :"+b);
    }
    
}
