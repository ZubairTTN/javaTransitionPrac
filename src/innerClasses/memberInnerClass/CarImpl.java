package innerClasses.memberInnerClass;

public class CarImpl {
    public static void main(String[] args) {
        Car car = new Car("Tata Safari");
        Car.Engine safariEngine = car.new Engine();
        safariEngine.start();
        safariEngine.start();

        safariEngine.stop();
        safariEngine.stop();


    }
}
