package designPatterns.structuralDesignPattern.proxyDesignPattern.withProxy;

public class ProxyImage implements Image{
    private RealImage realImage; // starts as null, not created yet
    private String fileName;

    public ProxyImage(String fileName)
    {
        this.fileName = fileName;
        // no expensive loading happens here
    }

    @Override
    public void display() {
        if(realImage == null)
        {
            realImage = new RealImage(fileName); // created only on first use
        }
        realImage.display();
    }
}
