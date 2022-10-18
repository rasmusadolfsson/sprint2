package sprint2.uppgift12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialize {

    deserialize(){

        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src/sprint2/uppgift12/storagefolder/storage.ser"))){


            Object o = ois.readObject();
            if(o instanceof Fordon){
                System.out.println(((Fordon) o).speed);
            }

        }
        catch(IOException e){
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        deserialize d = new deserialize();

    }
}
