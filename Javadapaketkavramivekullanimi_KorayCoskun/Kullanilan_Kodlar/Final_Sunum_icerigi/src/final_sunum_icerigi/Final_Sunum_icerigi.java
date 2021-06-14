
package final_sunum_icerigi;

import uretim.hat1.urunler.Stok;
import static uretim.hat1.urunler.Stok.STOK_LISTESI;

/**
 *
 * @author koray.coskun
 */
public class Final_Sunum_icerigi {

    public static void main(String[] args) {
        System.out.println("Merhaba Dünya!");
        System.out.println(Math.pow(5,2));
        
        Stok s = new Stok();
        s.stok_kodu=123;
        System.out.println(s.stok_kodu);
        
        STOK_LISTESI();
               
    }
    
}
