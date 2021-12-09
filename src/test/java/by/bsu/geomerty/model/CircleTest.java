package by.bsu.geomerty.model;

import bsu.by.geomerty.model.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testAreaPositive(){
        Circle circle = new Circle(1,1,1);
        double area = circle.calculateArea();
        Assert.assertEquals(3.14,area,0.01);
        }
    @Test
    public void testAreaNegative(){
        Circle circle = new Circle(0,1,1);
        double area = circle.calculateArea();
        Assert.assertEquals(3.14,area,0.01);
    }
    @Test
    public void testPerimeterNegative(){
        Circle circle = new Circle(0,1,1);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(6.28,perimeter,0.01);
    }
    @Test
    public void testPerimeterPositive(){
        Circle circle = new Circle(1,1,1);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(6.28,perimeter,0.01);
    }

}

