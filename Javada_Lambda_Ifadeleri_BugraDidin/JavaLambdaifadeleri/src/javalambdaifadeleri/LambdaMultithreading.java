package javalambdaifadeleri;

public class LambdaMultithreading {
    public static void main(String[] args) {
        
        // Lambda ifadesi kullanmadan Multithreading
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName() + " i = " + i);
                try { Thread.sleep(200); } catch(InterruptedException e) {}
                }
            }
        };
        
        // Lambda ifadesi kullanarak Multithreading
        Runnable r2 = () -> {
            for (int i=0; i<3; i++) {
                System.out.println(Thread.currentThread().getName() + " i = " + i);
                try { Thread.sleep(200); } catch(InterruptedException e) {}
                }
        };
        
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
    }
}
