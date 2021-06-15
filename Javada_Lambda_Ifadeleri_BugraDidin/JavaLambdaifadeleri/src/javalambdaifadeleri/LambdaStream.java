package javalambdaifadeleri;

import java.util.ArrayList;
import java.util.List;

public class LambdaStream {
    public static void main(String[] args) {
        List<String> hayvanlar = new ArrayList<>();
        hayvanlar.add("Etçil, Kaplan");
        hayvanlar.add("Otçul, Zürafa");
        hayvanlar.add("Etçil, Aslan");
        hayvanlar.add("Etçil, Kurt");
        hayvanlar.add("Hepçil, Maymun");
        
        hayvanlar.stream()
                .filter(x -> x.startsWith("Etçil"))
                .map(x -> x.toUpperCase())
                .sorted()
                .forEach(x -> System.out.println(x));
    }
}
