public class Engine {

    private int hp;
    private double litre;
    private String fuel_type;

    public Engine(int hp, double litre, String fuel_type) {

        this.hp = hp;
        this.litre = litre;
        this.fuel_type = fuel_type;

        }

        public void engineInfo() {

        System.out.println("Aracınız " + hp + " Beygir Gücüne Sahip.");
        System.out.println("Aracınız " + litre + " Motora Sahip");
        System.out.println("Aracınız " + fuel_type + " 'dir'.");

        }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }
}
