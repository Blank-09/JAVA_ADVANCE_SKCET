import java.util.*;

class Vehicle {
    protected String type;
    
    Vehicle(String type) {
        this.type = type;
    }
    
    public void displayType() {
        System.out.println("Type: " + type);
    }
}

class Car extends Vehicle {
    private String brand;
    
    Car(String type, String brand) {
        super(type);
        this.brand = brand;
    }
    
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String brand = sc.nextLine();
        
        Car car = new Car(type, brand);
        car.displayType();
        car.displayBrand();
    }
}