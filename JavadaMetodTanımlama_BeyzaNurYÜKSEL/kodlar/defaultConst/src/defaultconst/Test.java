
package defaultconst;
//default constructor devamı
public class Test {
    public static void main(String[] args){
    DefaultConst kisi1= new DefaultConst();
    kisi1.setAd("Beyza");
    kisi1.setSoyad("Yüksel");
    kisi1.setYas(20);
    
    DefaultConst kisi2 = new DefaultConst("Ayşe","Araz",45);
        System.out.println(kisi1.getAd());
        System.out.println(kisi1.getSoyad());
        System.out.println(kisi1.getYas());
    
    }
}






































//    public static void main(String[] args){
//    // default const kullanarak oluşturduğumuz nesne
//    DefaultConst kisi1 = new DefaultConst();
//    kisi1.setAd("Beyza");
//    kisi1.setSoyad("Yüksel");
//    kisi1.setYas(20);
//    
//    //override edilmiş const kullanarak oluşturduğumuz nesne
//    DefaultConst kisi2 = new DefaultConst("Ayşe","Araz",45);
//    
//    
//    }

