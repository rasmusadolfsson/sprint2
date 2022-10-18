import org.testng.annotations.Test;
import sprint2.uppgift1.Triangle;

public class TriangleTest {

    Triangle t = new Triangle(12, 7);

    @Test
    public void getArea(){
        assert (t.getArea() == 42);
        assert (t.getArea() != 19);
    }

    @Test
    public void getCircumference(){
        assert (t.getCircumference() == 31);
        assert (t.getCircumference() != 26);
    }
}
