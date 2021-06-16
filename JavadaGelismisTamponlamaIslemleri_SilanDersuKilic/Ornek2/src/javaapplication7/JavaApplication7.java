
package javaapplication7;
import java.nio.*;
import java.util.*;
/**
 *
 * @author silan
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CharBuffer'ın kapasitesinin bildirilmesi
       char capacity = 10;
  
      // CharBuffer'ı Oluşturma
         // Charbuffer nesnesi yaratılıyor
         // ve boyut kapasitesinin atanması
        CharBuffer fb = CharBuffer.allocate(capacity);
  
        // değeri charbuffer'a koymak
        fb.put('a');
        fb.put(3, 'b');
  
        // CharBuffer'ı yazdırma
        System.out.println("ChartBuffer: "
                           + Arrays.toString(fb.array())); 
        
      
    }
    
}
