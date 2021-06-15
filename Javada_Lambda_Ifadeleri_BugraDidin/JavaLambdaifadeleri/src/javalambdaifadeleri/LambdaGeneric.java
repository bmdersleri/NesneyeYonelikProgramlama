package javalambdaifadeleri;

interface KarmaIslem<T> {
    T yazdir(T parametre1, T parametre2);
}

public class LambdaGeneric {
    public static void main(String[] args) {
        // Lambda ifadeleri kullanmadan Generic Functional Interface Örnekleri
        KarmaIslem<Integer> toplama = new KarmaIslem<Integer> () { 
            @Override
            public Integer yazdir(Integer parametre1, Integer parametre2) {
                return parametre1 + parametre2;
            }
        };
        System.out.println("Toplam = " + toplama.yazdir(5, 10));
        
        KarmaIslem<String> birlestirme = new KarmaIslem<String> () {
            @Override
            public String yazdir(String parametre1, String parametre2) {
                return parametre1 + parametre2;
            }
        };
        System.out.println(birlestirme.yazdir("Herkese ", "Selamlar"));
        
        
        // Lambda ifadeleri kullanarak Generic Functional Interface Örnekleri
        KarmaIslem<Integer> lambdaToplama = (a, b) -> a + b;
        System.out.println("Toplam = " + lambdaToplama.yazdir(5, 10));
        
        KarmaIslem<String> lambdaBirlestirme = (a, b) -> a + b;
        System.out.println(lambdaBirlestirme.yazdir("Herkese ", "Selamlar"));
    }
}
