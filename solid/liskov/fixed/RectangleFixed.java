class RectangleFixed extends Shape {
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