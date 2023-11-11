public class Truck extends Vehicle {
    Truck(String name, int speed, String color) {
        super(name, speed, color);
    }

    @Override
    public void move() {
        System.out.println("Truck двигается со скоростью" + getSpeed() + "км/ч");
    }
}
