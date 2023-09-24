import shapes.*;
import ui.Editor;
import util.Shape;

public class Main
{
    public static void main(String[] args) {
        Shape circle = new Circle("Circle");

        Shape quad = new Quad("Quad");

        Shape rectangle = new Rectangle("Rectangle");

        Shape rhombus = new Rhombus("Rhombus");
        
        Shape triangle = new Triangle("Triangle");

        Editor editor = new Editor();
        editor.printNameShape(circle);

        System.out.println("====================");

        editor.printNameShape(quad);

        System.out.println("====================");

        editor.printNameShape(rectangle);

        System.out.println("====================");

        editor.printNameShape(rhombus);

        System.out.println("====================");

        editor.printNameShape(triangle);

    }
}
