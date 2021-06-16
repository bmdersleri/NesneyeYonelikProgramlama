/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Özercan's monster pc
 */
class otomobil{
    String renk="Beyaz";
}
class ferrari extends otomobil{
String renk="Kirmizi";

void renkYazdir(){
    System.out.println(renk);
    System.out.println(super.renk);
}
}
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ferrari f=new ferrari();
        f.renkYazdir();
    }
    
}
