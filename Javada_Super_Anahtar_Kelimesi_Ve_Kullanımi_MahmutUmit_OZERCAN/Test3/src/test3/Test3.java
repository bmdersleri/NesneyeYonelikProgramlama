/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

/**
 *
 * @author Özercan's monster pc
 */
class otomobil{

    otomobil() {
        System.out.println("Otomobil oluşturuldu");
    }
    
}
class benzinli extends otomobil{

    benzinli() {
        super();
        System.out.println("Benzinli oluşturuldu");
    }
    
}
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        benzinli b=new benzinli();
    }
    
}
