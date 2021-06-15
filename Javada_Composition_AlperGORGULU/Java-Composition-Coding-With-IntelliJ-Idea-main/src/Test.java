public class Test {

    public static void main(String[] args) {

        Engine engine = new Engine(90,1.6,"Benzin");

        Door door = new Door(4);

        Headlight headlight = new Headlight("Mercek");

        Wheels wheels = new Wheels(17);

        Car car = new Car(engine,door,headlight,wheels);

        car.getDoor().doorInfo();
        car.getEngine().engineInfo();
        car.getHeadlight().headlightInfo();
        car.getWheels().wheelsInfo();

    }
}
