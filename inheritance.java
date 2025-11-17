class Vehicle {
    String brand;

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    String model;
    String color;
    String transmission;
    String gas;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Gas: " + gas);
    }
}
    
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Vios";
        myCar.color = "Red";
        myCar.transmission = "automatic ";
        myCar.gas = "diesel";
        
        
        myCar.start();
        myCar.displayInfo();
    }
}
