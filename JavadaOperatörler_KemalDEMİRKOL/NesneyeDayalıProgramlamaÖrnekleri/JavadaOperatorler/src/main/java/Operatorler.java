
public class Operatorler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        //1. Örnek Aritmatik Operatörler Uygulama Örneği :       
// Değişken Tanımlaması:
int a=25,b=3,c=17;
String x="Aritmatik: ",y="İşlemler";
// Stringlerde Ekleme Operatörünü Kullanırsak:
System.out.println("Merhaba!\n"+(x+y));
// Ekleme ve Çıkarma Operatörleri:
System.out.println("A + B = "+ (a+b)+"\nA - C = "+(a-c));
// Çarpma ve Bölme Operatörleri:
System.out.println("A * B = "+ (a*b)+"\nA / 5 = "+(a/5));
// Mod Alma Operatörü:
System.out.println("C % B = "+(c%b));

/*

             //2. Örnek Aritmatiksel Bitişik Atama Operatörleri Örneği :
 int x = 5;
 int y = 4;
 System.out.format("x= %d ve y = %d ise x +=y = %d %n", x, y,
 x += y);
 System.out.format("x= %d ve y = %d ise x -=y = %d %n", x, y,
 x -= y);
 System.out.format("x= %d ve y = %d ise x *=y = %d %n", x, y,
 x *= y);
 System.out.format("x= %d ve y = %d ise x /=y = %d %n", x, y,
 x /= y);
 System.out.format("x= %d ve y = %d ise x mod=y = %d %n", x, y,
 x %= y);
*/
/*



        //3. Örnek Aritmatiksel Operatörlerde Sıfıra Bölme Hatası Örneği :
int sayiA = 44;
int sayiB = 0; //buraya dikkat
int bolmeSonuc = sayiA / sayiB; //HATA
*/
/*


        //4. Örnek Aritmatiksel Metin Birleştirme Örneği :
String mesaj1 = "Merhaba ";
String mesaj2 = "Java dünyası";
mesaj1 = mesaj1 + mesaj2; //buraya dikkat
System. out. print(mesaj1);
*/
/*


        //5. Örnek Artırma ve Azaltma Operatör Uygulama Örneği :
int a=10, b=15;
int c=3,d=8;
        a++;
        b--;
        --c;
        ++d;
System.out.println(" a="+a +" \n b="+b+"\n c="+c+"\n d="+d);
int toplamSonuc = ++a + b--;
System. out. println("Toplama işlemi sonucu :"+ toplamSonuc);
System. out. println("b= :"+b);
*/
/*


        //6. Örnek Karşılaştırma Operatörleri Uygulama Örneği :
int sayi1 = 44;
int sayi2 = 45;
int sayi3 = 44;
	
//Büyük olması durumu karşılaştırması:
System. out. println("Değerler büyükmü:");
System. out. println("sayi1 > sayi2 = " + (sayi1 > sayi2));
//false-sayi1,sayi2 den kücüktür.
System. out. println("sayi1 > sayi3 = " + (sayi1 > sayi3));
//false-sayi1,sayi2 ye eşit
System. out. println("sayi2 > sayi3 = " + (sayi2 > sayi3));
//true-sayi2 büyüktür

//Kücük olması durumu karşılaştırması:
System. out. println("Değerler küçükmü:");
System. out. println("sayi1 < sayi2 = " + (sayi1 < sayi2));
//true-sayi1,sayi2 den kücüktür.
System. out. println("sayi1 < sayi3 = " + (sayi1 < sayi3));
//false-sayi1,sayi2 ye eşit
System. out. println("sayi2 < sayi3 = " + (sayi2 < sayi3));
//false-sayi2 büyüktür

//Büyüktür veya eşittir durumu karşılaştırması:
System. out. println("Değerler büyük veya eşitmi:");
System. out. println("sayi1 >= sayi2 = " + (sayi1 >= sayi2));
//false-sayi1,sayi2 den kücüktür.
System. out. println("sayi1 >= sayi3 = " + (sayi1 >= sayi3));
//true-sayi1,sayi2 ye eşit
System. out. println("sayi2 >= sayi3 = " + (sayi2 >= sayi3));
//true-sayi2 büyüktür
//Küçüktür veya eşittir durumu karşılaştırması:
System. out. println("Değerler kücük veya eşitmi:");
System. out. println("sayi1 <= sayi2 = " + (sayi1 <= sayi2));
//true-sayi1,sayi2 den kücüktür.
System. out. println("sayi1 <= sayi3 = " + (sayi1 <= sayi3));
//true-sayi1,sayi2 ye eşit
System. out. println("sayi2 <= sayi3 = " + (sayi2 <= sayi3));
//false-sayi2 büyüktür
//Eşittir durumu karşılaştırması:
System. out. println("Değerler eşitmi:");
System. out. println("sayi1 == sayi2 = " + (sayi1 == sayi2));
//false-sayi1,sayi2 den kücüktür.
System. out. println("sayi1 == sayi3 = " + (sayi1 == sayi3));
//true-sayi1,sayi2 ye eşit
System. out. println("sayi2 == sayi3 = " + (sayi2 == sayi3));
//false-sayi2 büyüktür
//Eşit değil durumu karşılaştırması:
System. out. println("Değerler eşit değilmi:");
System. out. println("sayi1 != sayi2 = " + (sayi1 != sayi2));
//true-sayi1,sayi2 den kücüktür.
System. out. println("sayi1 != sayi3 = " + (sayi1 != sayi3));
//false-sayi1,sayi2 ye eşit
System. out. println("sayi2 != sayi3 = " + (sayi2 != sayi3));
//true-sayi2 büyüktür
*/
/*


        //7. Örnek Mantıksal Operatörler Uygulama Örneği:

int sayi1 = 45;
int sayi2 = 10;
int sayi3 = 44;
System. out. println("sayi1 > 44 && sayi2 == 10 : " + (sayi1 > 44
&& sayi2 == 10));
System. out. println("sayi1 > 44 && sayi2 != 10 : " + (sayi1 > 44
&& sayi2 != 10));
System. out. println("sayi1 > 44 && sayi2 == 10 && sayi3 < 20 : " +
((sayi1 > 44 && sayi2==10) && sayi3 < 20));
System. out. println("sayi1 > 44 || sayi2 == 10 : " + (sayi1 > 44
|| sayi2 == 10));
System. out. println("sayi1 > 44 || sayi2 != 10 : " + (sayi1 > 44
|| sayi2 != 10));
System. out. println("(sayi1 > 44 && sayi2 == 10) || sayi3 < 45 : "
+ ((sayi1 > 43 && sayi2==10) || sayi3 < 45));
*/
/*

        //8. Örnek Bit Düzeyinde Operatörler Uygulama Örneği:

 //0 ile 1'in ve yada veya işlemleri
 System.out.println("0 & 1 sonucu: "+ (0 & 1));
 System.out.println("0 | 1 sonucu: "+ (0 | 1));
// And Operatörü(&) : 2’lik sayı sistemine çevirir,VE işlemi yapıp, döndürür.  
int sayi1 = 4;                       //0000 0100
int sayi2 = 7;                       //0000 0111
int VE = sayi1 & sayi2;              //0000 0100 –>;sonuç = 4
System.out.println(VE);
// Or Operatörü(|) : 2’lik sayı sistemine çevirir, VEYA işlemi yapıp, döndürür.
int sayi3 =4;                        //0000 0100
int sayi4 =7;                        //0000 0111
int VEYA = sayi3 | sayi4;            //0000 0111 –>sonuç = 7
System.out.println(VEYA);
// Xor Operatörü(^) : 2’lik sayı sistemine çevirir 
// XOR işlemini yapar,sonucuda döndürür.
int sayi5 =4;                        //0000 0100
int sayi6 =7;                        //0000 0111
int OZELVEYA = sayi5 ^ sayi6;        //0000 0011 –>sonuç = 3
System.out.println(OZELVEYA);
// Tamamlama(Complement) Operatörü degerleri 2’lik sayı sistemine çevirir
// ve biti 0 olanı 1 yapar,1 olanı da 0 yapar ve sonucuda döndürür.
int sayi7 = 4;
System.out.println(~sayi7);          //-5 En Soldaki işaret biti
//Kaydırma Operatörü degerleri 2’lik sayı sistemine çevirir,
//ve istenildigi kadarıyla saga veya sola kaydırılır.
int KAYDiRMA = 4;                       //0000 0100
System.out.println(KAYDiRMA >> 1);      //0000 0010 –>sonuç = 2
System.out.println(KAYDiRMA << 4);      //0100 0000 –>sonuç = 64
*/
    }
    
}
