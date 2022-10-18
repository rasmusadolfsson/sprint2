package sprint2.uppgift12;

import java.io.Serializable;

public abstract class Fordon implements Serializable {
    int speed;
    int weigth;

    public void changeSpeed(int newSpeed){
        speed = newSpeed;
    }
    Fordon(int speed, int weigth){
        this.speed = speed;
        this.weigth = weigth;
    }

    //public abstract void printMe();
}
