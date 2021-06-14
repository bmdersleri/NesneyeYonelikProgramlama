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
public class A{
    public void x(){
        System.out.println("Ahmet");
    }
    public void y(){
        System.out.println("KOCATEPE");
        this.x(); //burada this kullanmasakta olur.
    }
}
     class test{
        public static void main(String[] args){
            A o=new A();
            o.y();
        }
    }




