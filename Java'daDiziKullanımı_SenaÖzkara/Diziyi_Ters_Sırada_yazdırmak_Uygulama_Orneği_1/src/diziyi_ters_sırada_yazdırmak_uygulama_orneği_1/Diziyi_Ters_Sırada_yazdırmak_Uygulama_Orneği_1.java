/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziyi_ters_sırada_yazdırmak_uygulama_orneği_1;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class Diziyi_Ters_Sırada_yazdırmak_Uygulama_Orneği_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       System.out.println("\n ********************** Diziyi Ters Sırada yazdırmak Uygulama Örneği-1 ****************************** \n" );

         int [] orjinaldizi = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Orjinal Dizi: ");  
        for (int i = 0; i < orjinaldizi.length; i++)
        {  
            System.out.print(orjinaldizi[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Ters sıralamış dizi: ");  
       // Dizide ters sırada döngü yapın
        for (int i = orjinaldizi.length-1; i >= 0; i--) 
        {  
            System.out.print(orjinaldizi[i] + " ");  
        }  
        System.out.println("\n ********************** Diziyi Ters Sırada yazdırmak Uygulama Örneği-1 ****************************** \n" );

    }
    
}
