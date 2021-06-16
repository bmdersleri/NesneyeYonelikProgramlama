public class Main {

    public static void main(String[] args) {
        int a = 15;

        if (a == 0) {
            System.out.println("Kaldınız!");
        } else if (a < 50) {
            System.out.println("Notunuz: 1");
        } else if (a < 70) {
            System.out.println("Notunuz: 2");
        } else if (a < 85) {
            System.out.println("Notunuz: 3");
        } else if (a <= 100) {
            System.out.println("Notunuz: 4");
        } else {
            System.out.println("Geçersiz not girişi");
        }
    }
}
