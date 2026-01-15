public class AreaCalculationFixed {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(4,6);
        Shape square = new Square(5);

        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
