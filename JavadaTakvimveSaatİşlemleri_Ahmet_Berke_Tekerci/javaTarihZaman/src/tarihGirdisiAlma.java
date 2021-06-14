import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class tarihGirdisiAlma {
 
    public static void main(String[] args) throws ParseException {
        // Bir tarih objesi oluşturmak.
        Date tarih=null;
        // İnput giriş verisi alıp tarihGirdisi ne atıyoruz. 
        Scanner tarihGirdisi = new Scanner(System.in);
        //Daha sonra bir tarih formatı belirliyoruz.
        SimpleDateFormat tarihFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Tarihi şu şekilde girin (gg/aa/yyyy):");
        String giris = tarihGirdisi.nextLine();
        // Girdiğizi tarih eğer istediğimiz formatta mı sorgusunu yapıp tarih olarak atıyoruz.
        if(null != giris && giris.trim().length() > 0){
             tarih = tarihFormat.parse(giris);
        }
        tarihGirdisi.close();
        // Girilen tarihi istediğimiz formatta yazdırıyoruz
        System.out.print("Girilen Tarih : " + tarihFormat.format(tarih));
    }
}