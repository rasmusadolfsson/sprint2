package sprint2.uppgift10;

import javax.swing.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DatumOchTid {
    String[] cityArray = new String[]{"STOCKHOLM", "LONDON", "TORONTO", "SHANGHAI"};

    public boolean checkIfValid(String input){
        for (String s: cityArray) {
            if(input.trim().toUpperCase().equals(s)){
                return true;
            }
        }
        return false;
    }


    public String getTimeInZone(String input){
        Instant i = Instant.now();
        ZoneId toronto = ZoneId.of("America/Toronto");
        ZoneId stockholm = ZoneId.of("Europe/Stockholm");
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId shanghai = ZoneId.of("Asia/Shanghai");
        switch (input.trim().toUpperCase()) {
            case "STOCKHOLM" -> {
                ZonedDateTime tempZone = i.atZone(stockholm);
                return tempZone.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            }
            case "LONDON" -> {
                ZonedDateTime tempZone = i.atZone(london);
                return tempZone.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            }
            case "TORONTO" -> {
                ZonedDateTime tempZone = i.atZone(toronto);
                return tempZone.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            }
            case "SHANGHAI" -> {
                ZonedDateTime tempZone = i.atZone(shanghai);
                return tempZone.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            }
            default -> {
                return "Time zone doesn't exist!";
            }
        }
    }
}
