public class RectangleShape extends Shape {
    private double width = 1.0, height = 1.0;

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public RectangleShape() {

    }

    public RectangleShape(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public RectangleShape(String color, boolean filled) {
        super(color, filled);
    }

    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "A rectangle with width = " + width + ", and height = " + height + ", which is a subclass of "
                + super.toString();
    }
}
