package JenerikSiniflar;

import java.util.ArrayList;
import java.util.List;

public class Ornek2 {
	public static class Urun {
	}

	public static class Musteri {
	}

	public static class Siparis {
	}

	public static class Servis<T> {
		List<T> varliklar = new ArrayList<T>();

		List<T> hepsiniListele() {
			return varliklar;
		}

		T getir(int kimlik) {
			return varliklar.get(kimlik);
		}

		void ekle(T varlik) {
			varliklar.add(varlik);
		}

		void guncelle(int kimlik, T varlik) {
			varliklar.set(kimlik, varlik);
		}

		void sil(int kimlik) {
			varliklar.remove(kimlik);
		}

		void sil(T varlik) {
			varliklar.remove(varlik);
		}
	}

	public static void main(String[] args) {
		Servis<Urun> urunServisi = new Servis<Urun>();
		urunServisi.ekle(new Urun());
		urunServisi.ekle(new Urun());
		for (Urun urun : urunServisi.hepsiniListele())
			System.out.println("- " + urun);

		System.out.println();

		Servis<Musteri> musteriServisi = new Servis<Musteri>();
		musteriServisi.ekle(new Musteri());
		for (Musteri musteri : musteriServisi.hepsiniListele())
			System.out.println("- " + musteri);

		System.out.println();

		Servis<Siparis> siparisServisi = new Servis<Siparis>();
		siparisServisi.ekle(new Siparis());
		siparisServisi.ekle(new Siparis());
		siparisServisi.ekle(new Siparis());
		for (Siparis siparis : siparisServisi.hepsiniListele())
			System.out.println("- " + siparis);

		System.out.println();

		siparisServisi.sil(siparisServisi.getir(0));
		for (Siparis siparis : siparisServisi.hepsiniListele())
			System.out.println("- " + siparis);
	}

}
