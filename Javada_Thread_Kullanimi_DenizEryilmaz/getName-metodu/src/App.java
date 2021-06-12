public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new ilkThreadim();
        Thread t2 = new ilkThreadim();
        var a = t1.getName();
        var b = t2.getName();
        System.out.println("T1 Threadinin adi = "+ a);
        System.out.println("T2 Threadinin adi = "+ b);
    }
}
class ilkThreadim extends Thread{
    public void run(){
        for (int i = 0; i < 11; i++) {
            System.out.println("1.Threadin " + i + "/10 u bitti.");
        }
    }
}
