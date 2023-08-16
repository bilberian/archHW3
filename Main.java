package HW3;

public class Main {
    public static void main(String[] args) {

        Auto toyota = new Auto("Toyota", "Corolla", "White", 4);
        Auto4Clean cleaner = new Auto4Clean("Traktor", "unknown", "Black", 6);
        Truck truck = new Truck("ZIL", "samosval", "Grey", 12, 30000);

        System.out.println(toyota);
        System.out.println(cleaner);
        cleaner.streetClean();
        truck.deliver();
    }
}
