package sprint2.inlämning2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MembershipMethods {


    public List<GymClient> createListOfClients(){
        Path readPath = Paths.get("src/sprint2/inlämning2/gymklienter.txt");
        List<GymClient> listToReturn = new ArrayList<>();
        String input1, input2;

        try(BufferedReader br = Files.newBufferedReader(readPath)){
            while((input1 = br.readLine()) != null){
                input2 = br.readLine();

                String[] stringArray = input1.trim().split(",");
                long longer = Long.parseLong(stringArray[0].trim());
                String date = input2.trim();

                GymClient p = new GymClient(stringArray[1].trim(), longer, date);
                listToReturn.add(p);
            }
        }
        catch(IOException e){
            System.out.println("Textfilen finns inte!");
            e.printStackTrace();
        }
        return listToReturn;
    }

    public boolean personIsMember(List<GymClient> inputList, String searchInput){
        String inputString = searchInput.trim();
        boolean nameIsValid = checkNameValid(inputString);
        boolean numberIsValid = checkNumberValid(inputString);
        boolean isMember = false;
        if(nameIsValid && !numberIsValid){
            for (GymClient gymClient: inputList) {
                if (gymClient.getName().trim().equals(inputString)) {
                    isMember = checkMembershipDate(gymClient.getMembershipDate());
                    if(isMember){
                        lastTrained(gymClient);
                    }
                }
            }
        }
        if(numberIsValid && !nameIsValid){
            long temp = Long.parseLong(inputString);
            for(GymClient gymClient: inputList){
                if(temp == gymClient.getPersonNumber()){
                    isMember = checkMembershipDate(gymClient.getMembershipDate());
                    if(isMember){
                        lastTrained(gymClient);
                    }
                }
            }
        }
        return isMember;
    }

    public boolean personIsOldMember(List<GymClient> inputList, String searchInput){
        String inputString = searchInput.trim();
        boolean nameIsValid = checkNameValid(searchInput);
        boolean numberIsValid = checkNumberValid(searchInput);
        boolean isOldMember = false;
        if(nameIsValid){
            for(GymClient gymClient: inputList){
                if(gymClient.getName().trim().equals(inputString)){
                    isOldMember = true;
                    break;
                }
            }
        }
        if(numberIsValid){
            long temp = Long.parseLong(inputString);
            for(GymClient gymClient: inputList){
                if(gymClient.getPersonNumber() == temp){
                    isOldMember = true;
                    break;
                }
            }
        }
        return isOldMember;
    }

    public void lastTrained(GymClient inputClient){
        Path writePath = Paths.get("src/sprint2/inlämning2/träningsschema.txt");
        LocalDate date1 = LocalDate.now();
        String date2 =  date1.toString();

        if(!Files.exists(writePath)){
            try{
                Files.createFile(writePath);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(writePath.toFile(), true))){
            String line1 = inputClient.getPersonNumber() + ", " + inputClient.name;
            bw.write(line1);
            bw.write(", ");
            bw.write(date2);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Kunde inte skapa eller skriva till textfil!");
            e.printStackTrace();
        }
    }


    public boolean checkMembershipDate(String input){
        boolean testIsRunning = false;
        LocalDate dateToday;
        if(true){
            dateToday = LocalDate.of(2022, 10, 18);
        }
        else  dateToday = LocalDate.now();

        LocalDate memberDate = LocalDate.parse(input);
        if(dateToday.isAfter(memberDate.plusYears(1))){
            return false;
        }
        else return true;
    }


    public boolean checkNameValid(String input) {
        boolean isValid = true;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                isValid = false;
            }
        }
        return isValid;
    }

    public boolean checkNumberValid(String input) {
        boolean isValid = true;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                isValid = false;
            }
        }
        return isValid;
    }
}
