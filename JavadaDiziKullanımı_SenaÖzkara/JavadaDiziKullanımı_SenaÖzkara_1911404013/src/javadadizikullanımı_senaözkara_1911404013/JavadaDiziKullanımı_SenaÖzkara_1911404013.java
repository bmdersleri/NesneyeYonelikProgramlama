
package javadadizikullanımı_senaözkara_1911404013;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
public class JavadaDiziKullanımı_SenaÖzkara_1911404013 {

 /**
 *
 * @author Sena Özkara
 */
   
//ÖNEMLİ UYARI!!! Değişken isimlerinde aynı isimler kullanıldığı için bütün kodları kopyala yapıştır yaparsanız hata alırsınız bunun için sadece gerekli olan kod alanını kullanınız Youtube'daki videodan aklınıza takılan şeyleri bulabilir ya da benimle iletişime geçebilirsiniz.
}

// Tek Boyutlu Diziler Uygulama Örneği-2
    class Student
        {
             public int no;
             public String isim;
             Student(int no ,  String isim)
             {
                 this.no=no;
                 this.isim=isim;

             }
        }
//Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -1
    public static float ortalama (int[] a )
    {
        float toplam= 0;
        for (int i = 0; i < a.length; i++)
        {
            toplam = toplam +a[i];
        }
        return toplam/a.length;
    }
    
    
     //Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -2
     
    public static int [] arttir(int baslangic)
    {
      int elemansayisi=((100- baslangic)/2)+1;  
      int [] dizi = new int [elemansayisi];
        for (int i=baslangic, j=0;i<=100; i+=2, j++ ) 
        {
            dizi[j]=i;
        }
        return dizi;
    }
    
//Diziyi Metoda Çevirme Örneği-3
    class TestArray
{
    
    static void min (int array[])
    {
        int min = array[0];
        
        for (int i = 0; i < array.length; i++)
        {
            if (min>array[i]) 
            {
                min=array[i];            }
        }
        System.out.println("minimum değer : " + min);
    }
    }

        
        
        
        
        //static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1
        class Student {
    int rollno;
    String name, address;
  
    // Constructor
    public Student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
  
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " "
            + this.name + " "
            + this.address;
    }
}
  
class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
  
        //static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1
        
        

public class Kodların_hepsının_derlenmıs_halı {

    
    public static void main(String[] args) 
    {
        // Tek Boyutlu Diziler Uygulama Örneği-1
      int array[];
      array = new int[5];
      array[0]=10;
      array[1]=20;
      array[2]=30;
      array[3]=40;
      array[4]=50;
      System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-1****************************** \n" );  
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println("index" + " " +  i  +  ":" + " " + array[i]);  
        }  
      System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-1****************************** \n" );  
    
  // Tek Boyutlu Diziler Uygulama Örneği-1 
  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 bu hatayı almak için yaptığımız kod örneği
//      int arrayeror[];
//      arrayeror = new int[5];
//      arrayeror[0]=10;
//      arrayeror[1]=20;
//      arrayeror[2]=30;
//      arrayeror[3]=40;
//      arrayeror[4]=50;
//      arrayeror[5]=60;
//
//      
//      System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-1****************************** \n" );  
//        for (int i = 0; i < arrayeror.length; i++) 
//        {
//            System.out.println("index" + " " +  i  +  ":" + " " + arrayeror[i]);  
//        }  
//      System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-1****************************** \n" );  
//    
      
      
      
       // Tek Boyutlu Diziler Uygulama Örneği-2
       
       Student[] dizi;
       dizi=new Student [5];
       dizi[0] = new Student(1,"İsmet");
       dizi[1]=new Student(2,"Aybüke");
       dizi[2]=new Student(3,"Rüya");
       dizi[3]=new Student(4,"Alya");
       dizi[4]=new Student(5,"Elif");
       System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-2****************************** \n" );  
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.println( i + " " + "öğesinde"+ ": " + dizi[i].no + " " + dizi[i].isim );
        }
       System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-2****************************** \n" );  
        
       
       
       
        System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-3****************************** \n" ); 
       // Tek Boyutlu Diziler Uygulama Örneği – 3 (For - each loop)
       int array2[]={33,3,4,5};
       for(int diziarama: array2)
            System.out.println(diziarama);
       System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-3****************************** \n" ); 
       
       
       
       
       
        System.out.println(" **********************Tek Boyutlu Diziler Uygulama Örneği-4****************************** \n" ); 
       //Tek Boyutlu Diziler Uygulama Örneği – 4 ( IntStream.range() )
       
        int[] intarray = IntStream.range( 1 , 11).toArray();
        System.out.println(Arrays.toString(intarray));
        System.out.println("\n **********************Tek Boyutlu Diziler Uygulama Örneği-4****************************** \n" ); 
     
        
        
        
        
        
        System.out.println("\n ********************** Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -1 ****************************** \n" );       int []  dersNotlarim = {75,90,40};
      float ortalamam = ortalama(dersNotlarim);
       System.out.println("Ortalamam : " + ortalamam);
       System.out.println("\n ********************** Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -1 ****************************** \n" ); 
    
    
    //Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -2
    
    
    int [] sayilarim = arttir(52);
     System.out.println("\n ********************** Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -2 ****************************** \n" ); 
        for (int q = 0; q < sayilarim.length; q++) 
        {
            System.out.print(sayilarim[q]+"-"); 
            
        }
         System.out.println("\n ********************** Geri Döndürülecek Değer Dizi Değilse Uygulama Örneği -2 ****************************** \n" ); 

         
         //Diziyi Metoda Geçirme Örneği-3
          int a [] = {33,3,4,5,96,78};
        min(a);
        
        
        // //Diziyi Metoda Geçirme Örneği-4
        int[] dizi = new int[10];
