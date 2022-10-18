package sprint2.uppgift11;

import javax.swing.*;

public class Huvudprogram {
    public static void main(String[] args) {
        VideoBandSpelare vbs = new VideoBandSpelare();
        String input1, input2, input3, input4;
        input1 = JOptionPane.showInputDialog("Hur långt är bandet?");
        input2 = JOptionPane.showInputDialog("Hur mycket är användt?");
        input3 = JOptionPane.showInputDialog("När börjar programmet?");
        input4 = JOptionPane.showInputDialog("När slutar programmet?");

        if(vbs.fitsOnTape(input2, input1, input3, input4)){
            JOptionPane.showMessageDialog(null, "Programmet får plats på bandet!");
        }
        else JOptionPane.showMessageDialog(null, "Programmet får inte plats på bandet!");
    }
}
