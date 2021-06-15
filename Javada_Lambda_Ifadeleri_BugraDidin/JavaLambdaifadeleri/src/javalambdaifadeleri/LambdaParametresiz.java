package javalambdaifadeleri;

interface Taksi {
    void cagir();
}

class Ulasim implements Taksi{
    @Override
    public void cagir() {
        System.out.println("Taksi başarıyla çağırılmıştır.");
    }
}

public class LambdaParametresiz {
    public static void main(String[] args) {
        
        Taksi aracimiz = new Ulasim();
        aracimiz.cagir();
        
        // Lambda ifadesi kullanılarak
        Taksi arac = () -> System.out.println("Taksi başarıyla çağırılmıştır.");
        arac.cagir();
    }
}
