
public class Telefon {
	
	private Hdd hdd;
	private Screen screen;
	private Camera camera;
	
	public Telefon(Hdd hdd, Screen screen, Camera camera) {
		super();
		this.hdd = hdd;
		this.screen = screen;
		this.camera = camera;
	}

	public Hdd getHdd() {
		return hdd;
	}

	public void setHdd(Hdd hdd) {
		this.hdd = hdd;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
	
	
	

}
