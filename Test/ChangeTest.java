import org.testng.annotations.Test;
import sprint2.uppgift6.Exchange;

public class ChangeTest {

    Exchange ex = new Exchange();

    @Test
    public void exchangeTest(){
        System.out.println(ex.getExchange(1575, 2000));
        assert (ex.getExchange(1575, 2000).equals ("Tusen: "+0+"\nFemhundra: "+0+"\nTvåhundra: "+2+"\nHundra: "+0+"\nFemtio: "+0+"\nTjugo: "+1+"\nTior: "+0+
                "\nFemor: "+1+"\nTvåor: "+0+"\nEnkronor: "+0));
    }

    @Test
    public void PaymentTest(){
        assert (ex.getExchange(3000, 2000).equals("Du lämnade för lite pengar"));
        assert (ex.getExchange(2000,2000).equals("Det blev ingen växel"));
    }
}
