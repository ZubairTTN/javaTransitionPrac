package designPatterns.structuralDesignPattern.proxyDesignPattern.withProxy;

public class CachingImageProxy implements Image{
    private RealImage realImage;
    private String fileName;
    private boolean isDisplayed = false;

    public CachingImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (!isDisplayed) {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
            isDisplayed = true;
        } else {
            System.out.println("Returning cached view of " + fileName);
        }
    }
}

/* 4. Remote Proxy

Represents an object that lives in a different address space (like on a remote server). The proxy handles the network communication, while the client just calls methods like normal. Java's own RMI (Remote Method Invocation) is built on exactly this idea — you call a method on what looks like a local object, but the proxy quietly sends it over the network.

5. Caching Proxy

Stores results of expensive operations, and returns cached results for repeated calls instead of redoing the work. */