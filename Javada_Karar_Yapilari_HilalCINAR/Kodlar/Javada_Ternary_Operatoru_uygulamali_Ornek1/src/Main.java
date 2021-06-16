public class Main {

    public static void main(String[] args) {
        //IF/ELSE İLE YAZIMI

        boolean cinsiyet = false;

        if (cinsiyet == true) {
            System.out.println("Kadınlara özel kapmanya");
        } else {
            System.out.println("Erkeklere özel kapmanya");
        }


        //TERNARY OPERATÖRÜ İLE YAZIMI
        boolean cinsiyet1 = false;

        String mesaj = cinsiyet1 == true ? "Kadınlara özel kapmanya" : "Erkeklere özel kapmanya";

        System.out.println(mesaj);

    }
}
