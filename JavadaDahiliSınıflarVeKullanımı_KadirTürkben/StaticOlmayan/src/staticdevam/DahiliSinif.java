package staticdevam;

class evsinifi{
	int toplamboyut;
	
	class yatakodasi{
		
		void boyut(int x) {
			System.out.println(x+"metre kare");
		}
	}
}



public class DahiliSinif {

	public static void main(String[] args) {
		
         evsinifi e1 = new evsinifi();
         evsinifi.yatakodasi y1 = e1.new yatakodasi();
         
         y1.boyut(30);
	}

}
