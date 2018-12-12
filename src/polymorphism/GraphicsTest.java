package polymorphism;

import inheritance.Circle;
import inheritance.Rectangle;
import inheritance.SimpleGeometricObject;

class Graphics {
    public void draw(SimpleGeometricObject object) {

        object.draw();
    }
}
public class GraphicsTest {

    public static void main(String args[]){
        Graphics graphics = new Graphics();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        graphics.draw(circle);
        graphics.draw(rectangle);
    }
}