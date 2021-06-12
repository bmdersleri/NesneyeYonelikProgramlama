public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new ilkThreadim();
        Thread t2 = new ikinciThreadim();
        t1.start();
        t1.join();
        t2.start();
    }
}
class ilkThreadim extends Thread{
    public void run(){
        for (int i = 0; i < 11; i++) {
            System.out.println("1.Threadin " + i + "/10 u bitti.");
        }
    }
}

class ikinciThreadim extends Thread {
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println("2.Threadin " + i + "/10 u bitti.");
        }
    }
}
