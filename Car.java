package HW3;

public abstract class Car {
    public String brand;
    public String model;
    public String color;
    public int wheelNum;

    public Car(String brand, String model, String color, int wheelNum) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.wheelNum = wheelNum;
    }
    public void drive(){
        System.out.println(this.brand + " поехала");
    };
    public void service(){
        System.out.println(this.brand + " на ремонте");
    };
    public void gearShift(){
        System.out.println(this.brand + " едет на другой скорости");
    };
    public void lightsOn(){
        System.out.println("У " + this.brand + " включены фары");
    };
    public void wipersOn(){
        System.out.println("У " + this.brand + " включены дворники");
    };

    public String toString() {
        return "Car " + this. color + " " + this.brand;
    }
   
}
