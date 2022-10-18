import org.testng.annotations.Test;
import sprint2.uppgift1.Circle;

public class CircleTest {

    Circle c = new Circle(13);

    @Test
    public void getAreaTest(){
        System.out.println(c.getArea());
        assert(c.getArea() == 530.93);
        assert(c.getArea() != 14);
    }
    @Test
    public void getCircumferenceTest(){
        System.out.println(c.getCircumference());
        assert(c.getCircumference() == 81.68);
        assert(c.getCircumference() != 8);
    }
}
