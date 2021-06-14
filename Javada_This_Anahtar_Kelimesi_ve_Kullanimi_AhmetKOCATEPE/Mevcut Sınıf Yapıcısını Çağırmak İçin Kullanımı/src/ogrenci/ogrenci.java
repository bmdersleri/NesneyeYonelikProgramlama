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
public class ogrenci{
ogrenci(){
    System.out.println("Ahmet KOCATEPE");
}
ogrenci(int yas){
    this();
    System.out.println(yas);
}
}
    class test{
        public static void main(String[] args){
            ogrenci yas=new ogrenci(20);
        }
    }

