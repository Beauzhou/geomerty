package bsu.by.geomerty;

import bsu.by.geomerty.model.Circle;
import bsu.by.geomerty.model.Rectangle;
import bsu.by.geomerty.model.Shape;
import bsu.by.geomerty.model.Triangle;
import bsu.by.geomerty.view.ShapePrinter;

public class Main {

    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Circle circle = new Circle(1,1,1);
        printer.print(circle);

        Rectangle rectangle = new Rectangle(1,2,3,4);
        printer.print(rectangle);

        Triangle triangle = new Triangle(1,4,3,2,5,6);
        printer.print(triangle);
    }
}
