import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class javaTime {
    public static void main(String[] args) {

        Time saatSQL = Time.valueOf(LocalTime.now());
        System.out.println("Şimdiki Saat SQL:" + saatSQL);
        
        LocalTime saatLocalTime =LocalTime.now();
        System.out.println("Şimdiki Saat :" + saatLocalTime);
        
        
        // Time paketi kullanılarak anlık saati alma
        ZonedDateTime bolgeselZaman = ZonedDateTime.now();
        // Bölgesel Zaman
        System.out.println("Bölgesel Zaman :" + bolgeselZaman);
        // Şuanki tarih
        LocalDate simdikiTarihZaman = LocalDate.now();
        
        System.out.println("Şimdiki Zaman :" + simdikiTarihZaman);
        System.out.println("Hangi yıldayız  :" + simdikiTarihZaman.getYear());
        System.out.println("Yılı Kendimiz seçersek :" + simdikiTarihZaman.withYear(2032));
        System.out.println("Yılın Kaçıncı Günü :" + simdikiTarihZaman.getDayOfYear());
        System.out.println("60 Gün Sonra :" + simdikiTarihZaman.plusDays(60));
        // Belirli bir formatta tarih zaman
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Format:  " + simdikiTarihZaman.format(format));
        // 2022-04-16
        LocalDate zaman = LocalDate.of(2022, Month.NOVEMBER, 2);
        System.out.println(zaman);

        // 2018 yılının 10. gününü verir. (2018-01-01)
        LocalDate hangiZaman = LocalDate.ofYearDay(2018, 10);
        System.out.println(hangiZaman);
    }
}
