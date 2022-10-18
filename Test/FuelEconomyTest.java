import org.testng.Assert;
import org.testng.annotations.Test;
import sprint2.uppgift2.FuelEconomy;

public class FuelEconomyTest {

    FuelEconomy d = new FuelEconomy();

    @Test
    public void DistanceTest(){
        assert(d.DistanceDriven(1356, 2336) == 980);
        assert(d.DistanceDriven(1356, 2336) != 1980);
        assert(d.DistanceDriven(758, 794) == 36);
    }

    @Test
    public void FuelPerMetricMileTest(){
        assert(d.LitrePerMile(26, 238) == 9.15);
        assert(d.LitrePerMile(26, 238) != 0.15);
        assert(d.LitrePerMile(314, 17038) == 54.26);
    }

    @Test
    public void OutputTest(){
        int distance = d.DistanceDriven(1356, 2336);
        double fuelPerMile = d.LitrePerMile(26, distance);
        String output = "Antal körda mil: "+distance+"\nAntal liter bensin: "+26+"\nFörbrukning per mil: "+fuelPerMile;
        assert (output.equals(d.OutputText(distance, 26, fuelPerMile)));
    }
}