package isimsizsiniflar;

 class arac {
	public void  göster() {
		System.out.println("Kamyon");
	}
} 

public class isimsizsinifx {

	public static void main(String[] args) {
		
       arac marka = new arac() {
    	 public void göster() {
    		 System.out.println("Motorsiklet");
    	 } 
    	 
       };
       marka.göster();
	}
}
