package HW3;

public class Auto4Clean extends Auto implements StreetClean {

    public Auto4Clean(String brand, String model, String color, int wheelNum) {
        super(brand, model, color, wheelNum);

    }

    @Override
    public void streetClean() {
        System.out.println(this.brand + " cleans the street");
    }

}
