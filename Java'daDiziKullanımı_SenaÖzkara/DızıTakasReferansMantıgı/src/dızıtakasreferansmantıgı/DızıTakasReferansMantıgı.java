/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dızıtakasreferansmantıgı;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Sena Özkara
 */
public class DızıTakasReferansMantıgı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int[] dizi1 = {10,20,30};
        int[] dizi2 = dizi1;
        dizi1[0] = 1000;
        System.out.println("\n ********************** Dizilerde Takas ve Referans Mantığı Örnek Uygulama-1  ****************************** \n" ); 
        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(dizi2));
        System.out.println("\n ********************** Dizilerde Takas ve Referans Mantığı Örnek Uygulama-1  ****************************** \n" ); 

        
        
         System.out.println("\n ********************** Dizilerde Takas ve Referans Mantığı Örnek Uygulama-2  ****************************** \n" ); 
         int[] dizi = new int[10];
        for(int i=0; i<10; i++) 
        {
	Random rastgele = new Random();
	int sayi = rastgele.nextInt(100)+1;
	dizi[i] = sayi;
        }
        for(int k=1; k<10; k++) {
	int gecici;
	for(int j=0; j<10-k; j++) {
		if(dizi[j] > dizi[j+1]) {
			gecici = dizi[j];
			dizi[j] = dizi[j+1];
			dizi[j+1] = gecici;
		}
	}
}

        for(int m=0; m<10; m++) {
	if(m != 9) {
		System.out.print(dizi[m]+" - ");
	} else {
		System.out.print(dizi[m]);
	}
}
         System.out.println("\n ********************** Dizilerde Takas ve Referans Mantığı Örnek Uygulama-2  ****************************** \n" ); 

    }
    
}
