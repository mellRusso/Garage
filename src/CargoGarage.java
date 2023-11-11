public class CargoGarage extends Garage {

    int quantityOfTrucks;
    int quan;

    CargoGarage(int quantityOfTrucks) {
        this.quantityOfTrucks = quantityOfTrucks;
    }

    @Override
    public void addGarage(Vehicle vehicle) {
        if (vehicle instanceof Truck) {
            if (quan < quantityOfTrucks) {
                garage[indexGarage++] = vehicle;
                System.out.println(vehicle.getName() + " добавлен в гараж");
                quantityOfTrucks++;
            } else {
                System.out.println("Количество превышено! Больше нельзя добавить грузовик");
            }
        } else {
            System.out.println("Это грузовой гараж!");
        }
    }
}
