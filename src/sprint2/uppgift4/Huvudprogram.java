package sprint2.uppgift4;

import javax.swing.*;
import java.util.Scanner;

public class Huvudprogram {
    public static void main(String[] args) {

        FuelEconomy fe = new FuelEconomy();
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv in antal gammla mil: ");
        String oldMile = sc.nextLine();
        System.out.println("Skriv in antal mil just nu: ");
        String newMile = sc.nextLine();
        System.out.println("Skriv in bränsleförbrukningen i liter: ");
        String fuelConsumption = sc.nextLine();

        int oldMileInt = Integer.parseInt(oldMile);
        int newMileInt = Integer.parseInt(newMile);
        int fuelConsumptionInt = Integer.parseInt(fuelConsumption);

        int mileDriven = fe.DistanceDriven(oldMileInt, newMileInt);
        double litrePerMile = fe.LitrePerMile(fuelConsumptionInt, mileDriven);

        System.out.println(fe.OutputText(mileDriven, fuelConsumptionInt, litrePerMile));




    }
}
