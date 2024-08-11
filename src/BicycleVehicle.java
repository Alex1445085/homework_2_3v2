public class BicycleVehicle extends Vehicle {

    public BicycleVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
