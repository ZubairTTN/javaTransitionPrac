package designPatterns.structuralDesignPattern.proxyDesignPattern.withProxy;

/* Step 4: Client code */

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("Photo.png");
        System.out.println("Image object created. Nothing loaded yet");

        // Loading happens only now, on first display() call
        image.display();

        System.out.println("Calling Display() again...");

        // Second call - no reloading, real image already exists
        image.display();
    }
}

/* Notice: the client only ever talks to Image. It has no idea whether it's holding a RealImage or a ProxyImage — same interface, same method calls. But the proxy quietly delayed the expensive disk-loading until it was actually needed, and avoided reloading on the second call. */