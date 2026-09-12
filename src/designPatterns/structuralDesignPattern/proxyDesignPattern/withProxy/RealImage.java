package designPatterns.structuralDesignPattern.proxyDesignPattern.withProxy;

/* Step 2: Create the Real Object (expensive to create) */

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(); // expensive operation happen here
    }

    private void loadFromDisk()
    {
        System.out.println("Loading " + fileName + " from Disk...");
    }

    @Override
    public void display()
    {
        System.out.println("Displaying "+ fileName);
    }
}
