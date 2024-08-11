public class Main {
    public static void main(String[] args) {

        CarVehicle car = new CarVehicle("car1", 4);
        CarVehicle car2 = new CarVehicle("car2", 4);
        TruckVehicle truck = new TruckVehicle("truck1", 6);
        TruckVehicle truck2 = new TruckVehicle("truck2", 8);
        BicycleVehicle bicycle = new BicycleVehicle("bicycle1", 2);
        BicycleVehicle bicycle2 = new BicycleVehicle("bicycle2", 2);
        Vehicle[] transport = new Vehicle[]{car, car2, truck, truck2, bicycle, bicycle2};
        ServiceStation station = new ServiceStation(){};

        for(Vehicle temp: transport) {
            System.out.println("\nПроверяем " + temp.getModelName());
            station.check(temp);
            temp.service();
        }
    }
}