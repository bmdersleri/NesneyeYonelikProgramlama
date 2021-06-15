package javalambdaifadeleri;

interface Yazdir {
    void yaz(String yazi);
}

public class MetotReferansi {
    
    public static void statikMetot(String statik) {
        System.out.println(statik);
    }
    public void instanceMetot(String instance) {
        System.out.println(instance);
    }
    /*public MetotReferansi(String constructor){
        System.out.println(constructor);
    }*/
    
    public static void main(String[] args) {
        String metotRef = "Metot Referansı";
        
        System.out.println("Lambda ifadesi:");
        Yazdir lambda = yazi -> System.out.println(yazi);
        lambda.yaz(metotRef);
        
        Yazdir lambdaMR = System.out::println;
        lambdaMR.yaz(metotRef);
        
        System.out.println("Statik Metot:");
        Yazdir statik = MetotReferansi::statikMetot;
        statik.yaz(metotRef);
        
        System.out.println("Instance Metot:");
        MetotReferansi mRef = new MetotReferansi();
        Yazdir instance = mRef::instanceMetot;
        instance.yaz(metotRef);
        
        
        // Aşağıda yer Constructor referansı kodunun çalıştırılabilmesi için
        // static ve instance metotların yorum satırı haline getirilmesi gerekmektedir.
        /*System.out.println("Constructor:");
        Yazdir constructor = MetotReferansi::new;
        constructor.yaz(metotRef);*/
        
        
        // Aşağıda yer alan parametre referansı kodunun çalıştırılabilmesi için
        // interface içerisinde bulunan abstract metodun geri dönüş değerinin
        // "String" yapılması gereklidir.
        /*System.out.println("Parametre:");
        Yazdir parametre = String::toLowerCase;
        System.out.println(parametre.yaz(metotRef));*/
    }
}
