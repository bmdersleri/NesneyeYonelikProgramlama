public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new ilkThreadim();
        t1.start();
    }
}
class ilkThreadim extends Thread{
    public void run(){
        for (int i = 0; i < 11; i++) {
            System.out.println("1.Threadin " + i + "/10 u bitti.");
        }
    }
}
