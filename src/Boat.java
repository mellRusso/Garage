public class Boat extends Vehicle {

    Boat(String name, int speed, String color) {
        super(name, speed, color);
    }

    @Override
    public void move() {
        System.out.println("Boat двигается со скоростью" + getSpeed() + "км/ч");
    }
}
