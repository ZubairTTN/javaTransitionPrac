package designPatterns.creationalDesignPatterns.builderPattern.factoryPattern;

public class WithoutFactory {
    public static void main(String[] args) {
        String type = "car";
        Vehicle vehicle = null;

        if (type.equalsIgnoreCase("car")) {
            vehicle = new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            vehicle = new Bike();
        }

        if (vehicle != null) {
            vehicle.drive();
        }
    }
}

interface Vehicle {
    void drive();
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding Bike...");
    }
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Car...");
    }
}

class Truck implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Driving Truck");
    }
}