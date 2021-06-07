
package javadadegiskenler;

import java.util.Scanner;

public class JavadaDegiskenler {

   
    public static void main(String[] args) {
         /*Değişken tanımlama örnekleri */
        int a = 5;
        float b = 7f;
        char c = 'E';
        boolean d = true;
        String e = "kerem";

        /*Değişkenimizin Max ve Min değerlerini bulma */
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("Max:" + maxFloat);
        System.out.println("Min:" + minFloat);

        /* int 2 değeri toplama işlemi */
        int sayi = 5;
        int sayi2 = 10;
        System.out.println("Toplam: " + (sayi + sayi2));

        /* String 2 değeri toplama işlemi */
        String name = "Elif";
        String Name = "Ahsen";
        System.out.println("Sonuç:" + (name + Name));

        /* Float 2 sayının çarpımını bulma */
        float sayi3 = 5f;
        float sayi4 = 7F;
        System.out.println("Çarpım" + (sayi3 * sayi4));

        /* Bölünen ve böleni vererek bolum ve kalan bulma*/
        int sayi5 = 65, bolen = 4;
        int bolum = sayi5 / bolen;
        int kalan = sayi5 % bolen;

        System.out.println("Bölüm:" + bolum);
        System.out.println("Kalan:" + kalan);

        /*Yarıçapını kullanıcının girdiği çemberin alanını hesaplama */
        Scanner girdi = new Scanner(System.in);
        final double PI = 3.14;
        double yarıcap, alan;

        System.out.println("Yarıçapı giriniz:");
        yarıcap = girdi.nextDouble();

        alan = PI * yarıcap * yarıcap;

        System.out.println("Alan:" + alan); 
        
        /* Kullanıcıdan 3 basamaklı sayı alıp basamak değerlerine ayırarak toplama */
        Scanner grd = new Scanner(System.in);
        int birler, onlar, yuzler;

        System.out.println("3 basamaklı sayı giriniz:");
        int sayi6 = grd.nextInt();

        yuzler = sayi6 / 100;

        sayi6 = sayi6 - (yuzler * 100);

        onlar = sayi6 / 10;

        sayi6 = sayi6 - (onlar * 10);

        birler = sayi6;

        System.out.println("Yüzler:" + yuzler);
        System.out.println("Onlar:" + onlar);
        System.out.println("Birler:" + birler);

        System.out.println("Toplam:" + (birler + onlar + yuzler));
    }
    
}
