public class Motorcycle extends Vehicle {
    Motorcycle(String name, int speed, String color) {
        super(name, speed, color);
    }

    @Override
    public void move() {
        System.out.println("Motorcycle двигается со скоростью" + getSpeed() + "км/ч");
    }
}
