import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class tarihKullanimi {

    public static void main(String args[]) {
        
        Calendar takvim = Calendar.getInstance();
        System.out.println(takvim.toString());
        System.out.println(takvim.getTimeZone());
        takvim.add(Calendar.DAY_OF_MONTH, 5);
        
        System.out.println("5 Gün eklenirse : " + takvim.getTime());
        takvim.add(Calendar.YEAR, 10);
        System.out.println("10 yıl daha eklenirse : " + takvim.getTime());
        
        // Yeni tarih objesi oluşturma
        Date tarih = new Date();

        // toString() kullanarak saat ve tarihi yazdırma
        System.out.println(tarih.toString());
        // Unix Timestamp, 1 Ocak 1970 den bu yana geçen saniye sayısına denilen veri
        // tipi
        System.out.println("Timestamp : " + tarih.getTime());

        // SimpleDateFormat ile bir tarih saat formatı belirleme.
        SimpleDateFormat tarihFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(tarihFormat.format(tarih));

        // Bir diğer format saati
        SimpleDateFormat saatFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(saatFormat.format(tarih));
        
        Calendar takvim2 = Calendar.getInstance();
        if( 0 == takvim2.compareTo(takvim)){
            System.out.println("takvimler aynı");
        }else{
            System.out.println("takvimler farklı");
        };
    }
}