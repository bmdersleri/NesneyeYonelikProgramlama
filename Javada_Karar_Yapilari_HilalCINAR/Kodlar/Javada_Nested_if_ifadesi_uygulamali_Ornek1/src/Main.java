public class Main {

    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int Toplam = a + b;
        int Carpim = a * b;

        if (a < b) {
            System.out.println("a ve b sayılarının toplamı = " + Toplam);
            if (a > 10) {
                System.out.println("a ve b sayılarının çarpımı = " + Carpim);
            }
        }
    }
}
