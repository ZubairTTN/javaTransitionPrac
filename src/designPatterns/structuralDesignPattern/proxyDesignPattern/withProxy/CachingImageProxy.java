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
