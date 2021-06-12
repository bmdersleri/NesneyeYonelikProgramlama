public class App {
    public static void main(String[] args) throws Exception {
        Thread t1 = new ilkThreadim();
        Thread t2 = new ilkThreadim();
        t1.setPriority(1);
        t2.setPriority(10);
        
        var a = t1.getPriority();
        var b = t2.getPriority();

        t2.start();
        t1.start();

        System.out.println("======================");
        System.out.println("Ilk threadin onceligi = " + a);
        System.out.println("Ikinci threadin onceligi = " + b);
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
