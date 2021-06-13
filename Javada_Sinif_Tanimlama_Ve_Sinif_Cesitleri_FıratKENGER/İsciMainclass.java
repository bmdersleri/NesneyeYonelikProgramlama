
public class Siniflar2 {
    
    public static void main(String[] args) {    
     İsci isci1 = new İsci(1985,45,2000.0,"Fırat");
     System.out.println("Vergi: " + isci1.vergi());
     System.out.println("Ekstramaas: " + isci1.ekstramaas());
     System.out.println("Maasartisi: " + isci1.maasartisi());
     double toplammaas = isci1.maas - isci1.vergi() + isci1.ekstramaas();
     System.out.println("Toplam maas = " + toplammaas);
     System.out.println("Maas artısı ile birlikte toplam maas = " + (isci1.maas + isci1.maasartisi()));
    }
    
}
