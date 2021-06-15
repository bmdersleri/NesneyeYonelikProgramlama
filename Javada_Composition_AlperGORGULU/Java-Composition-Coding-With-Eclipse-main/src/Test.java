
public class Test {

	public static void main(String[] args) {
		
		
		Resolution resolution = new Resolution(1920,1080);
		
		Screen screen = new Screen("Samsung","Note 5", "6.5",resolution);
		
		Camera camera = new Camera("Sony", "15 Mp");
		
		Hdd hdd = new Hdd("WD", 500, 7200);
		
		Telefon telefon = new Telefon(hdd, screen, camera);
		
		telefon.getCamera().cozunurlukBilgisi();
		
		telefon.getHdd().hddHazirla();
		
		telefon.getScreen().ekraniKapat();
		
		
		
		
		
		
		
		

	}

}
