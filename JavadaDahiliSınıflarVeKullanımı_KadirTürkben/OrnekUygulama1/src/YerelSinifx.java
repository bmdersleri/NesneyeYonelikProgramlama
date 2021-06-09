
public class YerelSinifx {

	public void calistir() {
		class yerel {
			public void bul(int a) {
				if (a % 2 == 0) {
					System.out.println("sayý çifttir");
				} else {
					System.out.println("sayý tektir");
				}
             
			}

		}
		yerel y1 = new yerel();
		y1.bul(5);
	}

}
