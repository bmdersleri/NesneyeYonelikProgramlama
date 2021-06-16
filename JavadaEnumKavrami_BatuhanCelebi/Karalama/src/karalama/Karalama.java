package karalama;

public class Karalama
{
    
enum Aylar
{
OCAK(31),ŞUBAT(28),MART(31),NİSAN(30),MAYIS(31),HAZİRAN(30),TEMMUZ(31)
,AĞUSTOS(31),EYLÜL(30),EKİM(31),KASIM(30),ARALIK(31);  //nesnelerimizi tanımlıyoruz
/* son değere noktalı virgül koyacağız çünkü altta constructor belirleyeceğiz.
 Şimdi ayların içine kaç gün olduklarını yazalım bunu da integer ile yapalım.
*/
int gun;
Aylar(int gun)//oluşturduğumuz gün değişkenini buraya -constructor- gönderiyoruz.
{
    this.gun = gun; /*üstteki her bir ayın elemanlarımız olduğunu söyledik ve iki gun değişkenini birbirine eşitledik
     şimdi Ayların parametresindeki gun değişkenini yani integerı elemanlarımızın da parametresine yazmalıyız.*/
}
} 
    public static void main(String[] args) 
{
    System.out.println(java.util.Arrays.asList(Aylar.values())); //tüm elemanlarımızı ekrana yazdırıyoruz. 
    System.out.println(Aylar.MART.gun);//Martın kaç gün olduğunu ekrana yazdıracak
    System.out.print(Aylar.MART + " \n"); //Mart Elemanının ismi.
}   
}
