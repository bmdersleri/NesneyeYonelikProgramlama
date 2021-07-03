
package dosyaislemler;

import java.io.File;

import java.io.FileOutputStream;

import java.util.Scanner;



public class DosyaIslemler {
    
    public static void DosyaYaz(String veri ){
         try {
            FileOutputStream yazici=new FileOutputStream("c:\\dosya\\java.txt");
            yazici.write(veri.getBytes());
            yazici.close();
        } catch (Exception e) {
             System.out.println("hata");
        }
    }
    public static void DosyaOku(){
         File olustur=new File("c:\\dosya\\java.txt");
    try {
            Scanner okuyucu=new Scanner(olustur);
            while(okuyucu.hasNextLine()){
                System.out.println(okuyucu.nextLine());
            }
            okuyucu.close();
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
       
    DosyaYaz("hello java merhaba hava 12 13 14 ");
    DosyaOku();
        
        
    }
    }

    

