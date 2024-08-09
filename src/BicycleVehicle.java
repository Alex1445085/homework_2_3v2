public class BicycleVehicle {

    private String modelName;
    private int wheelsCount;

    public BicycleVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() { return modelName; }
    public int getWheelsCount() { return wheelsCount;}
    public void setModelName(String modelName) { this.modelName = modelName; }
    public void setWheelsCount(int wheelsCount) { this.wheelsCount = wheelsCount; }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void check() {
        System.out.println("RepairShop can't do it!");
    }
}
