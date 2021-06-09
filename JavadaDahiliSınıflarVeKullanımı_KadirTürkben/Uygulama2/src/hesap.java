class islem {
	 
	static class fhesapla{
		 void factoriyel(int x) {
			 int sonuc = 1;
			 for(int i =1;i<=x;i++){
				 sonuc =sonuc*i;
			 }
			 System.out.println("Faktöriyel sonucu = "+ sonuc);
		 }
	 }
	 class sinifenbuyuk{
		public void calistir() {
			int [] dizi = {2,5,7,1,3,4,9,10};
			int enbuyuk=dizi[0];
			for(int i=0;i<dizi.length;i++) 
			{
				if(dizi[i]>enbuyuk) {
					enbuyuk=dizi[i];
				}
			}
			System.out.println("Dizideki en büyük sayý = " + enbuyuk);
		}
	}
	
}
public class hesap {

	public static void main(String[] args) {
		islem.fhesapla fsonuc=new islem.fhesapla();
		fsonuc.factoriyel(5);
		
		islem i1 = new islem();
		islem.sinifenbuyuk e1=i1.new sinifenbuyuk();
		e1.calistir();
	}
}
