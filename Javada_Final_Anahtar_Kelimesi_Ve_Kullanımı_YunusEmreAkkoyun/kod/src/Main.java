
public class Main extends Daire {

	public static void main(String[] args) {
		/**
         * Fark edildiði üzere final deðisken isimleri class tanýmlamalarýnda
         * olduðu gibi pascal case yazý tipi olmayýp komple büyük harflerle
         * yazýlmýþltýr ve boþluklarý alt çizgiler oluþturmuþtur. Bu tanýmlamanýn haricinde
         * final deðiþken isimlerini pascal case kullansaydýk derleyici sorunsuz çalýþacaktý ancak
         * final anahtar kelimesi için büyük harf kullanmak tüm yazýlýmcýlar tarafýndan bilinen
         * ve kullanýlan yazýlý olamyan bir kuraldýr.
         */
        final int DEGISMEZ_YUKSEKLIK = 10;
        final int DEGISMEZ_EN = 20;

        int alan_hesapla = DEGISMEZ_YUKSEKLIK * DEGISMEZ_EN;
        final int ALAN_HESAPLA_FINAL = DEGISMEZ_YUKSEKLIK * DEGISMEZ_EN;
        /**
         *  fark edildiði üzere final anahtar kelimesi ile tanýmlanan bir deðiþkenin atamasýnda
         *  farklý diðer iki deðiþkenin çarpmasýný yapabiliyoruz ayrýca buna toplama çýkarma bölme
         *  ve diðer aritmatik iþlemler de dahil
         */
       // ALAN_HESAPLA_FINAL += 50; // hata
        alan_hesapla += 50;
        /** yukarýdaki iþleme bakacak olursak deðiþkenlere sonradan deðer eklemeye kalkýþtýðýmýzda
         * daha doðrusu önceden atanmýþ bir deðiþkeni deðiþtirmeye kalktýðýmýz zaman final tanýmlanan
         * deðiþken bize hata fýrlatýr "java: cannot assign a value to final variable " þeklinde
         * bu yüzden satýr 23 hata verir ancak satýr 24 sorunsuz çalýþýr. Kýsacasý final anahtar kelimesi
         * deðiþkenlerde bize saðladýðý fayda 'eðer deðiþken tanýmlanmýþsa bu deðiþkeni sonraki kod satýrlarýmýzda
         * deðiþtirememize olanak saðlar'. Bunun faydasýný daha çok kütüphane oluþtururken veya büyük ölçekli
         * projelerde, deðiþmemesi gereken bir deðiþkeni sonradan yalnýþlýkla yazýlýmcýnýn deðiþtirmemesini önler
         * ve onu uyarýr.Bu ve benzeri durumlarda kullanýlmasý tavsiye edilir
         *
         */
        System.out.println(alan_hesapla);
        System.out.println(ALAN_HESAPLA_FINAL);
        System.out.println(Daire.cevrehesapla(5));
        System.out.println(Daire.Kup.HACIM);

	}

}
