package sprint2.uppgift2;

public class FuelEconomy {
    public int DistanceDriven(int value1, int value2){
        if(value1 > value2){
            return value1 - value2;
        }
        else return value2 - value1;
    }

    public double LitrePerMile(double fuel, double distance){
        return Math.round((distance / fuel) * 100d) / 100d;
    }

    public String OutputText(int input1, int input2, double input3){
        return "Antal körda mil: "+input1+"\nAntal liter bensin: "+input2+"\nFörbrukning per mil: "+input3;
    }
}
