/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package üstsınıftakiöğelereörnek2;

/**
 *
 * @author Özercan's monster pc
 */
class Calisan{
    private String isim;
    private int maas;
    private String departman;
    public Calisan(String isim,int maas,String departman){
        this.isim=isim;
        this.maas=maas;
        this.departman=departman;
    }
    public void calis(){
        System.out.println("Çalış programı çalışıyor");
    }
    public void bilgileriGoster(){
        System.out.println("İsim: "+isim);
        System.out.println("Maaş: "+maas);
        System.out.println("Departman: "+departman);
    }
    public void departman_degistir(String yeni_departman){
        System.out.println("Departman değiştiriliyor.");
        this.departman=yeni_departman;
        System.out.println("Yeni Departman: "+this.departman);
    }
}
class Yonetici extends Calisan{
    int sorumlu_kisi;
    public Yonetici(String isim,int maas,String departman,int sorumlu_kisi){
        super(isim, maas, departman);
        this.sorumlu_kisi=sorumlu_kisi;
    }
    public void zam_yap(int zam_miktari){
        System.out.println("Çalışanlara "+zam_miktari+"TL zam yapıldı.");
    }
}

public class ÜstSınıftakiÖğelereörnek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Yonetici yonetici=new Yonetici("kaya", 1000, "IT",5);
        yonetici.zam_yap(200);
    }
    
}
