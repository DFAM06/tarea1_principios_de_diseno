public class AreaCalculationFixed {
    public static void main(String[] args) {
        CalculateArea rectangle = new RectangleFixed(4, 3);
        CalculateArea square = new SquareFixed(5);

        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}

abstract class CalculateArea {

    public abstract int calculateArea();
}

class RectangleFixed extends CalculateArea {
    private int width;
    private int height;
    
    public RectangleFixed(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}

class SquareFixed extends CalculateArea {
    private int length;
    
    public SquareFixed(int length){
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return length * length;
    }
}
