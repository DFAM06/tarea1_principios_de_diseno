public class AreaCalculationFixed {
    public static void main(String[] args) {
        Shape rectangle = new RectangleFixed(4, 3);
        Shape square = new SquareFixed(5);

        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
