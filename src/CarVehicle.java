public class CarVehicle extends Vehicle {

    public CarVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        /**for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }*/
        super.service();
        checkEngine();
    }
}



