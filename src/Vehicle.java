public class Vehicle {
    private String name;
    private int speed;
    private String color;

    Vehicle(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    Vehicle() {

    }
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        System.out.println("Двигается со скорость." + speed + "км/ч");
    }
}
