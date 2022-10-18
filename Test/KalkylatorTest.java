import org.testng.annotations.Test;
import sprint2.uppgift13.Kalkylator;

public class KalkylatorTest {

    Kalkylator k = new Kalkylator();



    @Test
    public void isValidTest(){
        assert (k.isValid("5+ 4"));
        assert (!k.isValid("5+"));
        assert (k.isValid("-3--3"));
        assert (!k.isValid("*55**44"));
    }


    @Test
    public void CalculateTest(){
        assert (k.Calculate("5 +3") == 8);
        System.out.println(k.Calculate("-5-7"));
        assert (k.Calculate("-5-7") == -12);
        assert (k.Calculate("5*5") == 25);
    }
}
