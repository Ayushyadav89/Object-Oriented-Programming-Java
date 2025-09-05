abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() { System.out.println("Car starts with key"); }
}

class Bike extends Vehicle {
    void start() { System.out.println("Bike starts with kick"); }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}
