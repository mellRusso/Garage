import java.util.Scanner;

public class GarageManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Garage garage = new Garage();
        Car car = new Car("Lamborghini", 350, "red");
        Bicycle bicyle = new Bicycle("Stels Navigator 500 V26", 70, "blue");
        Boat boat = new Boat("Gladiator E420X", 50, "green");
        Motorcycle motorcycle = new Motorcycle("Yamaha YZF-R1", 270, "yellow");
        Truck truck = new Truck("DAF XF 105", 85, "black");

        //добавляем транспортные средства в гараж
        garage.addGarage(car);
        garage.addGarage(bicyle);
        garage.addGarage(boat);
        garage.addGarage(motorcycle);
        garage.addGarage(truck);

        //выводим список транспортных средств находящихся в гараже
        garage.displayGarage();

        //удаляем транспортные средства из гаража
        garage.deleteVehicle("Lamborghini");

        garage.displayGarage();


        CargoGarage cargoGarage = new CargoGarage(4); //создаем грузовой гараж
        cargoGarage.addGarage(truck);//добавляем
        cargoGarage.displayGarage();//выводим

        //после добавления транспортного средства в гараж появилась возможность менять характеристики
        garage.changeСolor(motorcycle, "red");

        //тоже самое касается и скорости
        garage.changeSpeed(bicyle, 90);

        //добавление гаража для легковых автомобилей
        //как видим добавляются только легковые автомобили
        СarGarage carGarage = new СarGarage();
        carGarage.addGarage(car);
        carGarage.addGarage(bicyle);
        carGarage.addGarage(boat);
        carGarage.addGarage(motorcycle);
        carGarage.addGarage(truck);
        System.out.println("/////");

        for (int i = 0; i < garage.garage.length; i++) { //демонстрация полиморфного поведения транспортных средств при вызове метода move().
            if (garage.garage[i] != null) {
                garage.garage[i].move();
            }
        }

        //cимуляция работы гаража!
        while (true) {
            System.out.println("Ваше транспортное средство добавлено в гараж? ");
            System.out.println("1. Да");
            System.out.println("2. Нет");
            int result = scanner.nextInt();
            scanner.nextLine();
            if (result == 1) {
                System.out.println("Название?");
                String name = scanner.nextLine();
                int indexGarage = garage.findVehicle(name);
                if (indexGarage != -1) {
                    printMenu();
                    int num = scanner.nextInt();
                    if (num == 1) {
                        System.out.println("На какой цвет желаете поменять?");
                        String color = scanner.next();
                        garage.changeСolor(garage.garage[indexGarage], color);
                    } else if (num == 2) {
                        System.out.println("На какую скорость желаете поменять?");
                        int speed = scanner.nextInt();
                        garage.changeSpeed(garage.garage[indexGarage], speed);
                    } else if (num == 3) {
                        garage.garage[indexGarage].display();
                    } else if (num == 4) {
                        break;
                    }
                }
            } else {
                System.out.println("Добавьте ваше транспортное средство в гараж!");
            }
        }
    }
    public static void printMenu() {
        System.out.println("1. Поменять цвет транспортного средства");
        System.out.println("2. Поменять скорость транспортного средства");
        System.out.println("3. Вывести информацию о транспорте");
        System.out.println("4. Выход");
    }
}
