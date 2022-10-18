package sprint2.uppgift2;

import javax.swing.*;

public class Huvudprogram {
    public static void main(String[] args) {

        FuelEconomy fe = new FuelEconomy();

        String oldMile = JOptionPane.showInputDialog("Skriv in antal gammla mil: ");
        String newMile = JOptionPane.showInputDialog("Skriv in antal mil just nu: ");
        String fuelConsumption = JOptionPane.showInputDialog("Skriv in bränsleförbrukningen i liter: ");

        int oldMileInt = Integer.parseInt(oldMile);
        int newMileInt = Integer.parseInt(newMile);
        int fuelConsumptionInt = Integer.parseInt(fuelConsumption);

        int mileDriven = fe.DistanceDriven(oldMileInt, newMileInt);
        double litrePerMile = fe.LitrePerMile(fuelConsumptionInt, mileDriven);

        JOptionPane.showMessageDialog(null, fe.OutputText(mileDriven, fuelConsumptionInt, litrePerMile));




    }
}
