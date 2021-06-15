
public class Hdd {

	private String model;
	
	private int kapasite;
	
	private int rpm;

	public Hdd(String model, int kapasite, int rpm) {
		super();
		this.model = model;
		this.kapasite = kapasite;
		this.rpm = rpm;
	}
	
	public void hddHazirla() {
		
		System.out.println("HDD Açýlýþ Ýçin Hazýrlanýyor...");
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKapasite() {
		return kapasite;
	}

	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	
	
}
