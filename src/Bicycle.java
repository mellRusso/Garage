public class Bicycle extends Vehicle {

    Bicycle(String name, int speed, String color) {
        super(name, speed, color);
    }

    @Override
    public void move() {
        System.out.println("Bicyle двигается со скоростью" + getSpeed() + "км/ч");
    }
}