for(int i=0; i<10; i++) {
	Random rastgele = new Random();
	int sayi = rastgele.nextInt(100)+1;
	dizi[i] = sayi;
}
for(int k=1; k<10; k++) {
	int gecici;
	for(int j=0; j<10-k; j++) {
		if(dizi[j] > dizi[j+1]) {
			gecici = dizi[j];
			dizi[j] = dizi[j+1];
			dizi[j+1] = gecici;
		}
	}
}

for(int i=0; i<10; i++) {
	if(i != 9) {
		System.out.print(dizi[i]+" - ");
	} else {
		System.out.print(dizi[i]);
	}
}
    }
    
}

    }




//Dizilerde Takas ve Referans Mantığı Örnek Uygulama-1
       int[] dizi1 = {10,20,30};
        int[] dizi2 = dizi1;
        dizi1[0] = 1000;
        System.out.println("\n ********************** Dizilerde Takas ve Referans Mantığı Örnek Uygulama-1  ****************************** \n" ); 
        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(dizi2));
        System.out.println("\n ********************** Dizilerde Takas ve Referans Mantığı Örnek Uygulama-1  ****************************** \n" ); 

//  Dizilerde Takas ve Referans Mantığı Örnek Uygulama-2
        
         System.out.println("\n ********************** Dizilerde Takas ve Referans Mantığı Örnek Uygulama-2  ****************************** \n" ); 
         int[] dizi = new int[10];
        for(int i=0; i<10; i++) 
        {
	Random rastgele = new Random();
	int sayi = rastgele.nextInt(100)+1;
	dizi[i] = sayi;
        }
        for(int k=1; k<10; k++) {
	int gecici;
	for(int j=0; j<10-k; j++) {
		if(dizi[j] > dizi[j+1]) {
			gecici = dizi[j];
			dizi[j] = dizi[j+1];
			dizi[j+1] = gecici;
		}
	}
}

        for(int m=0; m<10; m++) {
	if(m != 9) {
		System.out.print(dizi[m]+" - ");
	} else {
		System.out.print(dizi[m]);
	}
}
         System.out.println("\n ********************** Dizilerde Takas ve Referans Mantığı Örnek Uygulama-2  ****************************** \n" ); 
    
        
        System.out.println("\n ********************** Çok boyutlu Dizi Uygulama Örneği-1 ****************************** \n" ); 

        //Çok boyutlu Dizi Uygulama Örneği-1
        int arr[][]={{1,2,3}{2,4,5},{4,4,5}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++)
        {
        System.out.print(arr[i],[j]+" ");
        }
        System.out.println();
        }
         System.out.println("\n ********************** Çok boyutlu Dizi Uygulama Örneği-1 ****************************** \n" ); 

         System.out.println("\n ********************** Pürüzlü Dizi Uygulama Örneği-1 ****************************** \n" ); 
        //tek sütunla bir diziyi başlatma
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];
        //pürüzlü bir diziyi başlatma
        int cout=0;
       for(int i=0;i<arr.length;i++)
         for(int j=0;j<arr[i].length;j++)
          arr[i][j]=count++;
        
        //pürüzlü bir dizinin verilerini yazdırma
        for(int i=0;i<arr.length;i++)
            for(int j=0; j<arr[i].length;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         System.out.println("\n ********************** Pürüzlü Dizi Uygulama Örneği-1 ****************************** \n" );
        
        
         System.out.println("\n **********************  Dizi Kopyalama Uygulama Örneği-1 ****************************** \n" );
        char[]copyFrom={'d','e','c','a','f','f','e''i','n','a','t','e','d'};
        //Bir hedef dizi bildirme
        char[]copyTo=new char[7];
        //System.arraycopy() yöntemini kullanarak dizi kopyalamak
        System.arraycopy(copyFrom,2,copyTo,0,7);
        //hedef diziyi yazdırmak
        System.out.println(String.valueOf(copyTo));
        System.out.println("\n **********************  Dizi Kopyalama Uygulama Örneği-1 ****************************** \n" );
        
        System.out.println("\n **********************  Dizi Klonlama Uygulama Örneği-1 ****************************** \n" );
        int arr[]={33,3,4,5};  
        System.out.println("Orjinal dizi yazdırılıyor");  
        for(int i:arr)  
        System.out.println(i);  
  
        System.out.println("Dizinin klonu yazdırılıyor");  
        int carr[]=arr.clone();  
        for(int i:carr)  
        System.out.println(i);  
  
        System.out.println("iki dizi birbirine eşit mi");  
        System.out.println(arr==carr);  

        System.out.println("\n **********************  Dizi Klonlama Uygulama Örneği-1 ****************************** \n" );
        
         System.out.println("\n ********************** Javada İki matris eklenmesi ve toplanması Uygulama Örneği-1 ****************************** \n" );
        int a[][]={{1,3,4},{3,4,5}};  
        int b[][]={{1,3,4},{3,4,5}};  

        
        int c[][]=new int[2][3];  

      
        for(int i=0;i<2;i++){  
        for(int j=0;j<3;j++){  
        c[i][j]=a[i][j]+b[i][j];  
        System.out.print(c[i][j]+" ");  
        }  
        System.out.println(); 
        System.out.println("\n ********************** Javada İki matris eklenmesi ve toplanması Uygulama Örneği-1 ****************************** \n" );
        
        System.out.println("\n ********************** Çok boyutlu dizilerde iki dizinin karşılaştırılması Uygulama Örneği-1 ****************************** \n" );
        
         int matris1[][] = { { 10, 20 },
                       { 40, 50 },
                       { 60, 70 } };
  
        int matris2[][] = { { 30, 20 },
                       { 10, 0 },
                       { 60, 80 } };
  
        int matris3[][] = { { 10, 20 },
                       { 40, 50 },
                       { 60, 70 } };
        System.out.println("matris1 ve matris2'nin karşılaştırılması  : "
                           + Arrays.deepEquals(a1, a2));
  
        System.out.println("matris2 ve matris3'nin karşılaştırılması: "
                           + Arrays.deepEquals(a2, a3));
  
        System.out.println("matris1 ve matris3'nin karşılaştırılması : "
                           + Arrays.deepEquals(a1, a3));
        System.out.println("\n ********************** Çok boyutlu dizilerde iki dizinin karşılaştırılması Uygulama Örneği-1 ****************************** \n" );
        
        
        //Dizilerde BinarySearch Yöntemi ile arama yapmak
        System.out.println("\n ********************** Dizilerde BinarySearch ve LineerSearch Yöntemi ile arama yapmak Uygulama Örneği-1 ****************************** \n" );
        private static int[] generateUnorderedArray() {

       //create array
        int[] unOrderedArray  =  {5, 3, 13, 10, 15, 8};

        //return array
        return unOrderedArray;
}
        
        private static int[] generateOrderedArray() {
        
       //create an int array
        int[] orderedArray  = {3, 5, 8, 10, 13, 15};

        //return ordered array
        return orderedArray;
}
        
        //Lineer Search:
        private static boolean linearSearch(int[] unOrderedArray, int searchKey) {

    //search for key
    for (int i = 0; i < unOrderedArray.length-1; i++) {
       if( unOrderedArray[i] == searchKey )
           return true;
    }
    
    return false;
}
        //Binary Search :
        public static int binarySearch(int[] orderedArray, int key) {

        int low = 0;
        int high = orderedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = orderedArray[mid];
                
             if(midVal == key) {
                return key; // key found
             }

            if (midVal < key)
                low = mid + 1;
                
           if (midVal > key)
                high = mid - 1;
     
        }
        return null;  // key not found.

    }
        
         System.out.println("\n ********************** Dizilerde BinarySearch ve LineerSearch Yöntemi ile arama yapmak Uygulama Örneği-1 ****************************** \n" );

        System.out.println("\n ********************** Diziyi Ters Sırada yazdırmak Uygulama Örneği-1 ****************************** \n" );

        int arama;
        int numara[]={ 12,16,20,98,76,52,25,14};
        arama=Arrays.binarySearch(numara,4,6,98);
        System.out.println("98 sayısının indexi" + arama);
         int [] orjinaldizi = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Orjinal Dizi: ");  
        for (int i = 0; i < orjinaldizi.length; i++)
        {  
            System.out.print(orjinaldizi[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Ters sıralamış dizi: ");  
       // Dizide ters sırada döngü yapın
        for (int i = orjinaldizi.length-1; i >= 0; i--) 
        {  
            System.out.print(orjinaldizi[i] + " ");  
        }  
        System.out.println("\n ********************** Diziyi Ters Sırada yazdırmak Uygulama Örneği-1 ****************************** \n" );

        System.out.println("\n ********************** Arrays.toString()  Arrays.deepToString() in Uygulama Örneği-1 ****************************** \n" );
        
        Integer[] array1 = { 1, 2, 3, 4, 5 };
        Integer[] arrray2 = { 6, 7, 8, 9, 10 };
        Integer[][] combinatıonarray = { array1, array2 };
        
        System.out.println(" Arrays.toString() kullanımı: "
                           + Arrays.toString(combinatıonarray));
        
        System.out.println(" Arrays.deepToString()kullanımı: "
                           + Arrays.deepToString(combinatıonarray));
        
        
        System.out.println("\n ********************** Arrays.toString()  Arrays.deepToString() in Uygulama Örneği-1 ****************************** \n" );

        System.out.println("\n ********************** Arrays.toString()  Arrays.asList() in Uygulama Örneği-1 ****************************** \n" );
       
        int array[]={1,,20,15,22,35};
        System.out.println("Dizi listeleniyor:"+Arrays.asList(arrray));
        
         System.out.println("\n ********************** Arrays.toString()  Arrays.asList() in Uygulama Örneği-1 ****************************** \n" );
        
          System.out.println("\n ********************** Arrays.deepHashCode()  Uygulama Örneği-1 ****************************** \n" );
        
        int numaralar[]={1,,20,15,22,35};
        System.out.println("Dizi listeleniyor:"+ Arrays.deepHashCode(numaralar));
        
          System.out.println("\n ********************** Arrays.deepHashCode()   Uygulama Örneği-1 ****************************** \n" );
       
        
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-1 ****************************** \n" );
        

            // 
            byte dizi[] = new byte[] {1, 6, 3, 2, 9};

            
            System.out.println("Gerçek dizi: ");
            for (byte value : dizi) {
               System.out.println("Değerler = " + value);
            }

          
            Arrays.fill(dizi, 2, 4, (byte)64);

            
         System.out.println(" fill() yöntemini kullandıktan sonra yeni değerler: ");
            for (byte value : dizi) {
               System.out.println("Değerler = " + value);
        
         System.out.println("\n ********************** Arrays.fill()   Uygulama Örneği-1 ****************************** \n" );
             
        
        
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-2 ****************************** \n" );
        
        String şehirler[]={"Ankara","İstanbul","Bursa","Eskişehir","İzmir","Antalya"};
        String StringKey="Afyonkarahsar";
        Arrays.fill(şehirler,StringKey);
        System.out.println("dizinin anahtar ile doldurulmuş hali"+ Arrays.toString(şehirler));
        
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-2 ****************************** \n" );
        
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-3 ****************************** \n" );
        
        String şehirler[]={"Ankara","İstanbul","Bursa","Eskişehir","İzmir","Antalya"};
        
        Arrays.fill(şehirler,0,3 ,(String)"Afyonkarahisar");
        System.out.println("fill() yontemı kullanılarak oluşturulmuş dizi"+ Arrays.toString(şehirler));
        
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-3 ****************************** \n" );
        
        System.out.println("\n ********************** Arrays.mismatch() Uygulama Örneği-1 ****************************** \n" );
        
        
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        
        int intArr1[] = { 10, 15, 22 };
  

        System.out.println("Dizide eşleşmeyen öğenin indexi: "
                           + Arrays.mismatch(intArr, intArr1));
        
         System.out.println("\n ********************** Arrays.mismatch() Uygulama Örneği-1 ****************************** \n" );
        
        
        System.out.println("\n ********************** Arrays.sort() Uygulama Örneği-1 ****************************** \n" );
        
        
        
            int Array[] = {3, 1, 2, 18, 10};

                    for (int number : Array) {
             System.out.println("Dizideki numaralar = " + number);
          }

          
          Arrays.sort(Array, 0, 3);

         
          System.out.println("Sıralanmış dizi(0 - 3) :");
          for (int number : Array) {
             System.out.println("Dizideki numaralar  = " + number);
        
        System.out.println("\n ********************** Arrays.sort() Uygulama Örneği-1 ****************************** \n" );
        
        
        //static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1
        
        System.out.println("\n ********************** static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1 ****************************** \n" );
           
         Student[] arr = { new Student(111, "bbbb", "london"),
                          new Student(131, "aaaa", "nyc"),
                          new Student(121, "cccc", "jaipur") };
  
        System.out.println("Sırasız");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
  
        Arrays.sort(arr, 1, 2, new Sortbyroll());
  
        System.out.println("\nRollere göre sıralandı");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("\n ********************** static <T> void sort(T[] a, Comparator< super T> c); Metodu Uygulama Örneği -1 ****************************** \n" );
        
        }
}   