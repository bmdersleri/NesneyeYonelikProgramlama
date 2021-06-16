package paket1;

public  class kütüphane {
   public String adi;
    protected String yazari;
    int sayfa_sayisi;
    private int basim_yili;
   
   public  void rezerve_et(String adi,String yazari,int sayfa_sayisi,int basim_yili){
       adi=adi;
       yazari=yazari;
       sayfa_sayisi=sayfa_sayisi;
       basim_yili=basim_yili;
       
       System.out.println("Adi= "+adi+" yazari= "+yazari+ " sayfa sayısı= " +sayfa_sayisi +" basım yılı= "+basim_yili);
   }
   
  protected void ad(String adi){
       adi=adi;

       
       System.out.println("Adi= "+adi);
   }
   
  void yazari(String yazari){

       yazari=yazari;

       System.out.println(" yazari= "+yazari);
   }
private  void adiyazari(String adi,String yazari){
       adi=adi;
       yazari=yazari;
       
       System.out.println("Adi= "+adi+" yazari= "+yazari);
   }
}
