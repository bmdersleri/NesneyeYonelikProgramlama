/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cok_boyutlu_dızıler;

/**
 *
 * @author Sena Özkara
 */
public class Cok_boyutlu_dızıler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("\n ********************** Çok boyutlu Dizi Uygulama Örneği-1 ****************************** \n" ); 

        //Çok boyutlu Dizi Uygulama Örneği-1
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++)
        {
        System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
        }
         System.out.println("\n ********************** Çok boyutlu Dizi Uygulama Örneği-1 ****************************** \n" ); 

         
         
        System.out.println("\n ********************** Javada_Iki_matris_eklenmesi_ve_toplanması_Uygulama_Orneği ****************************** \n" ); 

         //Javada_Iki_matris_eklenmesi_ve_toplanması_Uygulama_Orneği
         int a[][]={{1,3,4},{3,4,5}};  
        int b[][]={{1,3,4},{3,4,5}};  

        
        int c[][]=new int[2][3];  

      
        for(int i=0;i<2;i++)
        {  
        for(int j=0;j<3;j++)
        {  
        c[i][j]=a[i][j]+b[i][j];  
        System.out.print(c[i][j]+" ");  
        }  
        System.out.println();
         
    }
            System.out.println("\n ********************** Javada_Iki_matris_eklenmesi_ve_toplanması_Uygulama_Orneği ****************************** \n" ); 

            
           System.out.println("\n ********************** Pürüzlü_Dizi_Uygulama_Orneği ****************************** \n" ); 

            //tek sütunla bir diziyi başlatma
        int array[][]=new int[3][];
        array[0]=new int[3];
        array[1]=new int[4];
        array[2]=new int[2];
        //pürüzlü bir diziyi başlatma
        int count=0;
       for(int i=0;i<array.length;i++)
         for(int j=0;j<array[i].length;j++)
          array[i][j]=count++;
        
        //pürüzlü bir dizinin verilerini yazdırma
        for(int i=0;i<array.length;i++)
            for(int j=0; j<array[i].length;j++)
            {
            System.out.print(array[i][j]+" ");
            }
            System.out.println();
         
           System.out.println("\n ********************** Pürüzlü_Dizi_Uygulama_Orneği ****************************** \n" ); 

    }
}
