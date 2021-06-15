package javalambdaifadeleri;

interface Islem {
    int aritmetikIslem(int sayi1, int sayi2);
}

public class LambdaCokluParametre {
    public static void main(String[] args) {
        Islem toplama = (int ilkSayi, int ikinciSayi) -> ilkSayi + ikinciSayi;
        System.out.println("Toplama = "+toplama.aritmetikIslem(3, 4));
        
        Islem cikarma = (sayi1, sayi2) -> sayi1 - sayi2;
        System.out.println("Çıkarma = "+cikarma.aritmetikIslem(10, 5));
        
        int c = cikarma.aritmetikIslem(10, 5);
        System.out.println("c'nin değeri = "+ c);
    }
}
