public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new ilkThreadim();
        Thread t2 = new ilkThreadim();

        var a = t1.isAlive();
        var b = t2.isAlive();

        t1.start();

        System.out.println("======================");
        System.out.println("T1 Threadi calisiyor mu ? = " + a);
        System.out.println("T2 Threadi calisiyor mu ? = " + b);
        System.out.println("======================");
    }
}
class ilkThreadim extends Thread{
    public void run(){
        for (int i = 0; i < 11; i++) {
            System.out.println("1.Threadin " + i + "/10 u bitti.");
        }
    }
}
