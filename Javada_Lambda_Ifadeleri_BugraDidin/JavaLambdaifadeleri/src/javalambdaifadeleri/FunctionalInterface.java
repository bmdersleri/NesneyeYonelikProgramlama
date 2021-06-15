package javalambdaifadeleri;

interface Arabamiz {
    void uretimYili(int yil);
}

class Araba implements Arabamiz {
    @Override
    public void uretimYili(int yil) {
        System.out.println("Arabamızın üretim yılı: "+ yil);
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        
        Arabamiz ilkAraba = new Araba();
        ilkAraba.uretimYili(2008);
        
        
        // Yukarıda yer alan kodun Lambda İfadeleri ile yazımı : 
        Arabamiz lambdaAraba = yil -> System.out.println("Arabamızın üretim yılı: "+ yil);
        lambdaAraba.uretimYili(2008);
    }
}
