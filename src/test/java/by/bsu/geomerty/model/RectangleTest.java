package by.bsu.geomerty.model;

import bsu.by.geomerty.model.Circle;
import bsu.by.geomerty.model.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(1, 2, 3,4);
        double area = rectangle.calculateArea();
        Assert.assertEquals(1.0, area, 0.01);
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(1, 2, 3,4);
        double perimeter = rectangle.calculatePerimeter();
        Assert.assertEquals(4.0, perimeter, 0.01);
    }
}