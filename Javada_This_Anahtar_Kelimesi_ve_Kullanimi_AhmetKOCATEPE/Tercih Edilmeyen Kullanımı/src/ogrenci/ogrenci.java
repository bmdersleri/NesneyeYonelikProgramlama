/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenci;

/**
 *
 * @author Ahmet
 */
import java.util.ArrayList;
import java.util.List;
 
public class ogrenci {    
 
    public static void main(String[] args) {
 
        ArrayList<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
 
        Ogrenci ogrenci1 = new Ogrenci(1, "Ahmet K.");
        Ogrenci ogrenci2 = new Ogrenci(2, "A. KOCATEPE");
 
        ogrenci1.ekle(ogrenciListesi);
        ogrenci2.ekle(ogrenciListesi);
    }
    public Ogrenci getOgrenci() {
    return this;
}
}
