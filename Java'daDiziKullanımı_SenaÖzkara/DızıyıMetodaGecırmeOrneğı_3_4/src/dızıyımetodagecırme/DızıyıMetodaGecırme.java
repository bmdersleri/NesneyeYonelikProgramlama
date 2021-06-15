/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dızıyımetodagecırme;

import static dızıyımetodagecırme.Testarray.min;
import java.util.Random;

/**
 *
 * @author Sena Özkara
 */
class Testarray {

    static void min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        System.out.println("*****************Diziyi metoda geçirme uygulama örneği-3*************");

        System.out.println(min);
    }
}

public class DızıyıMetodaGecırme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Diziyi metoda geçirme uygulama örneği-3

        int a[] = {33, 3, 4, 5};
        min(a);
        
        
        
        //Diziyi metoda geçirme uygulama örneği-4
        System.out.println("*****************Diziyi metoda geçirme uygulama örneği-4*************");
        int[] dizi = new int[10];
        for (int i = 0; i < 10; i++) {
            Random rastgele = new Random();
            int sayi = rastgele.nextInt(100) + 1;
            dizi[i] = sayi;
        }
        for (int k = 1; k < 10; k++) {
            int gecici;
            for (int j = 0; j < 10 - k; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    gecici = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = gecici;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                System.out.print(dizi[i] + " - ");
            } else {
                System.out.print(dizi[i]);
            }
        }
        
    }

}
