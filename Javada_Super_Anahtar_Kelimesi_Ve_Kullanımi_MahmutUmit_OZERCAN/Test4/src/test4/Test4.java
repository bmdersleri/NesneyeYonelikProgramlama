/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author Özercan's monster pc
 */
class otomobil{

    otomobil() {
        System.out.println("Otomobil oluşturuldu");
    }    
}
class dizel extends otomobil{

    dizel() {
        System.out.println("Dizel otomobil oluşturuldu");
    }
    
}
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dizel d=new dizel();
    }
    
}
