public class GarageManager {

    public static void main(String[] args) {

        Garage garage = new Garage();
        Vehicle car = new Car("Lamborghini", 350, "red");
        Vehicle bicyle = new Bicycle("Stels Navigator 500 V26", 70, "blue");
        Vehicle boat = new Boat("Gladiator E420X", 50, "green");
        Vehicle motorcycle = new Motorcycle("Yamaha YZF-R1", 270, "yellow");
        Vehicle truck = new Truck("DAF XF 105", 85, "black");

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

    }
}
