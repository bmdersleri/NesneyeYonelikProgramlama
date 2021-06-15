package javalambdaifadeleri;

public class LambdaRunnable {
    public static void main(String[] args) {
        // Lambda ifadesi kullanılmadan Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Lambda ifadesi kullanmadan Runnable");
            }
        };
        runnable.run();
        
        
        // Lambda ifadesi kullanarak Runnable 
        Runnable lambdaRunnable = () -> System.out.println("Lambda ifadesi kullanarak Runnable");
        lambdaRunnable.run();
    }
}
