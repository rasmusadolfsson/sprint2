package sprint2.uppgift9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Huvudprogram {
    Huvudprogram(){
        Path read = Paths.get("src/sprint2/uppgift9/personuppgifter.txt");
        Path write = Paths.get("src/sprint2/uppgift9/långapersoner.txt");
        String temp, temp2, temp3;
        int compare = 0;
        try(BufferedReader br = Files.newBufferedReader(read);
            BufferedWriter bw = Files.newBufferedWriter(write)){
            if(!Files.exists(write)){
                Files.createFile(write);
            }
            while((temp = br.readLine()) != null){
                temp2 = br.readLine();
                temp3 = temp2.substring(temp2.length() -3);
                compare = Integer.parseInt(temp3);
                if(compare >= 200){
                    bw.write(temp);
                    bw.newLine();
                    bw.write(temp2);
                    bw.newLine();
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();
    }
}