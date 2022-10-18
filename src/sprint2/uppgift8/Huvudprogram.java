package sprint2.uppgift8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Huvudprogram {

    public static void main(String[] args) {
        String inputTemp;
        double tempTemp;

        try(BufferedReader br = new BufferedReader(new FileReader("src/sprint2/uppgift8/temperatur.txt"))){
            double maxTemp = 0;
            double minTemp = 1000;
            double avgTemp = 0;
            int counter = 0;

            while((inputTemp = br.readLine()) != null){
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
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
