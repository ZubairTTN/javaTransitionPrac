package oops.encapsulation;
//This is Encapsulation
/*  = controlling access to an object's data
Typically, we achieve encapsulation by:
Making the class fields private
Providing public getter/setter methods when outside code needs controlled access. */

class Car {
    private String color;
    private int speed;
    private String brand;
    private int year;
    private String model;

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate(int increment)
    {
        speed += increment;
    }

    public void brake(int decrement)
    {
        speed -= decrement;
        if(speed < 0)
        {
            speed = 0;
        }
    }
}

