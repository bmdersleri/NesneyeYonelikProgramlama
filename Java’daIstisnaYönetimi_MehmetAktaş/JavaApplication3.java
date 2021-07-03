package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

    public static void main(String[] args) {
        System.out.println("Uygulama Basladi");
        int a=0;
        int b;
        Scanner scan = new Scanner (System.in);
        try{
            //a= 5/0;
            b = scan.nextInt();
        } catch (ArithmeticException e){
            System.out.println("0'a bolunme hatasi");
            System.out.println(e.getMessage());
        } catch (Exception er){
            System.out.println("#bir hata var#");
            System.out.println(er.toString());
        } finally {
            System.out.println("HER ZAMAN CALISIR");
        }
        
        System.out.println("Uygulama Bitti");
    }
    
}
