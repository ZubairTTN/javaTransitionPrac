package innerClasses.staticInnerClass.computerEgWithoutStaticInnerClassUse;

public class Computer {
    private String model;
    private String brand;
    private OperatingSystem os;


    String getBrand()
    {
        return this.brand;
    }

    String getModel()
    {
        return this.model;
    }

    String getOsName()
    {
        return os.osName;
    }

    void displayInfo()
    {
        System.out.println("Model: " + model + " of brand: " + brand + " is having os: " + os.getOsName());
    }

    public Computer(String brand, String model, String osName)
    {
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(osName);
        /*
        Computer object
┌─────────────────────────┐
│ brand = "Acer"          │
│ model = "Nitro 5"       │
│                         │
│ os ───────────────┐     │
└───────────────────│─────┘
                    ↓
            OperatingSystem object
            ┌─────────────────────┐
            │ osName = "Windows"  │
            └─────────────────────┘ */

        /* Computer object
       │
       ├── brand → "Acer"
       ├── model → "Nitro 5"
       │
       └── os ─────────→ OperatingSystem object
                            │
                            └── osName → "Windows" */
    }

    class OperatingSystem{
        String osName;
        String getOsName()
        {
            return this.osName;
        }

        public OperatingSystem(String osName)
        {
            this.osName = osName;
        }
    }
}

class Main{
    public static void main(String[] args) {
        Computer computer = new Computer("Acer", "Nitro 5", "Windows");
        computer.displayInfo();
        System.out.println(computer.getModel());
        System.out.println(computer.getBrand());
//        Computer.OperatingSystem os = computer.new OperatingSystem("Linux");
        System.out.println(computer.getOsName());
//        System.out.println(os.getOsName());
//        System.out.println(computer.os.getOsName());
    }
}

