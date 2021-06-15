package javalambdaifadeleri;

interface Selamlama {
    void selamVer(String isim);
}

public class LambdaTekParametreli {
    public static void main(String[] args) {
        Selamlama selam = (ismim) -> System.out.println("Merhabalar, ben "+ ismim);
        selam.selamVer("Buğra Didin");
    }
}
