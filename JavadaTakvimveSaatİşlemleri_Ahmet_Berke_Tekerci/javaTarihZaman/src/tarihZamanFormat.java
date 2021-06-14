import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;  
public class tarihZamanFormat {  
  public static void main(String[] args) {  
   DateTimeFormatter tarihZamanFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
   // Şimdiki Bölgesel Zamman verdiğimiz saat dilimini esas alır.
   LocalDateTime simdikiBolgeselZaman = LocalDateTime.now(ZoneId.of("GMT+02:30"));
   System.out.println(tarihZamanFormat.format(simdikiBolgeselZaman));
   // Yeni bir tarih oluşturma fakat Date kullanımında eğer sayısal bir atama yapıyorsak 
   // tarihin 1900den ayın 0 dan başladığınız unutmamak gerek.
   Date tarihDate = new Date(121, 5, 13, 16, 5, 0);
   LocalDateTime yerelLocalDateTime =LocalDateTime.now();
   
   // Belirlediğimiz formatta LLLL ayı ifade ediyor farklı kullanımları da mevcut örn: LLL gibi.
   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/LLLL/yyyy");
   DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/LLL/yyyy");

   System.out.println(simpleDateFormat.format(tarihDate));
   System.out.println(dateTimeFormatter.format(yerelLocalDateTime));
  }  
}  