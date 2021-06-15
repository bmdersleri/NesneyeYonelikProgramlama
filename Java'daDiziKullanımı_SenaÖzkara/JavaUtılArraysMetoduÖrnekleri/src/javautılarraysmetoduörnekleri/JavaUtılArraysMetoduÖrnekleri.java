package javautılarraysmetoduörnekleri;

import java.util.Arrays;

/**
 *
 * @author Sena Özkara
 */
public class JavaUtılArraysMetoduÖrnekleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// ArraysFill_Uygulama_Örneği_1 
        System.out.println("\n ***********************Arrays.fill_Uygulama_Örneği_1 *****************************\n");

        byte dizi[] = new byte[]{1, 6, 3, 2, 9};

        System.out.println("Gerçek dizi: ");
        for (byte value : dizi) {
            System.out.println("Değerler = " + value);
        }

        Arrays.fill(dizi, 2, 4, (byte) 64);

        System.out.println(" fill() yöntemini kullandıktan sonra yeni değerler: ");
        for (byte value : dizi) {
            System.out.println("Değerler = " + value);

            // ArraysFill_Uygulama_Örneği_1// 
        }
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-1 ****************************** \n");

        
        
        
        // ArraysFill_Uygulama_Örneği_2//
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-2 ****************************** \n");

        String şehirler[] = {"Ankara", "İstanbul", "Bursa", "Eskişehir", "İzmir", "Antalya"};
        String StringKey = "Afyonkarahsar";
        Arrays.fill(şehirler, StringKey);
        System.out.println("dizinin anahtar ile doldurulmuş hali" + Arrays.toString(şehirler));

        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-2 ****************************** \n");

        
        
        
        // ArraysFill_Uygulama_Örneği_3//
        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-3 ****************************** \n");

        String şehirler2[] = {"Ankara", "İstanbul", "Bursa", "Eskişehir", "İzmir", "Antalya"};

        Arrays.fill(şehirler2, 0, 3, (String) "Afyonkarahisar");
        System.out.println("fill() yontemı kullanılarak oluşturulmuş dizi" + Arrays.toString(şehirler2));

        System.out.println("\n ********************** Arrays.fill() Uygulama Örneği-3 ****************************** \n");

        
        
        
        //Arrays.mismatch() Uygulama Örneği-1 
        System.out.println("\n ********************** Arrays.mismatch() Uygulama Örneği-1 ****************************** \n" );
        
        
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        
        int intArr1[] = { 10, 15, 22 };
  

        System.out.println("Dizide eşleşmeyen öğenin indexi: "
                           + Arrays.mismatch(intArr, intArr1));
        
         System.out.println("\n ********************** Arrays.mismatch() Uygulama Örneği-1 ****************************** \n" );
        
         
         
         
         
         //Arrays.asList() Uygulama Örneği-1
         System.out.println("\n **********************  Arrays.asList() in Uygulama Örneği-1 ****************************** \n" );
       
         int array[]={1,20,15,22,35};
         System.out.println("Dizi listeleniyor:"+ Arrays.asList(array));
        
         System.out.println("\n **********************  Arrays.asList() in Uygulama Örneği-1 ****************************** \n" );
        
    
         
         
         //Dizi Kopyalama Uygulama Örneği-1
        System.out.println("\n **********************  Dizi Kopyalama Uygulama Örneği-1 ****************************** \n" );
        char[]copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        //Bir hedef dizi bildirme
        char[]copyTo=new char[7];
        //System.arraycopy() yöntemini kullanarak dizi kopyalamak
        System.arraycopy(copyFrom,2,copyTo,0,7);
        //hedef diziyi yazdırmak
        System.out.println(String.valueOf(copyTo));
        System.out.println("\n **********************  Dizi Kopyalama Uygulama Örneği-1 ****************************** \n" );

         
        
        
        
        
        
       // Dizi Klonlama Uygulama Örneği-1
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
        
         
        
        
        //Arrays.toString()  Arrays.deepToString() in Uygulama Örneği-1
        System.out.println("\n ********************** Arrays.toString()  Arrays.deepToString() in Uygulama Örneği-1 ****************************** \n" );
        
        Integer[] array1 = { 1, 2, 3, 4, 5 };
        Integer[] array2 = { 6, 7, 8, 9, 10 };
        Integer[][] combinatıonarray = { array1, array2 };
        
        System.out.println(" Arrays.toString() kullanımı: "
                           + Arrays.toString(combinatıonarray));
        
        System.out.println(" Arrays.deepToString()kullanımı: "
                           + Arrays.deepToString(combinatıonarray));
        
        
        System.out.println("\n ********************** Arrays.toString()  Arrays.deepToString() in Uygulama Örneği-1 ****************************** \n" );

        
        
        
        //Arrays.binarySearch Uygulama Örneği-2
        
        System.out.println("\n ********************** Arrays.binarySearch Uygulama Örneği-2 ****************************** \n" );

        int arama;//dizide arama yapmak için değişken tanımladık
        int numaralar[] = {12, 16, 20, 98, 76};
        arama = Arrays.binarySearch(numaralar, 98);
        System.out.println("98 sayısının indexi" + arama);
        //Videoda bu örneğin bu şekli ve  değiştirilerek  anlatılmış hali mevcuttur.
        System.out.println("\n ********************** Arrays.binarySearch Uygulama Örneği-2 ****************************** \n" );

        
        
        
        
        
        //Çok boyutlu dizilerde iki dizinin karşılaştırılması Uygulama Örneği-1
        
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
                           + Arrays.deepEquals(matris1, matris2));
  
        System.out.println("matris2 ve matris3'nin karşılaştırılması: "
                           + Arrays.deepEquals(matris2, matris3));
  
        System.out.println("matris1 ve matris3'nin karşılaştırılması : "
                           + Arrays.deepEquals(matris1, matris3));
        System.out.println("\n ********************** Çok boyutlu dizilerde iki dizinin karşılaştırılması Uygulama Örneği-1 ****************************** \n" );
        
        
        
        //Arrays.sort Uygulama Örneği-1
        
        System.out.println("\n ********************** Arrays.sort Uygulama Örneği-1 ****************************** \n" );

        int Array[] = {3, 1, 2, 18, 10};

                    for (int number : Array) {
             System.out.println("Dizideki numaralar = " + number);
          }

          
          Arrays.sort(Array, 0, 3);

         
          System.out.println("Sıralanmış dizi(0 - 3) :");
          for (int number : Array) 
          {
             System.out.println("Dizideki numaralar  = " + number);
          }
         System.out.println("\n ********************** Arrays.sort Uygulama Örneği-1 ****************************** \n" );
      
}}
