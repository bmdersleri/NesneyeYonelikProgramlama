
class evsinifi{
	int toplamboyut;
	
	static class yatakodasi{
		
		void boyut(int x) {
			System.out.println(x+"metre kare");
		}
	}
}



public class DahiliSinif {

	public static void main(String[] args) {
		
        evsinifi.yatakodasi y1= new evsinifi.yatakodasi();
        
        y1.boyut(30);
        		
	}

}
