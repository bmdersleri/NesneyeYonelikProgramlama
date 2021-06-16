public class javadaoverride extends javadaoverride2 {

    // Overload

    public void selamVer() {
        System.out.println("Selam");
    }

    public void selamVer(String isim) {
        System.out.println("Selam " + isim);
    }

    public void selamVer(String isim, String soyisim) {
        System.out.println("Selam " + isim + " " + soyisim);
    }

    // Override

    @Override
    public void hareketEt() {

        System.out.println("hareketEt metodu override edildi");
    }

}

class javadaoverride2 {

    public void hareketEt() {

        System.out.println("hareket edildi");
    }

}