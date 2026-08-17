package innerClasses.memberInnerClass;

public class Car {
    private String model;
    private boolean isEngineOn;

//    Constructor
    public Car(String model)
    {
        this.model = model;
        this.isEngineOn = false;
    }

//    here the access modifier of the Engine class is default i.e package-private
    class Engine{
        void start()
        {
            if(!isEngineOn)
            {
                isEngineOn = true;
                System.out.println(model + " engine is started ");
            }
            else{
                System.out.println(model + " Engine is already started");
            }
        }

        void stop()
        {
            if(isEngineOn)
            {
                isEngineOn = false;
                System.out.println(model + " engine is stopped ");
            }
            else {
                System.out.println(model + " Engine is already stopped ");
            }
        }
    }
}
