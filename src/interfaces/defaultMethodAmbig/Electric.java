package interfaces.defaultMethodAmbig;

public interface Electric {
//    private static String fuel; Note: interface cannot have private static or non-static fields.
    public default void fuel()
    {
        System.out.println("Electric vehicles use electricity as fuel");
    }
}

