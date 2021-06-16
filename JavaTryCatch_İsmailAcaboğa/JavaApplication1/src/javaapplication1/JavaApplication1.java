/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author acaboga
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        
        
        
        /*
        -----------------------------------------------------------------------------
                        Try Catch Exception Örnekleri
        -----------------------------------------------------------------------------    
        
        
        
        try{
            String str="BMDersleri";
            System.out.println(str.length());
            char c= str.charAt(0);
            c= str.charAt(80);
            System.out.println(c);           
        }catch(StringIndexOutOfBoundsException e ){
                    System.out.println("string index istisnasi yakalandi");
                    System.err.println(e.getMessage());
                }
        
        
        -----------------------------------------------------------------------------
                        Try Catch Exception Örnekleri
        -----------------------------------------------------------------------------    
        
        
        
        try{
        int num1=30, num2=0;
        int output=num1/num2;
        System.out.println ("Sonuc: "+output);
                       
        }catch(ArithmeticException e ){
                    System.out.println(e.getMessage());
                }
        
        
         

        -----------------------------------------------------------------------------
                        Try Catch Exception Örnekleri
        -----------------------------------------------------------------------------    
        
        
        
        try{
        int a[]= new int[10];
        // Array has only 10 elements
        a[11]=9;                              
        }
        catch(ArrayIndexOutOfBoundsException e ){
                    System.out.println("ArrayIndexOutOfBoundsException");
                }
        
        
         
 
        -----------------------------------------------------------------------------
                        iç içe try catch örnekleri
        -----------------------------------------------------------------------------
        
        try {
            try {
                try {
                    int arr[]= {1,2,3,4};
                        // burada dizi tanımladık değerlerini atandı.
                    System.out.print(arr[10]);
                }
                //3. try için catch bloğu
                catch(ArithmeticException e ){
                    System.out.print("3.try icinde aritmetik istisnasi yakalandi");
                    System.err.println(e.getMessage());
                }
            }
            //2. try için catch bloğu
            catch(ArrayIndexOutOfBoundsException e2 ){
                System.out.println("2.try icinde aritmetik istisnasi yakalandi");
                System.err.println(e2.getMessage());
            }
        }
        //ilk try için catch bloğu
        catch(ArithmeticException e3 ){
            System.out.print("ilk try icinde aritmetik istisnasi yakalandi");
            System.err.println(e3.getMessage());
        }

        //ilk try için catch bloğu
        catch(ArrayIndexOutOfBoundsException e4 ){
            System.out.println("ilk try icinde Dizi index istisnasi yakalandi");
            System.err.println(e4.getMessage());
        }
        //ilk try için catch bloğu
        catch(Exception e5 ){
            System.out.print("ilk try icinde istisna yakalandi");
            System.err.println(e5.getMessage());
        }
        
*/
                           
    }
    
}
