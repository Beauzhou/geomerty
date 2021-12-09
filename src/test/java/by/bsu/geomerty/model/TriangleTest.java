package by.bsu.geomerty.model;

import bsu.by.geomerty.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testAreaPositive(){
        Triangle triangle = new Triangle(1,5,4,3,6,6);
        double area = triangle.calculateArea();
        Assert.assertEquals(1.5,area,0.1)
        ;
    }
    @Test
    public void testAreaNegative(){
        Triangle triangle = new Triangle(100,500,400,300,600,600);
        double area = triangle.calculateArea();
        Assert.assertEquals(15000,area,0.1)
        ;
    }
    @Test
    public void testPerimeterPositive(){
        Triangle triangle = new Triangle(1,5,4,3,6,6);
        double perimeter = triangle.calculatePerimeter();
        Assert.assertEquals(10.2,perimeter,0.1)
        ;
    }
    @Test
    public void testPerimeterNegative(){
        Triangle triangle = new Triangle(100,500,400,300,600,600);
        double perimeter = triangle.calculatePerimeter();
        Assert.assertEquals(1024.3,perimeter,0.1)
        ;
    }
}