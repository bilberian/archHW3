package HW3;

public class Truck extends Auto implements CargoDelivery {

    public int capacity;

    public Truck(String brand, String model, String color, int wheelNum, int capacity) {
        super(brand, model, color, wheelNum);
        capacity = this.capacity;
    }

    @Override
    public void deliver() {
        System.out.println(this.brand + " везет груз");
    }
}
