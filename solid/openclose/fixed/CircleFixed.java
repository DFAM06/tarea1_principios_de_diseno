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