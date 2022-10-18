package sprint2.uppgift13;

import javax.swing.*;

public class Miniräknare {


    Miniräknare(){
        Kalkylator k = new Kalkylator();
        String input = JOptionPane.showInputDialog("Skriv in tal");
        if(k.isValid(input)){
            JOptionPane.showMessageDialog(null, k.Calculate(input));
        }
        else JOptionPane.showMessageDialog(null, "Inmatning ej godkänd.");




    }
    public static void main(String[] args) {
        Miniräknare m = new Miniräknare();
    }
}
