import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class yerelTarihZaman {  
  public static void main(String[] args) {  
  
    // Belirli bir zaman dilimi üzerinde çalışmak
    LocalDate date =LocalDate.now(ZoneId.of("GMT+3"));
    LocalDateTime yerelTarihZaman = LocalDateTime.now(ZoneId.of("GMT+3"));
    
    System.out.println(date);
    System.out.println(yerelTarihZaman);
  }  
}  