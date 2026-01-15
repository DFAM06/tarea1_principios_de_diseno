import java.util.ArrayList;
import java.util.List;

public class ShapeCalculatorFixed {

    public static void main(String[] args){
        List<ShapeFixed> shapes = new ArrayList<>();
        ShapeFixed shapeOne = new CircleFixed(5);
        ShapeFixed shapeTwo = new RectangleFixed(4,8);

        shapes.add(shapeOne);
        shapes.add(shapeTwo);

        System.out.println("Total Area" + calculateTotalArea(shapes));
    }


    private static double calculateTotalArea(List<ShapeFixed> shapes) {
        double totalArea = 0;

        for (ShapeFixed shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}

abstract class ShapeFixed {
    public abstract double getArea();
}

class CircleFixed extends ShapeFixed {
    private double radius;

    public CircleFixed(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

class RectangleFixed extends ShapeFixed {
    private double width;
    private double height;

    public RectangleFixed(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }
}
