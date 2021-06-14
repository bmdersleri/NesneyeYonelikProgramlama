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
public class ogrenci {

    String adi;
    String soyadi;
    int no;
    
public ogrenci(String adi,String soyadi,int no){
    adi=adi;
    soyadi=soyadi;
    no=no;
}
public void bilgiler(){
    System.out.println(adi+" "+soyadi+" "+no);
}
public static void main (String[] args){
    ogrenci ogrencibilgileri=new ogrenci("Ahmet","KOCATEPE",191104053);
    ogrencibilgileri.bilgiler();
}
}

