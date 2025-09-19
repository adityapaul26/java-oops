import java.util.*;

public class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }

    void displayInfo(){
        System.out.println("Brand :"+ brand);
        System.out.println("Speed :"+ speed);
    }

    void fuelType(){
        System.out.println("Generic fuel");
    }
}

class Car extends Vehicle{
    int seats;

    Car(String brand, int speed, int seats){
        super(brand,speed);
        this.seats=seats;
    }

    @Override
    void fuelType(){
        System.out.println("Petrol or Diesel");
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Number of seats:" + seats);
    }
}

class ElectricCar extends Car{
    int batteryCapacity;

    ElectricCar(String brand, int speed, int seats, int batteryCapacity){
        super(brand, speed, seats);
        this.batteryCapacity=batteryCapacity;
    }

    @Override
    void fuelType(){
        System.out.println("Electric");
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("The battery capacity is:"+batteryCapacity);
    }
}

class VehicleMain{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("GenericBrand",80);
        Vehicle v2 = new Car("Toyota",120,5);
        Vehicle v3 = new ElectricCar("Tesla",200,5,75);

        Vehicle[] vehicles={v1,v2,v3};

        for(Vehicle v: vehicles){
            v.displayInfo();;
            v.fuelType();
            System.out.println("---------------------------------");
        }
    }
}
