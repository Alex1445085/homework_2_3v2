public class Vehicle implements ServiceStation{
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() { return modelName; }
    public int getWheelsCount() { return wheelsCount; }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void servise() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
