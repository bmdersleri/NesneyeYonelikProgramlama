package JenerikSiniflar;

public class Ornek {
	public static class Otomobil {
	}

	public static class AgirVasita {
	}

	public static class Tekne {
	}

	public static class Araba extends Otomobil {
	}

	public static class Kamyon extends AgirVasita {
	}

	public static class Otobus extends AgirVasita {
	}

	public static class YatTeknesi extends Tekne {
	}

	public static class Tezgah<TArac extends Otomobil> {
		TArac arac;

		public Tezgah(TArac arac) {
			this.arac = arac;
		}

		TArac tamir() {
			System.out.println("Araç tamir edildi.");
			return arac;
		}

		TArac lastikDegistir() {
			System.out.println("Aracýn lastikleri deðiþtirildi.");
			return arac;
		}

		TArac bakim() {
			System.out.println("Aracýn bakýmlarý tamamlandý.");
			System.out.println("Aracýn fren balatalarý deðiþtirildi.");
			return arac;
		}

	}

	public static void main(String[] args) {
		Tezgah<Araba> tezgah = new Tezgah<Araba>(new Araba());
		tezgah.lastikDegistir();
		Araba araba = tezgah.bakim();

		Tezgah<Kamyon> tezgah2 = new Tezgah<Kamyon>(new Kamyon());
		Kamyon kamyon = tezgah2.lastikDegistir();

		Tezgah<Otobus> tezgah3 = new Tezgah<Otobus>(new Otobus());
		Otobus otobus = tezgah3.bakim();

		Tezgah<YatTeknesi> tezgah4 = new Tezgah<YatTeknesi>(new YatTeknesi());
		YatTeknesi yatTeknesi = tezgah4.tamir();
	}

}
