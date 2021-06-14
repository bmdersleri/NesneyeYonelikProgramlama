import java.util.Calendar;
import java.util.GregorianCalendar;

public class takvimOrnegi {

    public static void main(String args[]) {
        int gun, ay, yil;
        int saniye, dakika, saat;
        GregorianCalendar tarih = new GregorianCalendar();
        
        // Takvimlerle işlem yaparken takvim üzerinden yapmak gerekir.
        gun = tarih.get(Calendar.DAY_OF_MONTH);
        ay = tarih.get(Calendar.MONTH);
        yil = tarih.get(Calendar.YEAR);

        saniye = tarih.get(Calendar.SECOND);
        dakika = tarih.get(Calendar.MINUTE);
        saat = tarih.get(Calendar.HOUR);

        // Java Calendar sınıfında aylar 0 dan index alır o yüzden ay'a bir ekledik
        System.out.println("Tarih  " + gun + "/" + (ay + 1) + "/" + yil);
        System.out.println("Saat:  " + saat + " : " + dakika + " : " + saniye);

        // Yazdırırken dikkat etmek gerek çünkü değerlerimiz integere atamış
        System.out.println("Tarih  " + (gun + 30) + "/" + (ay + 1) + "/" + yil);

    }
}
