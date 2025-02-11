package lv.rvt;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<GeometricShape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Triangle(3, 4, 5));

        for (GeometricShape shape : shapes) {
            shape.displayInfo();
        }
    }
}
