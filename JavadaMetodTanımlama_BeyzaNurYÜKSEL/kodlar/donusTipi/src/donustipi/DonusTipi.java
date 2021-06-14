
package donustipi;

public class DonusTipi {
    
    static int kareAl(int k){
    return k*k;
    }
    static float kareAl(float k){
    return k*k;
    }
    static double kareAl(double k){
    return k*k;
    }
    static boolean kareAl(int sayi1, int sayi2){
    return sayi2 ==sayi1*sayi1;
    }
    
    public static void main(String[] args) {
         System.out.println("int = "+ kareAl(7));
         System.out.println("float = "+ kareAl(7));
         System.out.println("double = "+ kareAl(7.5));
         System.out.println("boolean = "+ kareAl(7,7));
    }
    
}







