package com.mycompany.ornek2;
public class main {
    public static void main(String[] args) {
        //2. Örnek Aritmatiksel Bitişik Atama Operatörleri Örneği :
        int x = 5;
        int y = 4;
        System.out.format("x= %d ve y = %d ise x +=y = %d %n", x, y, x += y);
        System.out.format("x= %d ve y = %d ise x -=y = %d %n", x, y, x -= y);
        System.out.format("x= %d ve y = %d ise x *=y = %d %n", x, y, x *= y);
        System.out.format("x= %d ve y = %d ise x /=y = %d %n", x, y, x /= y);
        System.out.format("x= %d ve y = %d ise x mod=y = %d %n", x, y, x %= y);
    }
    
}
