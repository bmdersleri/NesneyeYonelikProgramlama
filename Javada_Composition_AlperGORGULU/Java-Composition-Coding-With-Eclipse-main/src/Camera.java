
public class Camera {
	
	private String marka;
	
	private String cozunurluk;

	public Camera(String marka, String cozunurluk) {
		super();
		this.marka = marka;
		this.cozunurluk = cozunurluk;
	}
	
	public void cozunurlukBilgisi () {  // Java Naming Convention --> lower camel case
		
		System.out.println("Kameranýzýn Çözünürlüðü :" + cozunurluk);
		
				
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getCozunurluk() {
		return cozunurluk;
	}

	public void setCozunurluk(String cozunurluk) {
		this.cozunurluk = cozunurluk;
	}
	
	
	

}
