package sprint2.uppgift12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class uppgift2a {

    uppgift2a(){
        Fordon car = new Bil(50, 2300, 6, 4);
        Fordon boat = new Båt(27, 9800, 2000);
        Fordon train = new Tåg(270, 12400, 5);
        Fordon bike = new Cykel(13, 32, 14, 11);



        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/sprint2/uppgift12/storagefolder/storage.ser"))){

            oos.writeObject(car);
            oos.writeObject(boat);
            oos.writeObject(train);
            oos.writeObject(bike);


        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        uppgift2a u = new uppgift2a();





    }
}
