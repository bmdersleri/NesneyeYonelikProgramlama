package javalambdaifadeleri;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaComparator {
    public static void main(String[] args) {
        
        // Lambda ifadeleri kullanmadan Comparator
        Integer[] sayilar = {1 , 3, 10, 17, 2};
        Arrays.sort(sayilar, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(sayilar));
        
        // Lambda ifadeleri kullanarak Comparator
        Integer[] sayilar2 = {1 , 3, 10, 17, 2};
        Arrays.sort(sayilar2, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(sayilar2));
    }
}
