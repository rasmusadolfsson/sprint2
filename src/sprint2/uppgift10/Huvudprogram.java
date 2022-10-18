package sprint2.uppgift10;

import javax.swing.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {
    public static void main(String[] args) {

        DatumOchTid dt = new DatumOchTid();

        String input = JOptionPane.showInputDialog("Ange tidszon: ");
        boolean isValid = dt.checkIfValid(input);
        if (isValid){
            JOptionPane.showMessageDialog(null, dt.getTimeInZone(input));
        }
        else JOptionPane.showMessageDialog(null, "Tidszonen finns inte!");








        /*
        List<ZoneId> zoneList = new ArrayList<>();
        Instant i = Instant.now();
        ZoneId toronto = ZoneId.of("America/Toronto");
        ZoneId stockholm = ZoneId.of("Europe/Stockholm");
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId shanghai = ZoneId.of("Asia/Shanghai");
        zoneList.add(toronto);
        zoneList.add(stockholm);
        zoneList.add(london);
        zoneList.add(shanghai);

        String input = JOptionPane.showInputDialog("Skriv stad: ");
        for(ZoneId z: zoneList){
            if(input.trim().toUpperCase().equals(z.)){
                ZonedDateTime tempZone = i.atZone(z);
                JOptionPane.showMessageDialog(null, tempZone.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            }
            else JOptionPane.showMessageDialog(null, "Staden finns inte i programmet!");
        }

         */
    }
}
