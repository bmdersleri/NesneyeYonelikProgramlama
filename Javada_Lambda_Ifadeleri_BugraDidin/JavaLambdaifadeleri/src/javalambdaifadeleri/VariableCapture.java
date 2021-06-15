package javalambdaifadeleri;

interface Erisim {
    void yazdir();
}

public class VariableCapture {
    
    static String globalDegisken = "Global";
    String instanceDegisken = "Instance";
    
    public static void main(String[] args) {
        VariableCapture lambdaVC = new VariableCapture();
        String localDegisken = "Local";
        
        Erisim lambdaDegiskenYakala = () -> {
            String lambdaDegisken = "Lambda";
            System.out.println("Global değişken = "+ globalDegisken);
            System.out.println("Instance değişken = "+ lambdaVC.instanceDegisken);
            System.out.println("Local değişken = "+ localDegisken);
            System.out.println("Lambda içerisindeki değişken = "+ lambdaDegisken);
            
        };
        lambdaDegiskenYakala.yazdir();
    }
}
