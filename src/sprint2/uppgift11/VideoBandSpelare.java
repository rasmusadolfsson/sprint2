package sprint2.uppgift11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class VideoBandSpelare {


    public boolean isValid(String input) {
        int inputTime = 0;
        try{
            inputTime = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public boolean fitsOnTape(String used, String fullsize, String start, String end) {
        LocalTime one = LocalTime.parse(start.trim());
        LocalTime two = LocalTime.parse(end.trim());
        Duration programLength = Duration.between(one, two);
        if(usableSpace(used.trim(), fullsize.trim()) <= programLength.toMinutes()){
            return false;
        }
        else return true;
    }



    protected int usableSpace(String used, String fullsize){
        return Integer.parseInt(fullsize) - Integer.parseInt(used);
    }
}
