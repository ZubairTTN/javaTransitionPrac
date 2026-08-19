package interfaces.defaultMethodAmbig;

public class HybridVehicle implements Petrol, Electric{
    @Override
    public void fuel() {
        System.out.println("A hybrid vehicle can use both electricity and Petrol as Fuel");
    }
}

class Main{
    public static void main(String[] args) {
        HybridVehicle hybridVehicle = new HybridVehicle();
        hybridVehicle.fuel();
    }
}
