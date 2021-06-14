/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maku;
import maku.BilgisayarMuhendisligi.Ogrenciler;

/**
 *
 * @author koray.coskun
 */
public class MAKU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ogrenciler ogr = new Ogrenciler();
        ogr.mesaj();
        
        ogr.ogr_no=2021;
        ogr.ogr_adsoyad="koraycoskun";
        
        System.out.println(ogr.ogr_no);
        System.out.println(ogr.ogr_adsoyad);
                
    }
    
}
