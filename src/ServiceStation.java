public interface ServiceStation {

    default void check(Vehicle obj) {
        System.out.println(obj.getModelName() + ", has a " + obj.getWheelsCount() + " wheels");
    }

    default void service() {
        System.out.println("RepairShop can't do it!");
    }

    ;
    //super.check(obj);
    /**if (car != null) {
     System.out.println("Обслуживаем " + car.getModelName());
     for (int i = 0; i < car.getWheelsCount(); i++) {
     car.updateTyre();
     }
     car.checkEngine();
     } else if (truck != null) {
     System.out.println("Обслуживаем " + truck.getModelName());
     for (int i = 0; i < truck.getWheelsCount(); i++) {
     truck.updateTyre();
     }
     truck.checkEngine();
     truck.checkTrailer();
     } else if (bicycle != null) {
     System.out.println("Обслуживаем " + bicycle.getModelName());
     for (int i = 0; i < bicycle.getWheelsCount(); i++) {
     bicycle.updateTyre();
     }
     }*/

}
