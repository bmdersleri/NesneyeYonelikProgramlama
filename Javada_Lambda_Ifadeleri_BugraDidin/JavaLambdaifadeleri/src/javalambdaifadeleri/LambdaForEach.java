package javalambdaifadeleri;

import java.util.Arrays;
import java.util.List;

public class LambdaForEach {
    public static void main(String[] args) {
        StringBuilder kelime = new StringBuilder();
        List<Character> harfler = Arrays.asList('S','e','l','a','m');
        
        harfler.forEach( h -> {
            System.out.println(h);
            kelime.append(h);
        });
        System.out.println("Elde edilen kelime = "+ kelime);
    }
}
