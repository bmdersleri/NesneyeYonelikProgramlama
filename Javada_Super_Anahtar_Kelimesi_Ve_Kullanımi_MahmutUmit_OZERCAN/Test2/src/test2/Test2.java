/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author Özercan's monster pc
 */
class otomobil{
    void yakit(){
        System.out.println("Benzin");
    }
}
class elektrikli extends otomobil{
    void yakit(){
        System.out.println("Elektrik tüketiyor");
    }
    void  ses(){
        System.out.println("Ses çıkarmıyor");
    }
    void calis(){
        super.yakit();
        ses();
    }
}

public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        elektrikli e=new elektrikli();
        e.calis();
    }
    
}
