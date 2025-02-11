package lv.rvt;

class Triangle extends GeometricShape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    void displayInfo() {
        System.out.println("Triangle - Sides: " + a + ", " + b + ", " + c + ", Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}
