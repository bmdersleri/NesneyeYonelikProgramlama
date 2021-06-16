public class Main {

    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int Toplam = a + b;
        int Carpim = a * b;
        int ikiKati = 2 * Toplam;

        if (a > b) {
            System.out.println("a ve b sayılarının toplamı = " + Toplam);
        } else if (a == 19)
            System.out.println("a ve b sayılarının çarpımı = " + Carpim);
        else
            System.out.println("a ve b sayılarının iki katı = " + ikiKati);

    }
}
