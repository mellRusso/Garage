public class СarGarage extends Garage {
    @Override
    public void addGarage(Vehicle vehicle) {
        if (!(vehicle instanceof Truck)) {
            garage[indexGarage++] = vehicle;
            System.out.println(vehicle.getName() + " добавлен в гараж");
        } else {
            System.out.println("Это гараж для легковых автомобилей");
        }
    }
}
