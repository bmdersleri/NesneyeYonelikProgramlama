

public class Siniflar1 {

   
    public static void main(String[] args) {
        HesapMakinesi m1 = new HesapMakinesi(10,5,"kırmızı");
        System.out.println(m1.toplama());
        m1.sayi1=8;
        System.out.println(m1.cıkarma());
        
        HesapMakinesi m2 = new HesapMakinesi(15,5,"mavi");
        System.out.println(m2.carpma());
        m2.sayi2=3;
        System.out.println(m2.bolme());
        
    }

    
}
