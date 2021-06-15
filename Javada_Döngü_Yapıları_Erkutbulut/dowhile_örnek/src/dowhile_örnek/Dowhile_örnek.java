package dowhile_örnek;

import java.util.Scanner;

public class Dowhile_örnek {

        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi Giriniz: ");
        int sayi = input.nextInt();
        
        do {
            System.out.println(sayi);
            sayi++;
            
        } while (sayi <= 10);
    }
}
