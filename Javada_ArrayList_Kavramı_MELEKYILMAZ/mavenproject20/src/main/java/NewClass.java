import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class NewClass {
    public static void main(String[] args) {
        ArrayList<String>Yazilim_Dili=new ArrayList<>();
        Yazilim_Dili.add("c");
        Yazilim_Dili.add("python");
        Yazilim_Dili.add("java");
        Yazilim_Dili.add("go");
        Yazilim_Dili.add("c");
        System.out.println("yazilim_Dili ArrayListi:"+Yazilim_Dili);
        System.out.println("foreach metoduyla yazdırılacak elemanlar :");
        Yazilim_Dili.forEach((dil)->System.out.println(dil));
        
        int konum=Yazilim_Dili.indexOf("c");
        System.out.println("ArrayListte ilk c stringinin bulunduğu konum:"+konum);
        
        int sira=Yazilim_Dili.lastIndexOf("c");
        System.out.println("ArrayListte son c stringinin bulunduğu konum:"+sira);
        
        System.out.println("toArray metoduyla yazdırılacak elemanlar:");
 
        Object[]nesneler=Yazilim_Dili.toArray();
        for(Object nesne: nesneler)
            System.out.println(nesne+"");
        
        Yazilim_Dili.trimToSize();
        System.out.println("ArrayListin geçerli boyutu:"+""+Yazilim_Dili.size());
        
        List<String>Belirtilen_Bölümün_Birinci_Görünümü=Yazilim_Dili.subList(3, 5);
        System.out.println("fromIndex ve toIndex arasındaki elemanlar:"+""+Belirtilen_Bölümün_Birinci_Görünümü);
        
        List<String>Belirtilen_Bölümün_İkinci_Görünümü=Yazilim_Dili.subList(3, 3);
        System.out.println("formIndex ve toIndex arasındaki elemanlar:"+""+Belirtilen_Bölümün_İkinci_Görünümü);
        
        ArrayList<String>Listenin_Kopyası=(ArrayList)Yazilim_Dili.clone();
        System.out.println("Yazilim_Dili listesinin kopyası:"+""+Listenin_Kopyası);
        
        Listenin_Kopyası.removeAll(Listenin_Kopyası);
        System.out.println("removeAll metoduyla elemanları silinen liste:"+Listenin_Kopyası);
        
        ArrayList<String>canta=new ArrayList<>();
        canta.add("kalem");
        canta.add("silgi");
        canta.add("defter");
        
        ArrayList<String>dolap=new ArrayList<>();
        dolap.add("defter");
        dolap.add("kitap");
        dolap.add("ayraç");
        
        System.out.println("metod uygulanmadan önceki çanta içeriği:"+canta);
        System.out.println("metod uygulanmadan önceki dolap içeriği:"+dolap);
        
        dolap.retainAll(canta);
        
        System.out.println("metod uygulandıktansonra çanta içeriği:"+canta);
        System.out.println("metod uygulandıktan sonra dolap içeriği:"+dolap);
        
        ArrayList<Character>alfabe=new ArrayList<>();
        for(char i='a';i<='z';i++){
          alfabe.add(i);
        }
        System.out.println("alfabe:"+alfabe);
        Predicate<Character>pr=sesli->(sesli!='a'&sesli!='e'&sesli!='i'&sesli!='ö'&sesli!='o'&sesli!='u'&sesli!='ü');
        alfabe.removeIf(pr);
        System.out.println("sesli harfler:"+alfabe);
        
       List<Integer>sayilar=new ArrayList<>();
       sayilar.add(389);
       sayilar.add(369);
       sayilar.add(370);
       sayilar.add(259);
       sayilar.add(400);
       System.out.println("sort metodu kullanmadan önce:");
       for(Integer sayi:sayilar){
           System.out.println(sayi);
       }
       sayilar.sort(null);
       System.out.println("sort metodu uygulandıktan sonra sayıları küçükten büyüğe sıralama:");
       for(Integer sayi:sayilar){
           System.out.println(sayi);
       }
       sayilar.sort(Collections.reverseOrder());
       System.out.println("sort metodu uygulandıktan sonra sayıları büyükten küçüğe sıralama:");
       for(Integer sayi:sayilar){
           System.out.println(sayi);
       }
       sayilar.removeIf(n->(n%2==0));
       for(int i:sayilar){
           System.out.println("removeIf metodu uygulandığında çift sayılar silindiğinde oluşan yeni ArrayList:"+i);
       }
       String cümle="java en kullanışlı yazılım dili.";
       String strcümle=cümle.replaceAll("java", "c");
       System.out.println("replaceAll metodu uygulandıktan sonra oluşan string ifade:"+strcümle);
       
       
       
        
    }
   
    
 
    
}
