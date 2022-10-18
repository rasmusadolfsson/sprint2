package sprint2.uppgift8;

import java.io.*;
import java.util.Scanner;

public class Huvudprogram8b {

    public static void main(String[] args) {
        String inputTemp;
        double tempTemp;

        File file = new File("src/sprint2/uppgift8/temperatur.txt");

        try(Scanner sc = new Scanner(file)){
            double maxTemp = 0;
            double minTemp = 1000;
            double avgTemp = 0;
            int counter = 0;

            while(sc.hasNext()){
                inputTemp = sc.nextLine();
                tempTemp = Double.parseDouble(inputTemp.replace(',','.'));
                avgTemp += tempTemp;
                counter++;
                if(tempTemp > maxTemp){
                    maxTemp = tempTemp;
                }
                if(tempTemp < minTemp){
                    minTemp = tempTemp;
                }
            }

            System.out.println("Max temperatur: "+maxTemp+"\nMin temperatur: "+minTemp+"\nMedeltemperaturen: "+avgTemp/counter);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}