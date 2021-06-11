package StringTokenizerConstructors;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {


		//////////////////////StringTokenizer Constructor Type-1//////////////////////
		
		String cumle1 = "1 2 3 4";
		StringTokenizer st1 = new StringTokenizer(cumle1);
		System.out.println(st1.nextElement());
		System.out.println(st1.nextElement());
		
		//////////////////////StringTokenizer Constructor Type-2//////////////////////
		
		String cumle2 = "Ankara . İstanbul : Burdur , Hatay @Adana";
		StringTokenizer st2 = new StringTokenizer(cumle2,":");
		System.out.println(st2.nextElement());
		System.out.println(st2.nextElement());
		
		//////////////////////StringTokenizer Constructor Type-3//////////////////////
		
		String cumle3 = "Ankara . İstanbul : Burdur , Hatay @Adana";
		StringTokenizer st3 = new StringTokenizer(cumle3,":",true);
		
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextElement());
		}	
	}
} 

