
package deneme;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;


public class Deneme {

    public static void main(String[] args) {
      try{
        File file= new File ("filename.txt");
        PrintWriter pw =new PrintWriter(file);
        pw.println("Merhaba");
        pw.println("ALİ");
        pw.close();
        System.out.println("bitti");
      
    }catch (IOException e){
        e.printStackTrace();
        }
      
    
}
}
