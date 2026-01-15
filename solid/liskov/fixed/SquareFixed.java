class SquareFixed extends Shape {
    private int length;
    
    public SquareFixed(int length){
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return length * length;
    }
}