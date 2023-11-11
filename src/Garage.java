public class Garage {

    Vehicle[] garage = new Vehicle[6];
    int indexGarage;

    public void addGarage(Vehicle vehicle) {
        garage[indexGarage++] = vehicle;
        System.out.println(vehicle.getName() + " добавлен в гараж");
    }

    public void deleteVehicle(String nameVehicle) { //удаление транспортного средства
        int index = findVehicle(nameVehicle);
        if (index != -1) {
            System.out.println(garage[index].getName() + " удалено из гаража");
            garage[index] = null;
        } else {
            System.out.println(nameVehicle + " нету в гараже");
        }
    }

    public void displayGarage() { //вывод транспортных средств
        for (Vehicle g : garage) {
            if (g != null) {
                System.out.println("Транспортное средство: " + g.getName());
            }
        }
    }

    public int findVehicle(String name) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null) {
                if (name.equals(garage[i].getName())) {
                    return i;
                }
            }
        }
        return -1;
    }
}
