package designPatterns.structuralDesignPattern.proxyDesignPattern.withProxy;

public class LoggingImageProxy implements Image{
    private RealImage realImage;
    private String fileName;

    public LoggingImageProxy(String fileName)
    {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("[LOG] display() called at " + System.currentTimeMillis());
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
        System.out.println("[LOG] display() finished");
    }
}
