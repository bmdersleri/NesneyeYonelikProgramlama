/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package örnek2;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Casper
 */
public class ÖRNEK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter yazici;
        String veri ="Java öğreniyorum...";
        try{
        yazici = new FileWriter("kodlab.txt");
        yazici.write(veri);
        yazici.close();
        System.out.println("veri dosya yazıldı");
        
        }catch (IOException e){
         System.out.println("hata:"+e.getMessage());
        }
    }
    
}
