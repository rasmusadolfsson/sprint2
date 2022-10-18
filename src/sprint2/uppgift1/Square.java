package sprint2.uppgift1;

public class Square implements Figure{
    protected int length;
    protected int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getCircumference() {
        return (length * 2) + (width * 2);
    }
}
