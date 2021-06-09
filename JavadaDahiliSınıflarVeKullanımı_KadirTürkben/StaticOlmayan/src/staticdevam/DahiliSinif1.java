package staticdevam;

class hesaplama{
	public class cikarma{
		public int cikar(int x, int y) 
		{
			return x-y;	
		}
	}

	public static void main(String[] args) {
		
		int sonuc;
	hesaplama.cikarma c1=new hesaplama(). new cikarma();
	sonuc=c1.cikar(10,4);
	
	System.out.println(sonuc);
	}
}