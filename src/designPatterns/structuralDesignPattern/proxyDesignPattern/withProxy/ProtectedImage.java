package designPatterns.structuralDesignPattern.proxyDesignPattern.withProxy;

public class ProtectedImage implements Image{
    private RealImage realImage;
    private String fileName;
    private String userRole;

    public ProtectedImage(String fileName, String userRole)
    {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    @Override
    public void display()
    {
        if (!userRole.equalsIgnoreCase("Admin"))
        {
            System.out.println("Access denied. Admins only.");
            return;
        }
        if(realImage == null)
        {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
