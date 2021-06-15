public class Car {

    private Engine engine;
    private Door door;
    private Headlight headlight;
    private Wheels wheels;

    public Car(Engine engine, Door door, Headlight headlight, Wheels wheels) {
        this.engine = engine;
        this.door = door;
        this.headlight = headlight;
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Headlight getHeadlight() {
        return headlight;
    }

    public void setHeadlight(Headlight headlight) {
        this.headlight = headlight;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}
