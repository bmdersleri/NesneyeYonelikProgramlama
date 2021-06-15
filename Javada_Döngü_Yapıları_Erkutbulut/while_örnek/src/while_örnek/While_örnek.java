package while_örnek;

import java.util.Scanner;

public class While_örnek {

       public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int sayi1, sayi2, sonuc=1;
        
        System.out.println("Üssü alınacak sayi: ");
        sayi1 = input.nextInt();
        
        System.out.println("Üs olacak sayi: ");
        sayi2= input.nextInt();
        
        int i = 1;
        
        while(i<=sayi2){
            
            sonuc = sonuc * sayi1;
            i++;
        }
        System.out.println("Sonuc: " + sonuc);
        
    }
    
}
