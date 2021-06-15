/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dızıyımetodagecırmeornek1_2;

/**
 *
 * @author Sena Özkara
 */
public class DızıyıMetodaGecırmeOrnek1_2 {

    /**
     * @param args the command line arguments
     */
    
    //Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -1
    public static float ortalama (int[] a )
    {
        float toplam= 0;
        for (int i = 0; i < a.length; i++)
        {
            toplam = toplam +a[i];
        }
        return toplam/a.length;
    }
    
    
     //Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -2
     
    public static int [] arttir(int baslangic)
    {
      int elemansayisi=((100- baslangic)/2)+1;  
      int [] dizi = new int [elemansayisi];
        for (int i=baslangic, j=0;i<=100; i+=2, j++ ) 
        {
            dizi[j]=i;
        }
        return dizi;
    }
    
    
    
    public static void main(String[] args) 
    {
     
       System.out.println("\n ********************** Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -1 ****************************** \n" );       int []  dersNotlarim = {75,90,40};
      float ortalamam = ortalama(dersNotlarim);
       System.out.println("Ortalamam : " + ortalamam);
       System.out.println("\n ********************** Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -1 ****************************** \n" ); 
    
    
    //Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -2
    
    
    int [] sayilarim = arttir(52);
     System.out.println("\n ********************** Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -2 ****************************** \n" ); 
        for (int q = 0; q < sayilarim.length; q++) 
        {
            System.out.print(sayilarim[q]+"-"); 
            
        }
         System.out.println("\n ********************** Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -2 ****************************** \n" ); 

    }
    
}
