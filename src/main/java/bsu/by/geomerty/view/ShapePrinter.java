package bsu.by.geomerty.view;

import bsu.by.geomerty.model.Shape;

public class ShapePrinter {
    public void print(Shape shape){
        System.out.println("Figure is" +shape.getClass().getName());
        System.out.println("Area is" +shape.calculateArea());
        System.out.println("Perimeter is" +shape.calculatePerimeter());
    }
}
