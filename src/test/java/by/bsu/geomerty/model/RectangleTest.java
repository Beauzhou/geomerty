package by.bsu.geomerty.model;

import bsu.by.geomerty.model.Circle;
import bsu.by.geomerty.model.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testAreaPositive() {
        Rectangle rectangle = new Rectangle(1, 2, 3,4);
        double area = rectangle.calculateArea();
        Assert.assertEquals(1.0, area, 0.01);
    }
    @Test
    public void testAreaNegative() {
        Rectangle rectangle = new Rectangle(100, 200, 100,200);
        double area = rectangle.calculateArea();
        Assert.assertEquals(10000.0, area, 0.01);
    }

    @Test
    public void testPerimeterPositive() {
        Rectangle rectangle = new Rectangle(1, 2, 3,4);
        double perimeter = rectangle.calculatePerimeter();
        Assert.assertEquals(4.0, perimeter, 0.01);
    }
    @Test
    public void testPerimeterNegative() {
        Rectangle rectangle = new Rectangle(100, 200, 300,400);
        double perimeter = rectangle.calculatePerimeter();
        Assert.assertEquals(400.0, perimeter, 0.01);
    }
}