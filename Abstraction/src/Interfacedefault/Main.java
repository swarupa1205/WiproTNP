package Interfacedefault;

interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {

    @Override
    public void message() {
        Vehicle.super.message();   // Calling Vehicle interface method
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.message();
    }
}