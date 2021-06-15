public class Headlight {

    private String model;

    public Headlight(String model) {
        this.model = model;
    }

    public void headlightInfo() {

        System.out.println("Farınız " + model + " 'dir.");

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
