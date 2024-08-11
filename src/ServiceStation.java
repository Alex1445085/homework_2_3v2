public interface ServiceStation {

    default void check(Vehicle obj) {
        System.out.println(obj.getModelName() + ", has a " + obj.getWheelsCount() + " wheels");
    }

    default void service() {
        System.out.println("RepairShop can't do it!");
    }
}
