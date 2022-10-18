package sprint2.uppgift1;

public class Circle implements Figure{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round((Math.PI * Math.pow(radius, 2)) * 100d) / 100d;
    }

    @Override
    public double getCircumference() {
        return Math.round((2 * Math.PI * radius) * 100d) / 100d;
    }
}
