
package erisimbelirleyiciler;



public class OrnekEv {
    
    
    private void kasa(){  //private metod tanımladık
         
        System.out.println("Ev kasası şifresi: ");
        
    }
    private final String belge = "Ev ve arsa tapuları"; //private değişkeni tanımladık
     
    public void adres(){   //public metod tanımladık
            
           System.out.println("Ev adres no: ");
           
    }
    public int adresNo= 8; // public değişken tanımladık
    
    protected void bilgisayar(){  //protected metot tanımladık
         
         System.out.println("Fatura : ");
         
    }
    protected String internet = "internet"; //protected değişken tanımladık
    public static void main(String[] args) {
        OrnekEv anne= new OrnekEv();
        anne.adres();
        System.out.println(anne.belge);
        
        
        
    }
    
}
