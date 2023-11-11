public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("Car двигается со скоростью" + getSpeed() + "км/ч");
    }

    Car(String name, int speed, String color) {
        super(name, speed, color);
    }
}
