package javalambdaifadeleri;

public class LambdaThread {
    public static void main(String[] args) {
        // Lambda ifadesi kullanmadan Thread
        Thread thread = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Kullanımı");
            }
        });
        thread.start();
        
        // Lambda ifadesi kullanarak Thread
        Thread lambdaThread = new Thread(() -> System.out.println("Thread Kullanımı"));
        lambdaThread.start();
    }
}
