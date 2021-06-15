public class Door {

    private int doorCount;

    public Door(int doorCount) {
        this.doorCount = doorCount;
    }

    public void doorInfo() {

        System.out.println("Aracınız " + doorCount + " Kapılıdır.");
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
