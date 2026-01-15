import java.util.ArrayList;
import java.util.List;

public class ShapeCalculatorFixed {

    public static void main(String[] args){
        List<ShapeFixed> shapes = new ArrayList<>();
        ShapeFixed shapeOne = new CircleFixed(5);
        ShapeFixed shapeTwo = new RectangleFixed(4,8);

        shapes.add(shapeOne);
        shapes.add(shapeTwo);

        System.out.println("Total Area: " + calculateTotalArea(shapes));
    }


    private static double calculateTotalArea(List<ShapeFixed> shapes) {
        double totalArea = 0;

        for (ShapeFixed shape : shapes) {
            totalArea += shape.getArea();
        }

        return totalArea;
    }
}





