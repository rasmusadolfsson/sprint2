package sprint2.uppgift9;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PersonList {

    public List<Person> createPerson(){
        Path read = Paths.get("src/sprint2/uppgift9/personuppgifter.txt");
        List<Person> listToReturn = new ArrayList<>();
        String input1, input2;

        try(BufferedReader br = Files.newBufferedReader(read)){
            while((input1 = br.readLine()) != null){
                input2 = br.readLine();

                String[] stringArray = input1.trim().split(",");
                String[] toIntArray = input2.trim().split(",");
                int[] intArray = getIntArray(toIntArray);

                Person p = new Person(stringArray[0], stringArray[1], stringArray[2], intArray[0], intArray[1], intArray[2]);
                listToReturn.add(p);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return listToReturn;
    }

    public int[] getIntArray(String[] inputArray){
        int[] intArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            intArray[i] = Integer.parseInt(inputArray[i].trim());
        }
        return intArray;
    }

    public List<Person> searchPerson(List<Person> inputList){
        List<Person> outputList = new ArrayList<>();
        for (Person person : inputList) {
            if (person.getHeight() >= 200) {
                outputList.add(person);
            }
        }
        return outputList;
    }

    public void writeList(List<Person> input){
        for (Person person: input) {
            System.out.println(person.getName() + " " + person.getHeight());
        }
    }
}
