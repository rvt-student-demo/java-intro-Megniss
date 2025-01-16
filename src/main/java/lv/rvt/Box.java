package lv.rvt;

public class Box 
{
    private final double width;
    private final double height;
    private final double depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(Box otherBox) {
        this.width = otherBox.width;
        this.height = otherBox.height;
        this.depth = otherBox.depth;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
    public double volume() {
        return width * height * depth;
    }
    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * depth;
    }

    private double sideArea() {
        return height * depth;
    }
    public Box biggerBox() {
        return new Box(width * 1.25, height * 1.25, depth * 1.25);
    }
    public Box smallerBox() {
        return new Box(width * 0.75, height * 0.75, depth * 0.75);
    }
    public boolean nests(Box outsideBox) {
        return this.width < outsideBox.width &&
               this.height < outsideBox.height &&
               this.depth < outsideBox.depth;
    }
    @Override
    public String toString() {
        return "Box: width = " + width + ", height = " + height + ", depth = " + depth +
               ", volume = " + volume() +
               ", face area = " + faceArea() +
               ", top area = " + topArea() +
               ", side area = " + sideArea();
    }
}
