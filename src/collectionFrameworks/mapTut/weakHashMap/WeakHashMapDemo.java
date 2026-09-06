package collectionFrameworks.mapTut.weakHashMap;

import java.util.WeakHashMap;
/* WeakHashMap<K, V> is a Map implementation where keys are held using weak references.
* If a key is no longer strongly referenced anywhere else in the application, the key can be garbage-collected, and its entry can automatically disappear from the WeakHashMap.
*  */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        
        imageCache.put(new String("img1"), new Image("Image 1"));
        imageCache.put(new String("img2"), new Image("Image 2"));

        System.out.println(imageCache);

        System.gc();
        simulateApplicationRunning();
        System.out.println("cache after running (Some entries may be cleared): " + imageCache);
    }
    private static void simulateApplicationRunning()
    {
        try{
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}


class Image{
    private String name;

    public Image(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}