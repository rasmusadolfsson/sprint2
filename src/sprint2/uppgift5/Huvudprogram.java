package sprint2.uppgift5;
import java.util.InputMismatchException;
import java.util.Scanner;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Huvudprogram {
    public static void main (String[] arg) {
        String indata = showInputDialog("Ange antal dagar, pris per dag samt bilmodell");
        Scanner sc = new Scanner(indata);
        double totPris = 0;
        String bil = null;
        try {
            int antalDagar = sc.nextInt();
            double dagsPris = sc.nextDouble();
            bil = sc.next();
            totPris = dagsPris * antalDagar;
            String s = String.format("Totalt pris för %s: %.2f", bil, totPris);
            showMessageDialog(null, s);
        } catch (InputMismatchException e) {
            System.out.println("Fel input värde!");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Något oväntat gick fel!");
            e.printStackTrace();
        }
    }
}