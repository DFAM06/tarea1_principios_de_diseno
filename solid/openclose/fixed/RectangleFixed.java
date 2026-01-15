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
