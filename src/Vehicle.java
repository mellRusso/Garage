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

    public void display() {
        System.out.println("Name: " + name + " Speed: " + speed + " Color: " + color);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Двигается со скорость." + speed + "км/ч");
    }
}
