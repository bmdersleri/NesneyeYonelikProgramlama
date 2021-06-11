package StringTokenizerUygulamaOrnekleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		//////////////////////StringTokenizer Uygulama Örneği-1//////////////////////
		
		String metin = "BM . dersleri , youtube : kanalı";
		StringTokenizer stringTokenizer = new StringTokenizer(metin,":,");

		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}

		//////////////////////StringTokenizer Uygulama Örneği-2//////////////////////

		String metin2 = "Herkese merhaba arkadaşlar";
		StringTokenizer stringTokenizer2 = new StringTokenizer(metin2);
	
		System.out.println(stringTokenizer2.countTokens());

		//////////////////////StringTokenizer Uygulama Örneği-3//////////////////////

		String metin3 = "Mehmet-Akif-Ersoy Üniversitesi//Mühendislik-/Mimarlık/Fakültesi";
		StringTokenizer stringTokenizer3 = new StringTokenizer(metin3,":,");
		System.out.println(stringTokenizer3.countTokens());

		while (stringTokenizer3.hasMoreTokens()) {
			System.out.println(stringTokenizer3.nextToken());
		}

		//////////////////////StringTokenizer Uygulama Örneği-4//////////////////////
		
		String metin4 = "Ankara .: İstanbul .: Burdur ,,: Hatay ,@Adana";
		String sinirlayici = ":,.";
		StringTokenizer stringTokenizer4 = new StringTokenizer(metin4,sinirlayici);

		while (stringTokenizer4.hasMoreTokens()) {
			System.out.println(stringTokenizer4.nextElement());
		}


		//////////////////////Extra//////////////////////

		File file = new File("C:/Users/emrealkan/Desktop/veritabanı.txt");        
		Scanner oku = new Scanner(file);

		while(oku.hasNextLine())
		{
			StringTokenizer st = new StringTokenizer(oku.nextLine(),",");
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}	 
		}
		oku.close();
	}
}
