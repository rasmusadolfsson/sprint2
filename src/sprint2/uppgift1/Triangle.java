package sprint2.uppgift1;

public class Triangle implements Figure{

    protected int height;
    protected int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (height * width) / 2;
    }

    @Override
    public double getCircumference() {
        return (height * 2) + width;
    }
}
