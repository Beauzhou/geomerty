package bsu.by.geomerty.model;

public class Triangle implements Shape {
    private double x1,x2,x3;
    private double y1,y2,y3;
    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }
    public double calculatePerimeter(){
        double sideLength1 = 0;
        double sideLength2 = 0;
        double sideLength3 = 0;
        double triangleWeeklength = 0;
        sideLength1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        sideLength2 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        sideLength3 = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        return sideLength1+sideLength2+sideLength3 ;
    }
    public double calculateArea(){
        double sideLength1 = 0;
        double sideLength2 = 0;
        double sideLength3 = 0;
        double triangleArea = 0;
        double p = 0;
        sideLength1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        sideLength2 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        sideLength3 = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        p= (sideLength1+sideLength2+sideLength3)/2;
        return Math.sqrt(p*(p-sideLength1)*(p-sideLength2)*(p-sideLength3)) ;
    }
}
