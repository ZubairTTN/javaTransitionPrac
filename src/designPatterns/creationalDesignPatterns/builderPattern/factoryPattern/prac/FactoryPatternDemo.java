package designPatterns.creationalDesignPatterns.builderPattern.factoryPattern.prac;

class ShapeFactory {
//    Factory Method
    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
        {
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle"))
        {
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
            
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else{
            return null;
        }
    }
}

public class FactoryPatternDemo{
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();
        Shape shape4 = shapeFactory.getShape("Triangle");
        shape4.draw();
    }
}
