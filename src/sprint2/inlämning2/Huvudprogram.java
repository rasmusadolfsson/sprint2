package sprint2.inlämning2;

import javax.swing.*;

public class Huvudprogram {

    Huvudprogram(){

        MembershipMethods t = new MembershipMethods();
        String input = JOptionPane.showInputDialog("Skriv in namn eller personnummer: ");

        if(t.personIsMember(t.createListOfClients(), input)){
            JOptionPane.showMessageDialog(null, "Välkommen in!");
        }
        else if(t.personIsOldMember(t.createListOfClients(), input)){
            JOptionPane.showMessageDialog(null, "Ditt medlemskap har gått ut!");
        }
        else JOptionPane.showMessageDialog(null, "Du är inte medlem!");


    }
    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();
    }
}
