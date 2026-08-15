package oops.encapsulation;

public class CarImpl {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Ferrari");
        car.setModel("Spider");
        car.setColor("Red");
        car.setYear(2026);
        car.setSpeed(120);
        System.out.println(car.getSpeed());
        System.out.println(car.getYear());
        car.accelerate(90);
        System.out.println(car.getSpeed());
        car.brake(60);
        System.out.println(car.getSpeed());

    }
}
