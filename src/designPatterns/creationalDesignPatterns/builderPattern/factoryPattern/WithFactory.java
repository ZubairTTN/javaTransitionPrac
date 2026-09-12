package designPatterns.creationalDesignPatterns.builderPattern.factoryPattern;
/* Instead of directly creating objects, delegate object creation to a factory. */

// 1. The Factory Class
class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }
}

// 2. Main class becomes clean and decoupled
public class WithFactory {
    public static void main(String[] args) {
        // The factory handles object creation logic
        Vehicle vehicle = VehicleFactory.getVehicle("car");

        if (vehicle != null) {
            vehicle.drive(); // Output: Driving Car...
        }
    }
}