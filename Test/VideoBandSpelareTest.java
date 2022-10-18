import org.testng.annotations.Test;
import sprint2.uppgift11.VideoBandSpelare;

public class VideoBandSpelareTest {

    VideoBandSpelare vbs = new VideoBandSpelare();


    @Test
    public void isValidTest(){
        assert (!vbs.isValid("korv"));
        assert (vbs.isValid("30"));
    }

    @Test
    public void fitsOnTapeTest(){
        assert (vbs.fitsOnTape("15", "60", "22:30", "23:00"));
        assert (!vbs.fitsOnTape("100", "120", "06:30", "07:00"));
    }
}
