public class Daire {

    private static final double PI = 3.14;
    private final int yarýçap; // hata
    /**
     * satýr 4ün yazýmý hatalýdýr çünkü deðiþkeni ne kadar boþ tanýmlansada sonuç olarak default
     * olarak tanýmlanýyor ve satýr 13te r deðeri 'yaricap' deðiþenine atanýyor. Bu da final anahtar
     * kelimesinin bize izin vermediði bir durumdur
     */
    private int dairecevre;

    protected static final double cevrehesapla(int r) {

        int yaricap = r;

        double daireAlan = 2 * PI * yaricap;

        return daireAlan;

    }
    public class Kup{
        /**
         * ayrýca final tanýmlanmýþ bir sýnýfýn içine anonim bir final veya final olmayan bir
         * sýnýf oluþturabiliriz derleyici bize herhangi bir sorun çýkarmayacaktýr
         */
        public static final int KENAR = 5;
        public static final double HACIM =  KENAR*KENAR*KENAR;

        }
    }
