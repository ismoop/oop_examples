package polymorphism;

import inheritance.Circle;
import inheritance.Rectangle;
import inheritance.SimpleGeometricObject;

public class TestCircle {
    public static void main(String[] args) {
        SimpleGeometricObject object = new Circle();

            //object.getDiameter();
        ((Circle) object).getDiameter();
    }
}