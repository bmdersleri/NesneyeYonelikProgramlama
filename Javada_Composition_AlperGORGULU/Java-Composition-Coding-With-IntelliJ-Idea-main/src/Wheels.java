public class Wheels {

    private int inch;

    public Wheels(int inch) {
        this.inch = inch;
    }

    public void wheelsInfo() {

        System.out.println("Jant Boyutu: " + inch);
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
