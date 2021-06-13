
package deneme18;

//Javada encapsulation
public class Final {

    private String ad;
    private String cinsiyet;
    
    public Final(String ad, String cinsiyet){
    this.ad = ad;
    this.cinsiyet= cinsiyet;
    
    }

    Final() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public String getAd(){
    return ad;
    }
    public void setAd(String ad){
    this.ad = ad;
    }
    public String getCinsiyet(){
    return cinsiyet;
    }
    public void setCinsiyet(String cinsiet){
    this.cinsiyet= cinsiyet;
    }
    
  }

// metot tanımlama
// f(x)= (x-8)/2 ; f(16)= 4
       // usAl(4,5);
      //usAl();

//    static void usAl(){
//        Scanner sayiGir = new Scanner(System.in);
//        
//       System.out.println("Üssü alınacak sayıyı ve üssü giriniz");
//       int sayi1 = sayiGir.nextInt();
//       int sayi2 = sayiGir.nextInt();
//       
//       int sonuc = 1;
//       
//        for(int i=1 ; i<= sayi2 ; i++){
//            sonuc *= sayi1;
//        }
//        System.out.println("cevap: " + sonuc);
//    }



//varargs
//main altına 
//         varargsDeneme("beyza",789,false);
//  }
//    public static void varargsDeneme(Object... objects){
//       for(Object s : objects){
//           System.out.println(s.toString());
//       }
//    }


// parametre aktarımı
//int num=5;
//  // 5 degerini temsil eden bit yapisinin kopyasi alinir ve add metoduna gecer.
//  addvalue(num);
//  System.out.println("Ilk deger"+ num);

//    private static void addvalue(int num) {
//        int numa=num+5;
//        System.out.println("Son deger"+numa);


// autoboxing unboxing
// maiin metodu içine
//        ArrayList<Integer> arraylist = new ArrayList<>();   
//        for(int i=0; i<10; i++){   // autoboxing
//          arraylist.add(i*5);
//        }
//        for (int i=0; i<arraylist.size(); i++){     //unboxing
//            System.out.println(arraylist.get(i));
//        }
//        

//javada final keyword
// private int x; // class'ın alanı olarak tanımlandığında bu instance variable'dır.
//    private final int y = 5; // Değişkeni tanımladıktan sonra değeri atayabiliriz.
//    private int z; // Değişkenin değerini constructor'da veya herhangi bir metotda içinde tanımlanabilir.
//
//    private final int a = 10; // final keyword kullanıldığında, değişkenin değeri ya direkt tanımlanmalı yada constructor'da atanmalıdır.
//    private final int b;
//
//    // Eğer değer atanmamış ve final bir alan varsa constructorların tümünde o alan parametre olarak geçilip değer atanmalıdır.
//
//    public Final(int b){
//        this.b = b;
//    
//   
//    }
//    public Final(int z, int b){
//        this.z = z;
//        this.b = b;
//    }
//    public static void main(String[] args) {
//
//        Final testFinalInstanceVariable = new Final(20, 30);
//
//        System.out.println("x ==> " + testFinalInstanceVariable.x);  // instance variable'a bir değer atanmadığında varsayılan değer ne ise o değer yazılır. Örneğin: int ise 0 gibi.
//        System.out.println("y ==> " + testFinalInstanceVariable.y);  // y nin değeri direkt 5 olarak verilmiş ve daha sonra değiştirilmemiştir.
//        System.out.println("z ==> " + testFinalInstanceVariable.z);  // z nin değeri tanımlanma esnasında verilmemiştir. Constructor'da parametre olarak geçilmiştir.
//
//        System.out.println("a ==> " + testFinalInstanceVariable.a);  // a'nın değeri tanımlanma esnasında verilmiştir.
//        System.out.println("b ==> " + testFinalInstanceVariable.b);  // b'nin değeri tanımlanma esnasında verilmemiştir. Constructor'da parametre olarak geçilmiştir.
//                                                                // Eğer Constructor'da da değer atanmasaydı hata alırdık.
//    }


//javada encapsulation
// private String adi;
//  private String cinsiyet;
//
//  public Final(String adi, String cinsiyet) {
//    this.adi = adi;
//    this.cinsiyet = cinsiyet;
//  }
//
//    Final() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//  //private erişimde değişkene direk ulaşılamadığından Getter ve Setter metodları
//  //oluşturularak erişilebilmektedir.
//  public String getAdi() {
//
//    return adi;
//  }
//
//  public void setAdi(String adi) {
//    this.adi = adi;
//  }
//
//  public String getcinsiyet() {
//    return cinsiyet;
//  }
//
//  public void setcinsiyet(String cinsiyet) {
//    this.cinsiyet = cinsiyet;
//  }


// javada veri tipleri
//    public static void main(String[] args){
//     //değişkenler- primitif tipler
//     int sayim = 789;
//     short shortSayim = 456;
//     long longSayim = 9874;
//     double doubleSayim = 5.46;
//     float floatSayim = 384.7f;
//     char charSayim = 'b';
//     boolean booleanSayim = true;
//     byte byteSayim = 125;
//     String ismim = "Beyza Yüksel";
//          
//        System.out.println(sayim);
//        System.out.println(shortSayim);
//        System.out.println(longSayim);
//        System.out.println(doubleSayim);
//        System.out.println(floatSayim);
//        System.out.println(charSayim);
//        System.out.println(booleanSayim);
//        System.out.println(byteSayim);
//        System.out.println(ismim);
//    
//    }