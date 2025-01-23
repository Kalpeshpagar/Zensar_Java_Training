abstract class Car {
    public abstract void fuelType();

    public void colorType(String color) {
        System.out.println("Color type : " + color);
    }

}

class Tata extends Car {
    public void fuelType() {
        System.out.println("Petrol");
    }   

}

public class Abstracton {
    public static void main(String[] args) {
        Tata t = new Tata();
        t.fuelType();
        t.colorType("Gray");
    }
}
