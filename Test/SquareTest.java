import org.testng.annotations.Test;
import sprint2.uppgift1.Square;

public class SquareTest {

    Square s = new Square(9, 7);

    @Test
    public void getAreaTest(){
        assert(s.getArea() == 63);
        assert(s.getArea() != 16);
    }

    @Test
    public void getCircumferenceTest(){
        assert(s.getCircumference() == 32);
        assert(s.getCircumference() != 63);
    }
}
