package designPatterns.structuralDesignPattern.proxyDesignPattern.withoutProxy;

public class RealImage {
    private String fileName;

    public RealImage(String fileName)
    {
        this.fileName = fileName;
//        loadFromDisk(fileName); // expensive! happens immediately
    }

    private void loadFromDisk(String fileName)
    {
        System.out.println("Loading " + fileName + " from disk...");
    }

    public void display()
    {
        System.out.println("Displaying " + fileName);
    }
}

/* Problems:

If you create a RealImage object, it immediately loads from disk — even if you never actually call display(). That's wasted time and memory.
There's no way to add extra checks (like "is this user allowed to view this?") without cluttering RealImage itself.
Every client using RealImage directly is tightly coupled to it — you can't slip in logging, caching, or access control without modifying RealImage's code.

The Proxy Pattern solves this by inserting a stand-in object that controls when/how the real object gets used.

The Structure
        Image (interface)
        /            \
   RealImage      ProxyImage
  (the real,      (stands in for RealImage,
   expensive       controls when it's created
   object)         and accessed) */