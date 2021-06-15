/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dızı;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Sena Özkara
 */

    // Tek Boyutlu Diziler Uygulama Örneği-2
    class Student
        {
             public int no;
             public String isim;
             Student(int no ,  String isim)
             {
                 this.no=no;
                 this.isim=isim;

             }
        }
public class Dızı 
{    
    /**
     * @param arg the command line arguments
     */
    public static void main(String[] args)
    {
        
      // Tek Boyutlu Diziler Uygulama Örneği-1
      int array[];
      array = new int[5];
      array[0]=10;
      array[1]=20;
      array[2]=30;
      array[3]=40;
      array[4]=50;
      System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-1****************************** \n" );  
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println("index" + " " +  i  +  ":" + " " + array[1]);  
        }  
      System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-1****************************** \n" );  
    

      
      
      
       // Tek Boyutlu Diziler Uygulama Örneği-2
       
       Student[] dizi;
       dizi=new Student [5];
       dizi[0] = new Student(1,"İsmet");
       dizi[1]=new Student(2,"Aybüke");
       dizi[2]=new Student(3,"Halil");
       dizi[3]=new Student(4,"Alya");
       dizi[4]=new Student(5,"Elif");
       System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-2****************************** \n" );  
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.println( i + " " + "öğesinde"+ ": " + dizi[i].no + " " + dizi[i].isim );
        }
       System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-2****************************** \n" );  
        
       
       
       
        System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-3****************************** \n" ); 
       // Tek Boyutlu Diziler Uygulama Örneği – 3 (For - each loop)
       int array2[]={33,3,4,5};
       for(int i: array2)
            System.out.println(i);
       System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-3****************************** \n" ); 
       
       
       
       
       
        System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-4****************************** \n" ); 
       //Tek Boyutlu Diziler Uygulama Örneği – 4 ( IntStream.range() )
       
        int[] intarray = IntStream.range( 1 , 11).toArray();
        System.out.println(Arrays.toString(intarray));
        System.out.println("\n **********************Tek Boyutlu Diziler Uygulama Örneği-4****************************** \n" ); 
    }
    
}
