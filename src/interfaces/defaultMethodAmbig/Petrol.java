package interfaces.defaultMethodAmbig;

public interface Petrol {
    public default void fuel(){
        System.out.println("Normally the Vehicle's fuels is Petrol");
    }
}
