package lv.rvt;

class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    void displayInfo() {
        System.out.println("Circle - Radius: " + radius + ", Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}

