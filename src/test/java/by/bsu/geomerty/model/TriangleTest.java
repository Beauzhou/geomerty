package by.bsu.geomerty.model;

import bsu.by.geomerty.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testArea(){
        Triangle triangle = new Triangle(1,5,4,3,6,6);
        double area = triangle.calculateArea();
        Assert.assertEquals(1.5,area,0.1)
        ;
    }
    @Test
    public void testPerimeter(){
        Triangle triangle = new Triangle(1,5,4,3,6,6);
        double area = triangle.calculatePerimeter();
        Assert.assertEquals(10.2,area,0.1)
        ;
    }
}