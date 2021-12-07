package bsu.by.geomerty.model;

public class Circle implements Shape {
    private double x;
    private double y;
    private double radius;

    public Circle(double x,double y,double radious){
        this.x=x;
        this.y=y;
        this.radius=radious;
    }
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
