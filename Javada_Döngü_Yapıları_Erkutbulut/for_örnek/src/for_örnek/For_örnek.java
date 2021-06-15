package for_örnek;

import java.util.Scanner;

public class For_örnek {
       
    public static void main(String[] args) {
        
        //Yarım üçgen
        /*
            *
            **
            ***
            ****
            ******
        */
        Scanner scan = new Scanner(System.in);
        
        int sayi1;
        
        System.out.println("Üçgenin satır sayısı : ");
        sayi1 = scan.nextInt();
        
        for (int i = 1; i <= sayi1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Tam Üçgen
        /* 
            *
           ***
          *****
         *******
        *********
        */
             
        Scanner input = new Scanner(System.in);
        int sayi;
        
        System.out.println("Ücgenin satır sayisi: ");
        sayi = input.nextInt();
                  
        for (int i = 1; i <= sayi; i++) {
            
            for (int j = 0; j < sayi-i; j++) {
                
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
    